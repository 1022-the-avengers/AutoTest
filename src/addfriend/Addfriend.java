package addfriend;

import login.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import unify.Main;

public class Addfriend {

    //被添加账号
    private String name = "ywt";
    private String mes = "你好";

    @Test
    public void addfriend()throws Exception{
        Main.driver.findElement(By.linkText("好友列表")).click();
        Main.driver.findElement(By.linkText("新的朋友")).click();
        Thread.sleep(2000);
        WebElement search =  Main.driver.findElement(By.className("mint-searchbar-core"));
        search.sendKeys(name);
        search.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        Main.driver.findElement(By.linkText("ywt")).click();

        Thread.sleep(2000);
        Main.driver.findElement(By.className("mint-field-core")).sendKeys(mes);
        Main.driver.findElement(By.className("mint-button--large")).click();
        Thread.sleep(2000);
        Main.driver.findElement(By.className("mint-msgbox-confirm")).click();
        Thread.sleep(2000);
        Main.driver.findElement(By.cssSelector("label.mint-button-text")).click();
        Thread.sleep(3000);
        Main.driver.findElement(By.xpath("//*[text()='朋友验证']")).click();
        Thread.sleep(3000);
        try{
            WebElement a = Main.driver.findElement(By.xpath("//*[text()='ywt']"));
        }catch (Exception e){
            Assert.fail("添加好友失败");
            Main.tearDown();
        }
        Main.driver.findElement(By.cssSelector("label.mint-button-text")).click();

    }
}
