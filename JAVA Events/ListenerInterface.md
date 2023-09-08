## ActionListener Interface

- This Interface is invoke when some action performed of source.
- like putton pressses, item slected, menuitem souble clicked. etc.
- For this actionPerformed(ActionEvent ae) method is used.
  
## ItemListener InterFace:

- This interface is invioke whien souce onject os checkbox, radiobutton, list etc. get selected or delected. 
- i.e. when state of these component get changed.
- for this itemStateChange(ItemEvent ie ) method is used.

# Methods:
1.  void getSelectedItem()  // return slected item.
2.  void getStateChanged() //check selected or not.
3.  ItemEvent.SELECTED()    // gives slected or not


## KeyListerner
- key Listerner is invoke when there is
- key presses, key releases, key hold, typed etc.
- for this following methods are there.
  1. public void keyPressed(KeyEvent ke);
  2. public void keyReleased( KeyEvent ke);
  3. public void keyTyped( KeyEvent ke);
   
## MouseListner:

1. void mouseClicked, mouseEnterd, mouseExited, mousePressed, mouseReleased.

## MouseMotion Listerner

1. void mouseMoved();
2. void mouseDragged().
   
## TextListerner
// only in AWT 

1. void textValueChanged( TextEvent te);

## WindowListerner:
V
1. windowActivated, Deactivated
2. windowOpened,Closed,Closing
3. wondowIconifide.Deiconified.