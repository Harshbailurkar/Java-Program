## Dialogbox
- Dialogbox is child component of window that contain set of related controlls.
- we can not add menubar on dialogbox.
- by using add() method we can add the component to the dialog box.
- we can create dialog box by extending built-in class Dialog
- Syntax.
    class dialogbox extends Dialog{
        -------
        ------
    }
* constructors:
    1. Dialog( Frame parent-window-obj, bool visibility)
    2. Dialog( Frame parent-window-obj, String Title, bool visibility)
   
* Methods:
   1. void setTitle(String str ):
   2. void setSize( int width, int height):
   3. void setVisible( bool state):
   4. void dispose( ): It free all the system resorces which is asssociate with dialog box.

## FileDialog
- The FileDialog show the Dialog box to select the files.

* methods:
     - string getFile().
     - int getMode().
     - void setFile().
     - void setMode().
     - String getDirectory
     - void setDirectory

## Color Class
- java provides the highest no. of colors amoung all programming lang.
- java code System allows us to specify color that we want.
- java has losts of color contanst.
- we can also add  userdinifed colors by using contructors of color class.
  
* Constructors:
     - Color(int red,int green,int blue):  specify blends of red,green,blue. value betn 0-255
     - color( rgb value) :rgb values
     - Color(Float red,float green,float blue): specify blends of red,green,blue. value betn 0-1

* Methods:
    - void setForeground(Color obj)
    - Void SetBackground(Color Obj) 
 we can also give color value directly by following mwthods.
 1. int getRed();
 2. int getGreen();
 3. int getBlue();

we can also set color to componets by setColor() method and retrive the color by getColor();

## Font

- Java supports font to make application more attractive.
- for this java provides build-in class Font.
- This font class have 3 important variable argument.
- To select new font you need to create  object of font class with all require parameters.

* Constructor:
    - Font(String Font-name, int Font-style, int Font-size);

* Methods: 
  - setFont(Font obj) : to set the font
  - 

## Menu and Menubar

- Menus are essential components of any window based GUI.
- It allows user to choose one of the several options
- Menus are created with the help of Menu items and these menus are placed on menubar.
- The constructor of MenuBar –
	MenuBar()


* The Constructors of Menu –
   - Menu( )
   - Menu(String menu_title)
   - Menu(String menu_title, boolean is_removable)
   - 
* The Constructors of MenuItem –

- MenuItem( )
- MenuItem(String item_title)
- MenuItem(String item_title, MenuShortcut_key)
  
* The Methods of MenuItem –
   - void setEnabled(boolean enable)
   - boolean isEnable()
   - void setLabel(String item_title)
   - String getLabel( )

