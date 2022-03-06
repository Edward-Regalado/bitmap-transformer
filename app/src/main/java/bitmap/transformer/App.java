package bitmap.transformer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {

        String imagePath = args[0];
        String outPutPath = args[1];
        String fileName = args[2];


        //String imagePath = "app/src/main/assets/baldy-8bit.bmp";
        //String outPutPath = "app/src/main/assets/"

        BufferedImage img1 = ImageIO.read(new File(imagePath));
        BufferedImage img2 = ImageIO.read(new File(imagePath));
        BufferedImage img3 = ImageIO.read(new File(imagePath));

        Bitmap darkenImage = new Bitmap("darken");
        Bitmap grayImage = new Bitmap("gray");
        Bitmap resize = new Bitmap("resize");

        darkenImage.darken(img1, outPutPath, fileName, .2);
        grayImage.grayScale(img2, outPutPath, fileName);
        resize.resizeImage(img3,outPutPath, fileName, .5);
    }
}
