package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        // declare the instance of WebDriver
        WebDriver driver=new ChromeDriver();

        // use the driver.get() method
        driver.get("https://www.google.com");

        // maximize your window
        driver.manage().window().maximize();

        // get url of the website
        String currentUrl= driver.getCurrentUrl();
        System.out.println("the current url is: "+currentUrl);

        //get the title
        String title= driver.getTitle();
        System.out.println("the title of the page is "+title);

        // add a couple seconds before browser closes
        Thread.sleep(2000);
        // close the browser
        driver.quit();
    }
}
