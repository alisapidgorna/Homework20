package TestListenOnFailure;

import TestListenOnFailure.TestBaseAlisa;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTestAlisa extends TestBaseAlisa {
    @Test
    public void doLogin(){
        TestBaseAlisa.driver.findElement(By.id("login-link")).click();
        TestBaseAlisa.driver.findElement(By.id("_loginByMail")).click();
        TestBaseAlisa.driver.findElement(By.name("username")).sendKeys("alisa@test.com");
        TestBaseAlisa.driver.findElement(By.name("passwordNNNNNNNNNNNNNNNNNNNNNNNNN")).sendKeys("alisatest98");
        TestBaseAlisa.driver.findElement(By.id("_loginDialog")).click();
    }
}
