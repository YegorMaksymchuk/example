package ua.kyiv.prog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverRunner {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\TOOLS\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://google.com");
    }
}
