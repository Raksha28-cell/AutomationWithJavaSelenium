package com.san;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        System.setProperty("weddriver.chrome.driver","chromedriver.exe");
        WebDriver wd=new ChromeDriver();
        wd.get("http://www.gmail.com");
    }
}
