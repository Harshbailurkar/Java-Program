# AWT
- AWT stands for Abstract Window Toolkit.
- It Consists of Large No. of Built-in classes, Interfaces and methods which allows creating and managing GUI applications.

# Component Class Hierarchi:
            - Component
                    |
                 - Container
                    |
                    |- panel
                    |- window
                         |- Frame
                         |- Canvas

## Component:
- Component class is hierarchi Class for all the AWT Component.
- this is an abstract class that contain all the classes and methods of Window Component.
- this class also defines the events classes and listerners.
- this Componts also imports some Methods Like setSize(), SetBounds(), SetLocation()
  
* Methods:
   1. Void setLocation(int x-position, int Y-position)
   2. void setSize(int width, int height)
   3. void setBounds(int X-position, int Y-position , int Width,int Height)

## Container:
- This Class is Sub-Class of Component Class.
- Container class is resposible for managing the position of Components on window By using diff Layout Managers.
  
* Container class has 2 methods:
    1. Void add(Component Obj): To add componets on window
    2. void remove(Component Obj): To remove the Componets on window.

## Window:
- this class is base class for 2 window classes. Frame and Canvas.
- We can not place any componets on window. Generally we add Frame/Canvas on window and add componets into that Frame/Panel.

## Panel:
- This Panel class implements Container class.
- Panel is group of componets which is used recursively/ nested inside Frame/ Applet.
- The main diff. betn Frame and Panel is , Panel does notr have any Border, titlebar and menubar.
- we simple add componts on Panel and this panel will get add on Frame or applet by using add() method.
  
## Frame:
- Frame is actual stand Alone window which has barder, menubar, titilebar and resizing corner.
- It is Top-level Window that that has componets in It.

* Constructors:
  1. Frame()
  2. Frame(String title)
   
* Methods:
   1. setSize(int width, int height)/ setSize(Dimention obj)
   2. setTitle( String title)
   3. setVisible(Boolean state)
   4. windowClosing()
  
## Canvas:
- It is Blank window on which we can draw different graphical Objects.
  