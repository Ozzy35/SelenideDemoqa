package sayfalar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sayfa {
WebDriver driver;

public Sayfa(WebDriver driver){
    this.driver=driver;
}
    public void elementGozukeneKadarBekle(String elementId) throws InterruptedException {

        driver.findElement(By.cssSelector("div[class='element-list collapse show'] li[id='item-4'] span[class='text']")).click();
        Thread.sleep(500);

    }
}
