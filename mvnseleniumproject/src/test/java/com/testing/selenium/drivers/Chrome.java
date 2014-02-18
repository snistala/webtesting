package com.testing.selenium.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome extends Driver {
  public Chrome() {

  }
  public WebDriver getDriver() {
    if (driver == null) {
      if (Global.OS_VERSION == Global.OS.MAC_OS) {
        String path = Global.properties.getProperty("chromeMac");
        System.setProperty("webdriver.chrome.driver", path);
      } else {
        String path = Global.properties.getProperty("chromeLinux");
        System.setProperty("webdriver.chrome.driver", path);
      }
      driver = new ChromeDriver();
    }
    return driver;
  }

}
