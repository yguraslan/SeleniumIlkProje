package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {

    public static void main(String[] args) {
        //Java projemize chromedriver i tanittik
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gebruiker\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        //Selenium ile ilgili ilk kodumuz
        //webDriver nesnesi olusturarak chrome driveri kullanilabilir hale getirdik
        WebDriver webDriver = new ChromeDriver();

        //driver imiza google.com a gitmesini soyledik.
        webDriver.get("https://google.com");

        // driverimizda acik olan pencereyi kapatir.
       // webDriver.close();

        // driverimizi komple kapatiyor
       //  webDriver.quit();









    }

}
