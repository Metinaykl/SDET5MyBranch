package Gun04;

import Utility.MyFunction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebsite {
    public static void main(String[] args) {
        //       1- Hepsiburada.com sayfasına git
        //        2- arama kutusuna usb yaz
        //        3- Ara butonuna bas
        //        4- Çıkan ürünlerin açıklamasında USB kelimesini kontrol.

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com"); // sayfaya gittim
        // driverdan isteyeceğiz aşağıdaki kodları

        //        eleman aramakutusu = aramakutusunu bul;
        //        aramakutusu.yaziGonder("usb");
        //        elemanlar =  urunListesiniAl;
        //        for döngüsü ile kontrol et.


        MyFunction.Bekle(5);
        driver.quit();

    }
}