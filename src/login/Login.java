package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import unify.*;

public class Login {
    public String SuccessURL = Main.BaseURL+"/#/home";    //登录成功网址
    @Test
    public void login()throws Exception{
        Main.setUp();
        Main.driver.get(Main.BaseURL);
        WebElement email = Main.driver.findElement(By.name("user_login"));
        WebElement psw = Main.driver.findElement(By.name("user_pass"));
        WebElement button = Main.driver.findElement(By.cssSelector(".btn_login"));
        email.sendKeys(Main.email);
        psw.sendKeys(Main.psw);
        button.click();
        Thread.sleep(5000);
        String current_url = Main.driver.getCurrentUrl();
        try {
            Assert.assertEquals(current_url,this.SuccessURL,"登录测试失败");
        }catch (Exception e){
            Main.tearDown();
        }
    }


}
