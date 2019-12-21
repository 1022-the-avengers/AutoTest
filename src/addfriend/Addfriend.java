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
    private String email = "ywt@gmail.com";
    private String psw = "123456789";
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
        Main.driver.findElement(By.className("mint-button")).click();
        Main.driver.findElement(By.linkText("返回")).click();

        Thread.sleep(2000);
        Main.driver.findElement(By.linkText("朋友验证")).click();

        try {
            Main.driver.findElement(By.linkText(this.name));
        }catch (Exception e){
            Assert.fail("添加好友失败！！");
            Main.tearDown();
        }

    }
}
