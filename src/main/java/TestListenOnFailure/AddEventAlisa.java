package TestListenOnFailure;

import TestListenOnFailure.TestBaseAlisa;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddEventAlisa extends TestBaseAlisa {
    @Test
    public void addEvent() {
        TestBaseAlisa.driver.findElement(By.xpath("/html/body/div[1]/header/ul/li[7]/a")).click();
        TestBaseAlisa.driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[3]/div/a")).click();
        TestBaseAlisa.driver.findElement(By.id("txtTitle")).sendKeys("Summer QA Internship");
        TestBaseAlisa.driver.findElement(By.id("txtCost")).sendKeys("free");
        TestBaseAlisa.driver.findElement(By.id("txtPlace")).sendKeys("Kyiv");
        TestBaseAlisa.driver.findElement(By.id("btnSubmit")).click();

    }
}