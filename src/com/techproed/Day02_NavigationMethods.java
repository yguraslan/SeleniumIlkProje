package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {
    public static void main(String[] args) {


        //Java projemize chromedriver i tanittik
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gebruiker\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();


        webDriver.manage().window().maximize();

        //driver imiza google.com a gitmesini soyledik.
        webDriver.get("http://google.com");

        //get komutu ile ayni islemi yapiyor
        webDriver.navigate().to("http://amazon.com");

        //navigate().back();  komutu ile bir onceki sayfaya geri donuyoruz
        webDriver.navigate().back();

        //navigate().forward(); methodu ile geri geldigimiz sayfaya gitmemizi sagliyor
        // örnek : google -> amazona gittik -> amazondan google'a geri geldik
        // eğer forward yaparsak, amazona geri gideriz.
        webDriver.navigate().forward();

        // navigate().refresh(); methodu sayfayi yenilemeye yariyor
        webDriver.navigate().refresh();















    }

}
