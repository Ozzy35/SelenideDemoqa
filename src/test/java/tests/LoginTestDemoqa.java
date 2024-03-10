package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sayfalar.AnaSayfa;
import sayfalar.ClickButton;

public class LoginTestDemoqa {
    WebDriver driver;
    private AnaSayfa anaSayfa;
    private ClickButton clickButton;

    @BeforeEach
    void setup(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        anaSayfa =new AnaSayfa(driver);
        clickButton=new ClickButton(driver);
    }


    @Test

    void demoqaLoginTesti() throws InterruptedException {
        driver.get("https://demoqa.com/elements");

       // driver.findElement(By.cssSelector("div[class='element-list collapse show'] li[id='item-4'] span[class='text']")).click();
        anaSayfa.elementGozukeneKadarBekle(anaSayfa.button);
        Thread.sleep(500);


       // driver.findElement(By.cssSelector(".col-md-6 div:nth-of-type(3) > .btn")).click();
        clickButton.elementGozukeneKadarBekle(anaSayfa.button);
        Thread.sleep(1000);


        WebElement myMessage = driver.findElement(By.cssSelector("#dynamicClickMessage"));
        Thread.sleep(500);
        System.out.println(myMessage.getText());
        System.out.println("Ana pencere başlığı: " + driver.getTitle());

        driver.quit();



    }
    @AfterEach
    void  tearDown(){
        driver.close();
    }

}
