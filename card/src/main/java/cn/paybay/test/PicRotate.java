package cn.paybay.test;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PicRotate {

	public static void main(String[] args) throws IOException {
	    String path = "C:\\Users\\shang\\Desktop\\2016_12\\IMG_6850.JPG";  
	    File img = new File(path);  
	    BufferedImage old_img = (BufferedImage)ImageIO.read(img);    
	    int w = old_img.getWidth();  
	    int h = old_img.getHeight();  
	       
	    BufferedImage new_img = new BufferedImage(h,w,BufferedImage.TYPE_INT_BGR);        
	    Graphics2D g2d =new_img.createGraphics();  
	            
	    AffineTransform origXform = g2d.getTransform();  
	    AffineTransform newXform = (AffineTransform)(origXform.clone());  
	    // center of rotation is center of the panel  
	    double xRot = h/2.0;  
	    newXform.rotate(Math.toRadians(90.0), xRot, xRot); //旋转 
	       
	    g2d.setTransform(newXform);   
	    // draw image centered in panel  
	    g2d.drawImage(old_img, 0, 0, null);  
	    // Reset to Original  
	    g2d.setTransform(origXform);  
	    //写到新的文件  
	    FileOutputStream out = new FileOutputStream("C:\\Users\\shang\\Desktop\\2016_12\\IMG_6850-2.JPG");  
	    try{  
	    ImageIO.write(new_img, "JPG", out);  
	    }finally{  
	        out.close();  
	    }  
	}

}
