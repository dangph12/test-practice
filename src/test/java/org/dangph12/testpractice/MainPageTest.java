package org.dangph12.testpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.*;


public class MainPageTest {

    @Test
    public void testLogin() {
        //Setting system properties of EdgeDriver
        System.setProperty("webdriver.edge.driver", "C:\\WebDriver\\msedgedriver.exe");

        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        //Creating an object of EdgeDriver
        WebDriver driver = new EdgeDriver(options);
        driver.manage().window().maximize();

        // URL of the login website that is tested
        driver.get("http://localhost:8080/");



        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 8. close browser
        driver.close();
    }
}

