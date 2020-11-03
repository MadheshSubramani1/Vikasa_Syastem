package screenShot;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenShotWithPopUP {

	public static void main(String[] args) throws AWTException, IOException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;

		js.executeScript("alert('helo');");
		
		Robot robot= new Robot();
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle=new Rectangle(screenSize);
		BufferedImage source=robot.createScreenCapture(rectangle);
		
		ImageIO.write(source, "png", new File("./screeShotwithpopUp.png"));
		
	}

}
