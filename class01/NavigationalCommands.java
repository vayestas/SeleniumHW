package class01;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        // go to google.com
        driver.get("https://www.google.com");
        // max the window
        driver.manage().window().maximize();
        //slow down to observe the process
        Thread.sleep(2000);
        // got to facebook
        driver.navigate().to("http://www.facebook.com");

        Thread.sleep(2000);
        // go back
        driver.navigate().back();
        // slow down to observe
        Thread.sleep(2000);
        // go forward
        driver.navigate().forward();
        // slow down to observe
        Thread.sleep(2000);
        driver.navigate().refresh();
        // close
        driver.close(); // driver.quit() also works
    }
}
