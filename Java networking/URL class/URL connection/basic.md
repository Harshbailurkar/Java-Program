### URL Connection class:
    - The Java URLConnection class represents a communication link between the URL and the application. It can be used to read and write data to the specified resource referred by the URL.
  
    - The class URLConnection is used for accessing the attributes of remote resources
  
    - The URLConnection class contains many methods that allow communicating with the URL over the network.
### Features of URLConnection class
    - URLConnection is an abstract class. The two subclasses HttpURLConnection and JarURLConnection makes the connetion between the client Java program and URL resource on the internet

    - With the help of URLConnection class, a user can read and write to and from any resource referenced by an URL object
  
    - Once a connection is established and the Java program has an URLConnection object, we can use it to read or write or get further information like content length, etc
  
    - Two of the commpnly used methods are openConnection() and connect().

    - The openConnection() method returns the object of the HttpURLConnection class if you connect to a URL with the HTTP protocol.
    Also, this openConnection() method returns the object of a JarURLConnection class if you connect to a URL of a JAR file.
    
    - How to get the object of URLConnection Class ???????
      The openConnection() method of the URL class returns the object of URLConnection class.

     Syntax of this method is:
     URLConnection urlcon=url.openConnection();

### Methods:
     1. object getContent() :
            This method return the content of URL connenction

     2. long getDate():
            It return date on which connectors established.

     3. int getContentLength():
            It return length og content of invoking object.

     4. int getLastModified():
            This Method gives the value of last modified header field
    
     5. long getExpiration():
             It return value of expired header field.