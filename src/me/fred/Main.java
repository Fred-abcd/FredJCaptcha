package me.fred;

import me.fred.captcha.CaptchaGenerator;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        CaptchaGenerator generator = new CaptchaGenerator();
        BufferedImage captchaImage = generator.generateCaptcha();
        try {
            File output = new File("captcha.png");
            ImageIO.write(captchaImage, "png", output);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
