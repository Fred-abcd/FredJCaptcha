
# FredJCaptcha
FredJCaptcha is a Java library for generating random and customizable CAPTCHA (Completely Automated Public Turing test to tell Computers and Humans Apart) images. CAPTCHAs are commonly used to prevent automated bots from accessing or interacting with web services, as they typically require human-like perception to solve.


## Features
- Random generation of CAPTCHA images with customizable length
- Uses a variety of fonts and colors to create visually diverse CAPTCHAs
- Adds distortion to the CAPTCHA text with random rotation angles
- Includes random lines to further obfuscate the CAPTCHA
- Provides a customizable footer with attribution information
- Easy integration into Java projects
## Usage

To generate a CAPTCHA image, simply create an instance of the CaptchaGenerator class and call the generateCaptcha() method:

```java
CaptchaGenerator captchaGenerator = new CaptchaGenerator();
BufferedImage captchaImage = captchaGenerator.generateCaptcha();
```

The generated captchaImage can be used in web applications, registration forms, or any other system where CAPTCHA validation is required.

## Example
Here's an example of generating a CAPTCHA image with a length of 6 characters:

```java
CaptchaGenerator captchaGenerator = new CaptchaGenerator();
BufferedImage captchaImage = captchaGenerator.generateCaptcha();
ImageIO.write(captchaImage, "PNG", new File("captcha.png"));
```

The above code generates a CAPTCHA image and saves it as a PNG file named "captcha.png" in the current directory.
## Contributing

Contributions to FredJCaptcha are welcome! If you have any suggestions, bug reports, or feature requests, please open an issue on the GitHub repository. Additionally, feel free to fork the repository and submit pull requests with your improvements.
