package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebElement yearCombo = driver.findElement(
                By.xpath("//button[@class=\"mgn2_14 mp0t_0a m9qz_yo mp7g_oh mse2_40 mqu1_40 mtsp_ib mli8_k4 mp4t_0 munh_0 m911_5r mefy_5r mnyp_5r mdwl_5r msbw_2 mldj_2 mtag_2 mm2b_2 mqvr_2 msa3_z4 mqen_m6 meqh_en m0qj_5r mh36_16 mvrt_16 mg9e_0 mj7a_0 m9tr_pf m2ha_2 m8qd_qh mjt1_n2 bqyr8 mgmw_9u msts_enp mrmn_qo mrhf_u8 m31c_kb m0ux_fp b1bc7 m7er_0k m7er_56_s mjru_k4 _854c2_2sUz3 mryx_24 mryx_0_s m3h2_0 m3h2_16_s\"]"));
        yearCombo.click();

        WebElement yearCombo1 = driver.findElement(
                By.cssSelector("div>div>select.mr3m_1"));
        Select yearSelect = new Select(yearCombo1);
        yearSelect.selectByIndex(3);

        WebElement yearCombo2 = driver.findElement(By.cssSelector("div>form>input.mr3m_1"));
        yearCombo2.sendKeys("mavic mini");

        WebElement yearCombo3 = driver.findElement(By.cssSelector("div>form>button._13q9y"));
        yearCombo3.click();

    }
}
