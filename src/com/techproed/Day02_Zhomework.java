package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_Zhomework {
    public static void main(String[] args) {
          /* 1. Yeni bir class oluşturun :Homework
        2. ChromeDriver'ı kullanarak facebook'a gidin ve sayfa başlığının(Page Title) "facebook" olup olmadığını doğrulayın, Değilse, doğru başlığı(Actual title) yazdırın.
        3. Sayfa URL'sinin facebook içerip içermediğini(contains), Değilse doğru URL'yi(Actual url) yazdırın.
        4. Ardından Navigate to https://www.walmart.com/
        5. Walmart sayfa başlığının "Walmart.com" içerip içermediğini(contains) doğrulayın
        6. Navigate back to facebook
        7. Sayfayı yenileyin(refresh)
                8. Maximize the window
        9. Close the browse
        */
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gebruiker\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://facebook.com");

        String facebookTitle = driver.getTitle();

        if( facebookTitle.toLowerCase().contains("facebook") ){
            System.out.println("Facebook kelimesini içeriyor.");
        }else{
            System.out.println("Actuel title.");
        }

        String urlFacebook = driver.getCurrentUrl();

        if( urlFacebook.contains("facebook") ){
            System.out.println("Facebook kelimesini içeriyor.");
        }else{
            System.out.println("Actuel title.");
        }
        driver.navigate().to("https://www.walmart.com");
        String walmartTitle = driver.getTitle();

        if( walmartTitle.contains("Walmart.com") ){
            System.out.println("Walmart.com içeriyor.");
        }else{
            System.out.println("Walmart.com icermiyor.");
        }

        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.quit();

    }
}
