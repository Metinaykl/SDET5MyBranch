package Gun04;

import Utility.MyFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindingByLinkText {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com");
        WebElement siparislerimLinki= driver.findElement(By.linkText("Siparişlerim"));
        // Gözüken texti Siparişlerim olan a taglı webelement
        System.out.println("siparislerimLinki.getText() = " + siparislerimLinki.getText());

        MyFunction.Bekle(3);
        driver.quit();

    }
}
