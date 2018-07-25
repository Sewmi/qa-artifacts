# README

This sample was created to demonstrate how to resolve encrypted passwords inside a task.

# Description

This sample demonstrates
  -  how to write a task class.
  - how to resolve an encrypted password inside a task class.


# Prerequisite
  - Follow steps explained under [encrypt passwords for synapse configurations](https://docs.wso2.com/display/EI611/Working+with+Passwords+in+the+ESB+profile#WorkingwithPasswordsintheESBprofile-Encryptingpasswordsforsynapseconfigurations) topic in the [documentation](https://docs.wso2.com/display/EI611/Working+with+Passwords+in+the+ESB+profile)
  - Open <EI611_home>/conf/log4j.properties and add below log entry
  ```sh
  log4j.logger.wso2.sample.SampleScheduledTask=DEBUG
  ```
  - Build the project after changing the file path and copy the <SampleScheduledTask>/target/SampleScheduledTask-1.0-SNAPSHOT.jar file to <EI611_home>/lib folder
  - Create a file which you specified in the file path manually.
  - Restart the server and add a new scheduled task by typing the fully qualified class name as the 'Task Implementation' (e.g. wso2.sample.SampleScheduledTask ), Specifying lookup expression (e.g. 'wso2:vault-lookup('my.user.password')') as the param1/param2 value.
  - Resolved passwords should be written to the file.
```sh
param1: password123, param2: password
```
