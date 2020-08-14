package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {

    // youtube.com a gidelim
    // title video kelimesini iceriyor mu bakalim
    // driver i kapatalim


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gebruiker\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://youtube.com");

        String youtubeTitle = driver.getTitle();

        if( youtubeTitle.contains("Video") ){
            System.out.println("Video kelimesini içeriyor.");
        }else{
            System.out.println("Video kelimesini İÇERMİYOR.");
        }
        driver.quit();








    }



}
