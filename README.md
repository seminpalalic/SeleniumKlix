# Selenium Klix

Selenium Klix is application to automate some functionality of the Klix.ba application such as: 
- registratrion
- login 
- saving specific data to files

# Clone application
To clone the application you need to enter the following command in the terminal:
```sh
git clone "https://github.com/seminpalalic/SeleniumKlix"
```

# Installation
After cloning Selenium Klix application, first thing you need to do is install "Cucumber for Java" plugin in IntelliJ IDEA. 

Here is official documentation how to install plugin in Intellij IDEA. 
https://www.jetbrains.com/help/idea/managing-plugins.html

# Run feature
Before the running application, you need to configure path for webdriver. 
Example: 
```sh
System.setProperty("webdriver.chrome.driver", "/Users/semin.palalic/Desktop/chromedriver");
```

For Google Chrome you can download from the page in description.
https://chromedriver.chromium.org/downloads

Next step is just to run the application. To do that just right click on klix.feature file and click on the "Run Feature: Klix" 

# Run allure reporting 
To run allue reporting you need to configure Run/Debug Configuration. Click on "Edit Configurations" and add new maven configuration. In command line write "clean install" and run configuration. 

In terminal write "allure serve allure-results" to see results.