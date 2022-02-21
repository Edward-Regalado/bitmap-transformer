package bitmap.transformer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Bitmap {
    String input;
    String name;
    String output;

    public Bitmap (String name){
        this.name = name;

    }

    public String toString()
    {
        return  "Img{" + "input=" + input + ", name=" + name + ", output=" + output + "}";
    }

    public void grayScale (BufferedImage img) throws IOException {

        String outputPath;
        Scanner filePath = new Scanner(System.in);
        int width = img.getWidth();
        int height = img.getHeight();
        for (int i = 0; i < width ; i++) {
            for (int j = 0; j < height; j++){
                Color color = new Color (img.getRGB(i, j));
                int red = (int)(color.getRed() * 0.3);
                int green = (int)(color.getGreen() * 0.6) ;
                int blue = (int)(color.getBlue() * 0.1) ;
                Color newColors =  new Color (red+green+blue, red+green+blue, red+green+blue);
                img.setRGB(i, j, newColors.getRGB());
            }
        }
        System.out.println("Please enter a filename for your grayScale image");
        outputPath = filePath.nextLine();
        String fileName = "app/src/main/assets/"+ outputPath + ".bmp";
        ImageIO.write( img, "bmp" , new  File(fileName));

    }
    public void darken (BufferedImage img, double percentage) throws IOException {

        String outputPath;
        Scanner filePath = new Scanner(System.in);
        int width = img.getWidth();
        int height = img.getHeight();
        WritableRaster wr = img.getRaster();
        int[] pixel = new int[4];

        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                wr.getPixel(i, j, pixel);
                pixel[0] = (int) (pixel[0] * percentage);
                pixel[1] = (int) (pixel[1] * percentage);
                pixel[2] = (int) (pixel[2] * percentage);
                wr.setPixel(i, j, pixel);
            }
        }
        System.out.println("Please enter a filename for your dark image");
        outputPath = filePath.nextLine();
        String fileName = "app/src/main/assets/"+ outputPath + ".bmp";
        ImageIO.write(img, "bmp", new File(fileName));
    }


    public void resizeImage (BufferedImage img, double scaleSize) throws IOException {
        String outputPath;
        Scanner filePath = new Scanner(System.in);

        int width = (int)(img.getWidth() * scaleSize);
        int height = (int)(img.getHeight() * scaleSize);

        Graphics2D g2d = img.createGraphics();
        g2d.drawImage(img, 0, 0, width, height, null);
        g2d.dispose();

        System.out.println("Please enter a filename for you resized image");
        outputPath = filePath.nextLine();
        String fileName = "app/src/main/assets/"+ outputPath + ".bmp";
        ImageIO.write(img, "bmp", new File(fileName));
    }
}




