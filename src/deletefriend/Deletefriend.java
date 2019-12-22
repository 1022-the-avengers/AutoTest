package deletefriend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import unify.Main;

public class Deletefriend {
    @Test
    public void  chat()throws Exception{
        Main.driver.findElement(By.className("mintui-more")).click();
        Main.driver.findElement(By.xpath("//*[text()='删除好友']")).click();
        Main.driver.findElement(By.xpath("//*[text()='确定']")).click();
        Main.driver.findElement(By.xpath("//*[text()='确定']")).click();
        try{
            WebElement a = Main.driver.findElement(By.xpath("//*[text()='康王']"));
            Thread.sleep(4000);
        }catch (Exception e){
            Main.tearDown();
        }
        Main.tearDown();
    }
}
