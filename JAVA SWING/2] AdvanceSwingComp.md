# Advance Swing Components.

##  1. JTabbedPane:

- JTabbedPane is a component which have group of multiple Tabs.each containg titile and panel as a group of component.
- whenver user click on tab then it will be visible and user can iteract with that tab.
- We craete object of default constructors and add diff. tab using addTab() method.
- defined as void addTab(String title, Component Obj).

## procedure to use JTabbedPane:
        - Define required no of panels classes with componets in it.
        - create JTabbedPane Object
        - call its addTab() method
        - add the tabbedpane into the container of frame.

## 2. JScrollPane:

 - Jscrollpane provide a reactangular scrolable Area in which componets can be viewed.
 - Horizontal and vertical scrollbar may provided.
  
* Constructors:
         - JScollPane(Component obj);
         - JScollPane(int vertical, int horizontal)
         - JScollPane(Component obj ,int vertical, int horizontal)
  
-Here horizontal and vertical contants are:

1. ScrollPaneContants.HORIZONTAL_SCROLLBAR_ALWAYS
2. ScrollPaneContants.HORIZONTAL_SCROLLBAR_AS_NEEDED
3. ScrollPaneContants.VERTICAL_SCROLLBAR_ALWAYS
4. ScrollPaneContants.VERTICAL_SCROLLBAR_AS_NEEDED
   
## JTree
- Its i tree like representation of data.
- Jtree has following constructors:
     1. JTree( HashTable obj)
     2. JTree( Object Obj[])
     3. JTree( TreeNode Obj)
     4. Jtree ( Vector Obj)
   
## JTable
- A JTable is Tabular represntation of data.
- data is displayed in row and column format.
- You can drag the cursor to column to resize the boundry of column.
  
* Constructors:
     - Jtable( Object data[][] , Object colHead[])
- here colHead is 1D array with column name. and data is 2D array.
  
## steps to create Table:
        - create JTree Object With data and column heading.
        - create JScrollPane Object and provide the table into it.
        - Add the scrollpane into container.
  
## JProgressBar
- JProgressBar is a Component which graphically shows the progress of task.
- we can say it shows % of completing task.
  
* constructors of JProgressBar:
    1. JProgressBar();
    2. JProgressBar(int orient.)
    3. JprogressBar(int min,int max).


## JToolTip:

- It is Very IMP componets that shows temporary POP-UP msg,When curson stop on that component.
- This Pop-up Msg can be short discription of that component,
- We can add ToolTip to almost all Componrnts.
- To add the ToolTip we have setToolTipText();
- defined AS void setTootTipText( String Text);
  

  ## JSlider

## JDialogBox:

- the dialogbox is used to create the dialog window.
- this dialogbox is used to give any costome type of dialog box with the help of J