package cn.paybay.card;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cn.paybay.card.image.ImageUtils;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model, HttpSession session) {
		logger.info("session id is :" + session.getId());
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "demo";
	}

	/**
	 * upload image and return the image url
	 * 
	 * @return
	 * @throws IOException
	 * @throws IllegalStateException
	 */
	@RequestMapping(value = "/image", method = RequestMethod.POST)
	@ResponseBody
	public String uploadImage(HttpServletRequest request,
			HttpServletResponse response, HttpSession session,
			@RequestParam(value = "file", required = true) MultipartFile file)
			throws IllegalStateException, IOException {
		String path = session.getServletContext().getRealPath("/resources/upload");
		System.out.println("real path: " + path);
		//服务器保存文件名称
		String fileName = new Date().getTime() + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		//旋转、压缩后图片名称
		String retFileName =  new Date().getTime() + "-01" + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		System.out.println("file name: " + fileName);
		File targetFile = new File(path, fileName);
		File retFile = new File(path, retFileName);
		if (!targetFile.exists()) {
			targetFile.mkdirs();
		}
		file.transferTo(targetFile);
		
		int ret = ImageUtils.getOrientation(targetFile);
		switch (ret) {
		case 0:
			ImageUtils.CompressJPEGFile(targetFile, retFile, 0.6f);
			break;
		case 1:
			ImageUtils.CompressJPEGFile(targetFile, retFile, 0.6f);
			break;
		case 3:
			ImageUtils.fromFile(targetFile)
			.scale(1)
			.rotate(180)		//旋转角度
			.quality(0.6f)
			.bgcolor(Color.BLACK)
			.toFile(retFile);
			break;
		case 6:
			ImageUtils.fromFile(targetFile)
			.scale(1)
			.rotate(90)		//旋转角度
			.quality(0.6f)
			.bgcolor(Color.BLACK)
			.toFile(retFile);
			break;
		case 8:
			ImageUtils.fromFile(targetFile)
			.scale(1)
			.rotate(270)		//旋转角度
			.quality(0.6f)
			.bgcolor(Color.BLACK)
			.toFile(retFile);
			break;
		default:
			ImageUtils.CompressJPEGFile(targetFile, retFile, 0.6f);
			break;
		}
		String fileUrl = "http://192.168.10.82/card/resources/upload/" + retFileName;
		return fileUrl;
	}

}
