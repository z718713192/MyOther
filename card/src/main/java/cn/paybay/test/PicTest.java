package cn.paybay.test;

import java.io.File;
import java.util.Iterator;

import com.drew.imaging.jpeg.JpegMetadataReader;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;
import com.drew.metadata.exif.ExifIFD0Directory;

public class PicTest {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\shang\\Desktop\\2016_12\\IMG_6850-2.JPG");
			Metadata metadata = JpegMetadataReader.readMetadata(file);

			Directory exif = metadata
					.getFirstDirectoryOfType(ExifIFD0Directory.class);
			if (null != exif) {
				Iterator<Tag> iterator = exif.getTags().iterator();
				while (iterator.hasNext()) {
					Tag tag = iterator.next();
					System.out.println(tag);
				}
				if (exif.containsTag(ExifIFD0Directory.TAG_ORIENTATION)) {
					System.out.println(exif.getInt(ExifIFD0Directory.TAG_ORIENTATION) + "="
							+ exif.getDescription(ExifIFD0Directory.TAG_ORIENTATION));
				}
			}else{
				System.out.println("exif is null");
			}
//			System.out.println("-----------------------1---------------------");
//			Directory exif2 = metadata
//					.getFirstDirectoryOfType(ExifSubIFDDirectory.class);
//			if (null != exif2) {
//				Iterator<Tag> iterator2 = exif2.getTags().iterator();
//				while (iterator2.hasNext()) {
//					Tag tag2 = iterator2.next();
//
//					System.out.println(tag2);
//				}
//			}

//			System.out.println("-----------------------2---------------------");
//			Directory exif3 = metadata
//					.getFirstDirectoryOfType(ExifInteropDirectory.class);
//			if (null != exif3) {
//				Iterator<Tag> iterator3 = exif3.getTags().iterator();
//				while (iterator3.hasNext()) {
//					Tag tag3 = iterator3.next();
//					System.out.println(tag3);
//				}
//			}
//
//			System.out.println("------------------------3--------------------");
//			Directory exif4 = metadata
//					.getFirstDirectoryOfType(ExifThumbnailDirectory.class);
//			if (null != exif4) {
//				Iterator<Tag> iterator4 = exif4.getTags().iterator();
//				while (iterator4.hasNext()) {
//					Tag tag4 = iterator4.next();
//					System.out.println(tag4);
//				}
//			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
