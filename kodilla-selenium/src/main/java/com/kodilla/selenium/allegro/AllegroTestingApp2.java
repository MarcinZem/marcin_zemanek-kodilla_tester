package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllegroTestingApp2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebElement yearCombo = driver.findElement(
                By.xpath("//button[@class=\"mgn2_14 mp0t_0a m9qz_yo mp7g_oh mse2_40 mqu1_40 mtsp_ib mli8_k4 mp4t_0 munh_0 m911_5r mefy_5r mnyp_5r mdwl_5r msbw_2 mldj_2 mtag_2 mm2b_2 mqvr_2 msa3_z4 mqen_m6 meqh_en m0qj_5r mh36_16 mvrt_16 mg9e_0 mj7a_0 m9tr_pf m2ha_2 m8qd_qh mjt1_n2 bqyr8 mgmw_9u msts_enp mrmn_qo mrhf_u8 m31c_kb m0ux_fp b1bc7 m7er_0k m7er_56_s mjru_k4 _854c2_2sUz3 mryx_24 mryx_0_s m3h2_0 m3h2_16_s\"]"));
        yearCombo.click();

        WebElement yearCombo1 = (WebElement) driver.findElements(By.className("mr3m_1 mli2_1 mjyo_6x mse2_40 mqu1_40 mp4t_0 m3h2_0 mryx_0 munh_0 mg9e_0 mj7a_0 mh36_0 mvrt_8 mlkp_ag mefy_5r mldj_0 mm2b_0 _14uqc mgmw_q3 mh85_0 _535b5_1gH6X"));
        yearCombo1.click();
        yearCombo1.sendKeys("Mavic mini");
    }
}
