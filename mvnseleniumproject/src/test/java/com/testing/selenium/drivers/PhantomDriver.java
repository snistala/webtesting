package com.testing.selenium.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomDriver extends Driver {
  public PhantomDriver () {
    //pass
  }
  public WebDriver getDriver() {
    String path = Global.properties.getProperty("phantomLinux");
    String binaryPath;
    if (System.getProperty("sun.arch.data.model").contains("64")) {
      binaryPath = "resources/phantomjs_64/bin/phantomjs";
    } else {
      binaryPath = "resources/phantomjs/bin/phantomjs";
    }
    System.setProperty("phantomjs.binary.path", binaryPath);
    driver = new PhantomJSDriver();
    return this.driver;
  }
}
