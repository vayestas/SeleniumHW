package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHw {
    /*
    Objective: Write a Selenium script to automate the login process on the OrangeHRM website.
    Instructions:
    Go to the OrangeHRM login page: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
    Enter the username "abc".
    Clear the username field.
    Enter the username "Admin".
    Enter the password "admin123".
    Get the text from the login button web element and print it on the console.
    Click on the login button.
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement userName= driver.findElement(By.name("username"));
        userName.sendKeys("abc");

        userName.sendKeys(Keys.CONTROL + "a");
        userName.sendKeys(Keys.DELETE);
        userName.sendKeys("Admin");
        Thread.sleep(2000);

        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        WebElement login= driver.findElement(By.tagName("button"));
        login.click();
    }
}
