# ConnectedIO project

# CLA Instructions

# Example with Firefox browser that generates a report
mvn clean test site -DdriverType=firefox -Denv=uat -Dusername=x... -Dpassword=1... -Dsecret=v...

if you want to execute it without a report to just visually see the steps, do not include "site" flag, the report takes an additional 80 seconds or so.

# Example with Firefox without report
mvn clean test -DdriverType=firefox -Denv=uat -Dusername=x... -Dpassword=1... -Dsecret=v...

# Supported browsers:
- Firefox v.54
- Chrome (not implemented yet)
- PhantomJS (v1.3) ( (not implemented yet))

# CLA Flags
-DdriverType (Specifies the browser not case) (chrome/firefox/phantom)
-Denv (environment) (prod/uat)
-Dusername (username of your choice depending on the environment you want)
-Dpassword (passowrd for the username)
-Dsecret (the Secret answer for the particular username)
site (if you want a report generated at the end of the test it will be located in project folder
/target/allure-results/site/index.html
