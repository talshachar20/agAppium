# agAppium
## this is a test 

## External dependencies 
  * Appium server running 
  * Genymotion emulator running  
  * Android-sdk
  * Junit plugin on IDE 

Application is attached to the project (under apps) just for the purpose of the test (usually taking from the CI the latest buld) 

## Preperations before first run: 
* run Maven build via the IDE
* from terminal, run ```adb devices```                    
* copy the adress of the Genymotion emulator and paste it on "AppiumSetup.java" under UDID Capability 
cap.setCapability("udid", "192.168.57.101:5555");

## Run the tests: 
* right click on TestRunner.java -> Run as "JUnit test" 

### Comments: 
For a bigger project configuration, I would have create exec command from terminal, which allows to run the tests with specific tags (for example: regression set, smoke set etc..)

It is possible to add to setup the option to open emulator via the test 
