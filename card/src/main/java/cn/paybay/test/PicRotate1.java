package cn.paybay.test;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import cn.paybay.card.image.ImageUtils;

public class PicRotate1 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\shang\\Desktop\\2016_12\\IMG_6853.JPG";

		File f = new File(path);
		ImageUtils.fromFile(f)
			.scale(1)
			.rotate(270)		//旋转角度
			.quality(0.6f)
			.bgcolor(Color.BLACK)
			.toFile(new File("C:\\Users\\shang\\Desktop\\2016_12\\IMG_6853-2.JPG"));
	}

	

}
