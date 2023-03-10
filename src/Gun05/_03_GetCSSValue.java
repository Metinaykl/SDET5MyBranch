package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_GetCSSValue extends BaseDriver {
    public static void main(String[] args) {


        driver.get("https://www.snapdeal.com/");

        WebElement inputValEnter= driver.findElement(By.id("inputValEnter"));

        //  <input autocomplete="off" name="keyword" type="text" class="col-xs-20 searchformInput keyword"
        //    id="inputValEnter" onkeypress="clickGo(event, this)" placeholder="Search products &amp; brands"
        //    value="" strtindx="" endindx="">







        //elemanın parametlerine ulaşmak için getAttirube kullanıyoruz.
        System.out.println("inputValEnter.getAttribute(\"class\") = " + inputValEnter.getAttribute("class"));

        // Class'ın karşılığı olan CSS -Şekillendirme değerlerini almak için getCssValue kullanır
        System.out.println("inputValEnter.getCssValue(\"color\") = " + inputValEnter.getCssValue("color"));
        System.out.println("inputValEnter.getCssValue(\"color\") = " + inputValEnter.getCssValue("font-size"));
        System.out.println("inputValEnter.getCssValue(\"color\") = " + inputValEnter.getCssValue("background"));

        BekleKapat();

    }
}
