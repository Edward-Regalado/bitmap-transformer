package bitmap.transformer;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class Bitmap {
    String input;
    String name;
    String output;

    public Bitmap (String input, String name, String output){
        //Constructor
        this.input = input;
        this.name = name;
        this.output = output;

        // Input file path
        // Filename
        // Output file path
        // Field Properties

    }

    public String toString()
    {
        return  "Img{" + "input=" + input + ", name=" + name + ", output=" + output + "}";
    }

    public void method1 () {
//        BufferedImage img = ImageIO.read(new File("/Users/joshuamccluskey/projects/courses/401/java-fundamentals/bitmap-transformer/app/src/main/assets/baldy-8bit.bmp"));

//        ImageIO.write( img, "bmp" , new File("/Users/joshuamccluskey/projects/courses/401/java-fundamentals/bitmap-transformer/app/src/main/assets/copy-baldy-8bit.bmp"));

    }
    public void method2 () {

//        ImageIO.write( img, "bmp" , new  File("/Users/joshuamccluskey/projects/courses/401/java-fundamentals/bitmap-transformer/app/src/main/assets/copy-baldy-8bit.bmp"));

    }
    public void method3 () {

//        ImageIO.write( img, "bmp" , new  File("/Users/joshuamccluskey/projects/courses/401/java-fundamentals/bitmap-transformer/app/src/main/assets/copy-baldy-8bit.bmp"));

    }
}





