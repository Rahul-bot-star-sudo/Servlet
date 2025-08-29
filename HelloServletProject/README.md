### this project is for test three type of create servlet 
1. servlet interface
2. generic servlet
3. Http servlet
   
### how we create and run 
* create first project structure
* then create servlet file 
* then compile it using this `
C:\Program Files\Apache Software Foundation\Tomcat 9.0\webapps\HelloServletProject\src>javac -classpath "C:\Program Files\Apache Software Foundation\Tomcat 9.0\lib\servlet-api.jar" -d "C:\Program Files\Apache Software Foundation\Tomcat 9.0\webapps\HelloServletProject\WEB-INF\classes" "C:\Program Files\Apache Software Foundation\Tomcat 9.0\webapps\HelloServletProject\src\com\example\ThirdHello.java"`
    * `javac -classpath "C:\Program Files\Apache Software Foundation\Tomcat 9.0\lib\servlet-api.jar"` ye jar file ka path
    * `-d "C:\Program Files\Apache Software Foundation\Tomcat 9.0\webapps\HelloServletProject\WEB-INF\classes"` ye jaha class banenge jab compile hoga
    * `"C:\Program Files\Apache Software Foundation\Tomcat 9.0\webapps\HelloServletProject\src\com\example\ThirdHello.java"` ye jaha hamne servlet file banayi jis file ko compile karana ho
* then create mapping 
* start tomcat 
* then search on `localhost/9494/HelloServletProject/third` 