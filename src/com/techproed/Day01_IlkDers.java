package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {


    public static void main(String[] args) {

        //Java projemize chromedriver i tanittik. , den sonraki uzantiyi libraries klasorunden aldik ve chromedriver.exe yi manuel ekledik.
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Gebruiker\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

            //Selenium ile ilgili ilk kodumuz
            //webDriver objesi olusturarak chrome driveri kullanilabilir hale getirdik'
            WebDriver webDriver = new ChromeDriver();// webDriver yerine driver de yazilabilir.

            //driver imiza google.com a gitmesini soyledik
            webDriver.get("http://google.com");


            //driver imizda acik olan pencereyi kapatir
              // webDriver.close();

             //driver i komple kapatir
              webDriver.quit();
    }
}
