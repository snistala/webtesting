Web testing using Selenium
==========================
[![Build Status](https://travis-ci.org/snistala/webtesting.png?branch=master)](https://travis-ci.org/snistala/webtesting)

This example project uses Selenium webdriver to automate testing on Chrome, Firefox and Phantomjs as a commandline browser.

* Tests are run sequentially based on TestOrder.java using JUnit test suite runner.
* Individual test ordering is done using MethodSorters (NAME_ASCENDING).
* The website is run using a simple Python http server and serves static pages.
* Websites contains forms and simulates ajax form submission which is tested using Selenium.
* Test table content, test json, fill forms, submit forms, order tests, search individual web elements using css selectors and xpath.
* Run mvn clean package to run all tests.
* Futher instructions are located under mvnseleniumproject/README.md
