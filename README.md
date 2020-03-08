Automation Test Framework

Libraries Used:
    TestNg <br>
    Selenium <br>
    RestAssured <br>
    
Execution Steps:

    Chrome
        Install chromedriver (for MAC - brew install chromedriver)
        Get the driver path and replace in below command
        command - "mvn clean compile test -Dbrowser=Chrome -DdriverPath=<driverPath> -DsuiteXmlFile=./testng-sanity.xml"
                
    Firefox
        Install Gecko Driver (for MAC - brew install geckodriver)
        Get the driver path and replace in below command
        command - "mvn clean compile test -Dbrowser=Firefox -DdriverPath=<driverPath> -DsuiteXmlFile=./testng-sanity.xml"
        
Results:
    Test report is generated at
        ./target/surefire-reports/index.html
