# agAppium
## this is a test 

## External dependencies 
  * Appium server running 
  * Genymotion emulator running  
  * Android-sdk

Application is attached to the project (under apps) just for the purpose of the test (usually taking from the CI the latest buld) 

## How to run the test 
* from terminal, run ```"adb devices" ```                    
* copy the adress of the Genymotion emulator and paste it on "AppiumSetup.java" under UDID Capability 
cap.setCapability("udid", "192.168.57.101:5555");

