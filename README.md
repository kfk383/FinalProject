FinalProject - 2D Bowling
=========================
The goal of the project is to create a simple bowling game using components of JPanel, JFrame, MouseListener, and ActionListener that will allow the player to interact with the program in a GUI.

Features that will be utilized:
- A main menu with buttons for game start, instructions, settings, and difficulty.
- Factors that are set before launching the ball:
   - Setting the power of launch.
   - Setting the position on the alley that the ball will be launched.
   - Note : You must accomodate for a built in "tilt" on the lane that will offset your launch to either side with varying degrees.
- Upon launch:
   - The movement of the ball will be controlled by the computer mouse by some degree to allow for curve balls and a slight change of angle after launch.
   - Avoid going into the gutters, which are on either side of the lane. 

This project will require:
- The use of JPanel and various extensions from a regular java program
- The calculation of effective angular movement while the ball is moving (and the implementation of this with the position of the ball in the GUI)
- Knowledge of the rules of bowling
- Use of simple animations and graphics.
 


January 5, 2015:
- Created a GUI window for the game
- Updated README file with project information

January 6, 2015:
- Added images to GUI
- Researched mouse input/control on JFrame
- Switch project to processing? (if simpler)
- Photoshopped main menu background & logo, but without functions at this point
- Discussed basic functions of the game

January 7, 2015
- Altered code to fit the menu screen background
- Started on mouse commands ( used www.tutorialspoint.com/swing/swing_mouse_listener.htm )
- Added in java documentation for methods already written, excluding mouse commands.
- Discussed how the buttons would work in the main menu (using the mouse location and whether the mouse is clicked)
- Maybe: Change the appearance of the button when the mouse is over it

January 8, 2015
- Used JButton instead of buttons photoshopped into the main menu
- Switched to JPanel for a more flexible interface
- Enhanced GUI and started on actionPerformed method functions

January 9, 2015
- Put buttons onto individual JPanels in order to layer it on top of the background image
- Buttons now appear when scrolled over to the options displayed on the background image

January 10, 2015
- Fixed the button functions to go to new screens.
- Photoshopped bagkround images for settings, instructions, and difficulty

January 11, 2015
- Settings will have checkboxes for two backgrounds to the main game
- Difficulty will have three settings to determine how much the mouse can affect the movement of the ball when playing the game
- Discussed the differences between difficulties in the game.

January 12, 2015
- Radio buttons and back buttons have been added to settings and difficulty.
- Photoshopped screens for settings, difficulty, and instructions with buttons and text.

January 13, 2015
- Initialized the starting conditions (set selected on the radio buttons)
- Started on game method 
- Added functions to all of the buttons and radioButtons so far
- Still need to draw bowling ball and bowling pin shapes for the game

January 14, 2015
- Worked on animations and drawing objects

January 15, 2015
- Further researched animations
- Drew the bowling ball and started implementing MouseListener to its movement

January 16, 2015
- Circle made to be animated
- Reorganized code
- Created backgrounds for all the different options of settings and difficulty
- Wrote scoring algorithm
- Implemented settings and background options into the game interface
- Changed scoreboard to be compatible with changes made within the game
- Generated the subscreens inside of the game (gameScreen, mouseSpace, buttonScreen, scoreBoard)
- Finished on moving the ball to different parts of the lane
- Generated bowling pins at the end of the lane
