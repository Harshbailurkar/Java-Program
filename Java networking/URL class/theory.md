### URL: Uniform resource Locator.

    URL class in java referes Resources On world wide web(www) such as a Web page or FTP directory.
    It allows you to create, parse, manipulate, and access resources identified by a URL
## Contructors Of URL
    1. URL() : create instace of URL class
    2. URL(String protocol, String Hostname, int port , string File): Create instace of url class with given hostname, portno, protocol and file.
    3. URL( String protocol, string hostname, String File)
    4. URL( String Protocol, String HostName, String File, URLStreamHandler) : create a instance of URL class with given Protocol, Hostname, File along with handler.
### Methods of URL class
     1. public String getPath() : Return Path of URL.Return null if URL is Empty.
     2. public int getPort() : Return Port No. of URL. by default it is -1.
     3. public String getHost(): return Hostname of URL
     4. public String getProtocol(): Return Protocol of URL
     5. public String getFile() : return Filename of URL
     6. public String getQuery() : return query of URL. It is prt after ? in url.
     7. public int getDefaultPort() : return default port of url.
     8. public String getAuthority() : Return authority of URL

     Eg:
       www.http://www.javatpoint.com/java-tutorial

       Protocol: http
       Host Name: www.javatpoint.com
       Port Number: -1
       File Name: /java-tutorial
       Path: /java-tutorial
       Query: null
       Ref: null
       Authority: www.javatpoint.com
       Default Port: 80