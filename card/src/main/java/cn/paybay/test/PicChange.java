package cn.paybay.test;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.MetadataException;
import com.drew.metadata.exif.ExifIFD0Directory;
import com.drew.metadata.jpeg.JpegDirectory;

public class PicChange {

	public static void main(String[] args) throws IOException, ImageProcessingException {
		File jpegFile = new File(
				"C:\\Users\\shang\\Desktop\\2016_12\\IMG_6850.JPG");

		Metadata metadata = ImageMetadataReader.readMetadata(jpegFile);
		Directory directory = metadata
				.getFirstDirectoryOfType(ExifIFD0Directory.class);
		JpegDirectory jpegDirectory = (JpegDirectory) metadata
				.getFirstDirectoryOfType(JpegDirectory.class);


		int orientation = 1;
		try {
			orientation = directory.getInt(ExifIFD0Directory.TAG_ORIENTATION);
		} catch (MetadataException me) {
			System.out.println("Could not get orientation");
		}

		System.out.println(orientation);

		BufferedImage src = ImageIO.read(jpegFile);
		BufferedImage des = RotateImage.Rotate(src, 90);
		ImageIO.write(des, "jpg", new File(
				"C:\\Users\\shang\\Desktop\\2016_12\\IMG_6850-1.JPG"));

	}

	public static int getOrientation(String orientation) {
		int tag = 0;
		if ("Top, left side (Horizontal / normal)".equalsIgnoreCase(orientation)) {
			tag = 1;
		} else if ("Top, right side (Mirror horizontal)".equalsIgnoreCase(orientation)) {
			tag = 2;
		} else if ("Bottom, right side (Rotate 180)".equalsIgnoreCase(orientation)) {
			tag = 3;
		} else if ("Bottom, left side (Mirror vertical)".equalsIgnoreCase(orientation)) {
			tag = 4;
		} else if ("Left side, top (Mirror horizontal and rotate 270 CW)".equalsIgnoreCase(orientation)) {
			tag = 5;
		} else if ("Right side, top (Rotate 90 CW)".equalsIgnoreCase(orientation)) {
			tag = 6;
		} else if ("Right side, bottom (Mirror horizontal and rotate 90 CW)".equalsIgnoreCase(orientation)) {
			tag = 7;
		} else if ("Left side, bottom (Rotate 270 CW)".equalsIgnoreCase(orientation)) {
			tag = 8;
		}
		return tag;
	}
}
