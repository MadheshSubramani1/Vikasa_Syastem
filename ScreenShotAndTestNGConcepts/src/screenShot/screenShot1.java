 package screenShot;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class screenShot1 {

	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");
		
		
		Screenshot screenshot= new AShot().shootingStrategy
				(ShootingStrategies.viewportPasting(2000)).takeScreenshot(driver);
		 ImageIO.write(screenshot.getImage(), "png", new File("./screenShot1.png"));
	}

}
