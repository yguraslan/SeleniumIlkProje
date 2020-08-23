package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day06_Facebook {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gebruiker\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();// webDriver yerine driver diyebiliriz
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();

        driver.get("http://www.facebook.com");
        //email kutusuna techproed@gmail.com yazdiralim
        //<input type="text" class="inputtext _55r1 _6luy" name="email" id="email"
        // data-testid="royal_email" placeholder="Email or Phone Number" autofocus="1"
        // aria-label="Email or Phone Number">
        // oncelik id olmali
        WebElement emailKutusu = driver.findElement(By.id("email"));
        emailKutusu.sendKeys("techproed@gmail.com");

        //2.adim
        //sifre kutusuna Test1234 yazdiralim

       // <input type="password" class="inputtext _55r1 _6luy" name="pass"
        // id="pass" data-testid="royal_pass" placeholder="Password" aria-label="Password">

       // WebElement sifreKutusu = driver.findElement(By.id("pass")); bu da olur
        WebElement sifreKutusu= driver.findElement(By.xpath("//*[@type='password']"));
        sifreKutusu.sendKeys("Test1234");

        //3.adim
        //login butonunu bulalim
        //<button value="1" class="_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy"
        // id="loginbutton" name="login" tabindex="0" type="submit">Log In</button>

       // WebElement loginButonu = driver.findElement(By.cssSelector("#loginbutton"));//
       // WebElement loginButonu = driver.findElement(By.id("#loginbutton"));
       // WebElement loginButonu = driver.findElement(By.cssSelector("#loginbutton"));
        WebElement loginButonu = driver.findElement(By.xpath("//button"));
        loginButonu.click();

        //Burada 10 saniye bekleyecek
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String url = driver.getCurrentUrl();

        if(url.contains("facebook.com/login/")){
            System.out.println("Giriş Başarısız !");// sonuc bu olmali tekrar bak
        }else{
            System.out.println("Giriş Başarılı !");
        }
        //Burada 5 saniye bekleyecek
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
