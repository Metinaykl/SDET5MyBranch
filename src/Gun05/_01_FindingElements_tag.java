package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_FindingElements_tag extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://www.hepsiburada.com/");

        List<WebElement> linkler=driver.findElements(By.tagName("a"));
        for(WebElement e : linkler) {
            System.out.print("e.getAttribute(href) = " + e.getAttribute("href"));
            System.out.print("e.getAttribute(href) = " + e.getAttribute("title"));
            System.out.println("e.getAttribute(href) = " + e.getAttribute("rel"));
        }




        BekleKapat();

    }
}
