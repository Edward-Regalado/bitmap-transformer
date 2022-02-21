package bitmap.transformer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {

        String imagePath = "app/src/main/assets/baldy-8bit.bmp";

        BufferedImage img1 = ImageIO.read(new File(imagePath));
        BufferedImage img2 = ImageIO.read(new File(imagePath));
        BufferedImage img3 = ImageIO.read(new File(imagePath));

        Bitmap darkenImage = new Bitmap("darken");
        Bitmap grayImage = new Bitmap("gray");
        Bitmap resize = new Bitmap("resize");

        darkenImage.darken(img1, .2);
        grayImage.grayScale(img2);
        resize.resizeImage(img3, .5);
    }
}
