/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageprocessing;
// Java program to demonstrate creation of random pixel image 
import java.io.File; 
import java.io.IOException; 
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO; 
public class RandomImage 
{ 
    public static void main(String args[])throws IOException 
    { 
        // Image file dimensions 
        int width = 2560, height = 1600; 
  
        // Create buffered image object 
        BufferedImage img = null; 
        img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB); 
  
        // file object 
        File f = null; 
  
        // create random values pixel by pixel 
        for (int y = 0; y < height; y++) 
        { 
            for (int x = 0; x < width; x++) 
            { 
                int a = (int)(Math.random()*256); //generating 
                int r = (int)(Math.random()*256); //values 
                int g = (int)(Math.random()*256); //less than 
                int b = (int)(Math.random()*256); //256 
  
                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 
  
                img.setRGB(x, y, p); 
            } 
        } 
  
        // write image 
        try
        { 
            f = new File("C:\\Users\\workm\\Pictures\\Saved Pictures\\out.jpg"); 
            ImageIO.write(img, "jpg", f); 
        } 
        catch(IOException e) 
        { 
            System.out.println("Error: " + e); 
        } 
    } 
} 
