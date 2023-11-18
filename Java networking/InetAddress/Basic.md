### InetAddress class

     - Java InetAddress class represents an IP address. The java.net.InetAddress class provides methods to get the IP of any host name for example www.javatpoint.com, www.google.com, www.facebook.com, etc. 
  
     - It works with either host name or numerical IP address of corresponding host.
  
     - Inet4Address and Inet6Address are 2 subclasses of InetAddress class.
  
     - Inet Address encapsulates both numerical IP address and the domain name for that address.
  
     - InetAddress class offers many useful methods for handling IP addresses and host names.
  
     - To create an inet Address object, you have to use Factory methods.
  
### factory methods of InetAddress Class:
    The factory methods are actually static methods defined in InetAddress class.

    Three commonly used Inet Address factory methods are.

    1. static InetAddress getLocalHost() throws UnknownHostException :
            This method returns the instance of InetAddress containing the local hostname and address.

    2. static InetAddress getByName (String hostname) throws UnknownHostException
             This method returns the instance of InetAddress containing IP and Host name of host name passed to it.

    3. static InetAddress[ ] getAllByName (String hostname) throws UnknownHostException
              This method returns the array of the instance of InetAddress class which contains IP addresses.
     
     4. public static InetAddress getByAddress( byte IPAddress[] ) throws UnknownHostException :
              This method returns an InetAddress object created from the raw IP address.

  ### Instance Methods of InetAddress