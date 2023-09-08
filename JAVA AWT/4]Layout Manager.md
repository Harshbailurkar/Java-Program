## Layout Manager
- Layout manaer is used to allign the component position on your screen.
- java provides diiferent layout manager like grid layout, flowLayout, BorderLayout.
- By default the layout manager is default.
- To make Our application nice looking and userFriendly it is must to know layout manager.
- the layouts are added to frame by setLayout() method.
  
 ##  how to add layouts manager.
      1. create object of layout manager that you want to add.with require parameter.
      2. add the object into setLayout() method.
      3. add() the differrnt components on frame.
   
## 1. FlowLayout.

- FlowLayout is default layout manager.
- When no more components can add on line then it switch to the next line.
- By default it keeps the space of 5px. btn vertical and horizontal components.
  
* Constructors:
       1. FlowLayout()
       2. FlowLayout(int alignment)
       3. FlowLayout(int alignment,int horizontal-gap, int vertical-gap)
   
   int alignment=FlowLayout.CENTER, LEFT,RIGHT.

## 2. BorderLayout.

- Border layout is with 4 sides and center.
- Its Side refered as NORTH, SOUTH, EAST,WEST
- The Middle area is called as center.

Constructors:
  1. BorderLayout( ).
  2. BorderLayout(int horizontal-gap,int vertical-gap);

- while adding the component you can specify there location by int region.
eg. add(component ob, int rigion);

int region= BorderLayout.NORTH, BorderLayout.SOUTH,EAST,WEST,CENTER.


## Grid Layout.
- GridLayout position the components in 2D grid.
- Constructors:
      1. GridLayout();
      2. GridLayout(int row,int column);
      3. GridLayout(int row,int column, int Horizontal-gap, int vertical-gap)

