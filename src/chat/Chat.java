package chat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import unify.Main;

public class Chat {
    @Test
    public void  chat(){
        Main.driver.findElement(By.className("mint-button--large")).click();
        Main.driver.findElement(By.className("footer_inpuit")).sendKeys("呆呆呆呆");
        Main.driver.findElement(By.className("footer_button")).click();
        try{
            WebElement a = Main.driver.findElement(By.xpath("//*[text()='确定']"));
        }catch(Exception e){
            Assert.fail("发送消息失败！！");
            Main.tearDown();
        }
        Main.driver.findElement(By.className("iconfont")).click();
    }
}
