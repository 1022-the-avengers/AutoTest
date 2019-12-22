package impression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import unify.Main;

public class Impression {
    private String impre = "呆呆呆呆";
    @Test
    public void impression() throws Exception{
        Main.driver.findElement(By.xpath("//*[text()='康王']")).click();
        Main.driver.findElement(By.className("mintui-more")).click();
        Thread.sleep(2000);
        Main.driver.findElement(By.xpath("//*[text()='添加标签']")).click();
        Main.driver.findElement(By.cssSelector("input")).sendKeys(this.impre);
        Main.driver.findElement(By.xpath("//*[text()='确定']")).click();
        Thread.sleep(1000);
        try {
            WebElement a = Main.driver.findElement(By.xpath("//*[text()='呆呆呆呆']"));
        }catch (Exception e){
            Assert.fail("添加标签失败！！");
            Main.tearDown();
        }
    }
}
