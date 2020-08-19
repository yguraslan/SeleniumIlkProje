package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day03_LocatorsGiris {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gebruiker\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();// webDriver yerine driver diyebiliriz

        // driver imiza beklemesini soyledik
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com/");

        //*****ilk webelementimizi buluyoruz*****
        // Web sayfasindaki tum elemanlar ==>  WebElement ile bulunur.

        //webelementimizi id kullanarak bulduk.
        WebElement signInLink = driver.findElement(By.id("sign-in"));

        //webelementimize tikladik.
        signInLink.click();

      //email kutusunu bulalim
        WebElement emailKutusu = driver.findElement(By.id("session_email"));
        //emailKutusuna yazi gonderelim
        emailKutusu.sendKeys("testtechproed@gmail.com");

        //sifreKutusunu buluyoruz
        WebElement sifreKutusu = driver.findElement(By.id("session_password"));
        //sifreKutusunun icine yazi gonderiyoruz
        sifreKutusu.sendKeys("Test1234!");

        //giris (sign in) butonuna tikliyoruz ( id si yokmus name i kullandik)
        WebElement signInButonu = driver.findElement(By.name("commit"));
        signInButonu.click();

    String baslik = driver.getTitle();
    if(baslik.equals("Address Book")){
        System.out.println("Giris basarili");
    }else{
        System.out.println("Giris basarisiz");
    }


    }


}
