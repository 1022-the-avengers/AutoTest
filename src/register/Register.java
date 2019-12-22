package register;

import login.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import unify.Main;

public class Register {
    String SuccessURL = Main.BaseURL+"/#/";
    String RegisterURL = Main.BaseURL+"/#/register";

    String email = "4@gmail.com";
    String name = "1";
    String psw = "123456789";
    @Test
    public void RegisterAndLogin()throws Exception{
        Main.setUp();
        Main.driver.get(RegisterURL);
        Main.driver.findElement(By.name("user_register")).sendKeys(this.email);
        Main.driver.findElement(By.name("user_name")).sendKeys(this.name);
        Main.driver.findElement(By.name("user_pass")).sendKeys(this.psw);
        Main.driver.findElement(By.cssSelector(".btn_register")).click();
        Thread.sleep(3000);
        String current_url = Main.driver.getCurrentUrl();
        try {
            Assert.assertEquals(current_url,this.SuccessURL,"注册验证失败！！");
        }catch (Exception e){
            Main.tearDown();
        }
        Main.tearDown();
    }
}
