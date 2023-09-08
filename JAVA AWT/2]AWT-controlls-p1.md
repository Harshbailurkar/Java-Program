# AWT Components:

## 1. Button:
-This is most used Component.
-A button is also called Push button.

* Constructors:
    1. Button()- creates a button with out any text/label in it.
    2. Button(String str)- creates a button with text/ label in it.

* Methods:
     1. void setLabel ( String str);  
         -sets a label on button obj.
     2. void getLabel ( ) ;   
         -gets a label of button

## 2. Label:
- Label is a string which is used to interact with string.

* Constructor:
   1. Label() : Creates a empty label Object 
   2. Label(String str) : Create a Label with string in it
   3. Label( String str, int how) : create a label with string and allignment.
   
* Methods:
   1. void setText( String str);
   2. String getText();
   3. void setAlignment(int how);
   4. int getAlignment();
   
## Checkbox:
 - checkbox is used to check multiple option from group of option/ single option.
 - It has 2 states. Checked or Unchecked.
 - Checked=true and unchecked= false

* Constructor:
    1. Checkbox( ) : - create  a checkbox with out any lable with initial state is false. i.e. unchecked.
   1. Checkbox(String str) :- create  a checkbox with lable with initial state is false. i.e. unchecked.
   2. Checkbox(String str, Boolean state) :- create  a checkbox with lable with specified initial state. i.e. true or false.
   3. Checkbox(String str, boolean state, checkboxGroup obj) :- create a checkbox with string label and set the initial state as mentioned. and group is them by checkboxGroup.
   
* Methods:
    1. void setLabel( String str);
    2. void getLabel( );
    3. void setState( );
    4. void getState( );
   
## checkboxGroup:
 - checkboxGroup convert checkbox into radio buttons.
 - we can not select mutiple options here.
 - it has only one constructor:
       checkboxGroup();
* Method:
    1. Checkbox getSelectedCheckbox(): gives a  seleted checkbox.

## Choice:
-choice class provided list of items to be selected.
- It is like popup list and only one item can selected.
- It has only one constructor:
    - Chioce()
- Each item in choice list in string.
- void add( String item ): is used to add items in list.

* Methods : 
   1. String getSelectedItem() :- it gives which item is selected from chice list
   2. int getSelectedIndex() :-  it gives index of selected Item.
   3. int getItemCount() :-  gives total no. item in list
   4. void select(int index) :- 
   5. void select( string str);
   6. String getItems(int index);

## List:
 -Its gives a list with mutiple selected option.
 -is is also like popup list.

* constructors:
    1. List()
    2. List(int visible-rows) :- create a list control in which it specifies how many rows can be viewed by scrollinig.
    3. List(int visible-rows, boolean multi-select) :-if bool state is true yhen you can select multiple options else if it is false then only one item can selected at a time.
   
 * you can add items in list by by add() method.
      1. void add( string item)
      2. void add(string item, int atIndex) 
  
 * Methods:
   1. String getSelectedItem( ) :- it gives which item is selected from chice list
   2. int getSelectedIndex( ) :-  it gives index of selected Item.
   3. String[ ] getSelectedItem( ) :- if multiple items get selected then stored it in array.
   4. int[ ] getSelectedIndex( ):-
   5. int getItemCount( ) :-  gives total no. item in list
   6. void select(int index) : 
   7. void select( string str);
   8. String getItems(int index);
   
 ## TextFiled:
- it provides single line textbox.
- generally used to take input from user.
- It is derived class of textComponent Class.

* constructors:
   - TextField();
   - TextField(int max-char)
   - TextField(String str) : create text with initial text in it.
   - TextField( String Str, int max-char)

* Methods:
   1. String getText( );
   2. void setText( String Str );
   3. void select(int start-index, int last-index);
   4. void getSelectedText( );
   5. boolean isEditable( bool state );
   6. void setEchoChar( char ch);   
    - Textfild used to get passward.
   7. char getEchoChar
   8. boolean echoCharisSet();


## TextArea:

- TextArea is multi-line text-filed. 
- textarea is for paragraph or mutiple line input.

* Constructors:
   1. TextArea();
   2. TextArea( String Str) :- initialize text area with some text.
   3. TextArea(int max-lines, int max-rows) :- max no lines and max no character in line
   4. TextArea( String str, int max-lines, int max-rows)
   5. TextArea( String str, int max-lines, int max-rows, int scrollbar-type) 
   * scrollbar-type:
      - SCROLLBARS_BOTH
      - SCROLLBARS_NONE
      - SCROLLBARS_VERTICAL_ONLY
      - SCROLLBARS_HORIZONTAL_ONLY