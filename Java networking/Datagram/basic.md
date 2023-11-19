# Datagram:

    - A datagram is an independent, self contained message sent over the network whose arrival time and content are not guaranteed.
    
    - Datagrams are collection of information sent from one device to another device via the established network.
   
    - When the datagram is sent to the targeted device, there is no assurance that it will reach to the target device safely and completely. It may get damaged or lost in between
  
    - Likewise, the receiving device also never know if the datagram received is damaged or not. The UDP protocol is used to implement the datagrams in Java.
 
    - The java.net package contains  classes that are used to write the java programs that use datagrams to send and receive packets over network :

      * DatagramSocket
      * DatagramPacket

# Java DatagramSocket class :
   
    - Java DatagramSocket class represents a connection-less socket for sending and receiving datagram packets.
    
    - A datagram is basically an information but there is no guarantee of its content, arrival or arrival time.
 
    -  Creation of the DatagramSocket class 
         DatagramSocket ds =new DatagramSocket();

 ### Constructors:
    1. DatagramSocket() : 
           it creates a datagram socket and binds it with the available Port Number on the localhost machine.

    2. DatagramSocket(int port) : it creates a datagram socket and binds it with the given Port Number.
   
    3. DatagramSocket(int port, InetAddress address):it creates a datagram socket and binds it with the specified port number and host address.
   
 ### Methods:
    1. void bind(SocketAddress addr) : It binds the DatagramSocket to a specific address and port.
    2. void close(): 	It closes the datagram socket.
    3. void connect(InetAddress address, int port) : It connects the socket to a remote address for the socket.
    4. void disconnect() : It disconnects the socket.
    5. int getPort() :It returns the port number to which the socket is connected.
    6. int getLocalPort() : It returns the port number on the local host to which the socket is bound.

# Java DatagramPacket Class

 ### Theory:
    - Java DatagramPacket is a message that can be sent or received
    - It is a data container. If you send multiple packet, it may arrive in any order. Additionally, packet delivery is not guaranteed.
 ### Commonly used Constructors of DatagramPacket class:
    - DatagramPacket(byte[] barr, int length): it creates a datagram packet. 
                                               This constructor is used to  receive the packets.
    - DatagramPacket(byte[] barr, int length, InetAddress address, int port): it creates a datagram packet.
                                                                              This constructor is used to send the packets.
 ### Methods:
      1. InetAddress getAddress() :It returns the IP address of the machine to which the datagram is 
                                  being sent or from which the datagram was received.

      2.  byte[] getData() :	It returns the data buffer.
   
      3.  int getLength() :	It returns the length of the data to be sent or the length of the data received.
   
      4.  void setData(byte[] buff)	: It sets the data buffer for the packet.
   
      5.  int getPort():	It returns the port number on the remote host to which the datagram 
                            is being sent or from which the datagram was received.

      6.  void setPort(int iport) : It sets the port number on the remote host to which the datagram is being sent.
   
      7.  SocketAddress getSocketAddress() : It gets the SocketAddress (IP address + port number) of the remote host that the packet is being sent to or is coming from.
   
      8.  void setSocketAddress(SocketAddress addr)	: It sets the SocketAddress (IP address + port number) 
                                                      of the remote host to which the datagram is being sent.