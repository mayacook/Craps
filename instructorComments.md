INSTRUCTOR COMMENTS
===================

This is a great little program, and it follows the rules
of Craps perfectly. I especially like the nice little
box you put around the instructions--including something
like that takes a little bit of extra work!--and you 
went on to make that "frame" feature part of the rolling
process as well. Very nice touch.

There were some minor issues that you should fix. One
is easy: whenever you accept a default value ([Enter] 
for yes, for example), you should indicate what the
default value is by capitalizing that letter in the
prompt. 

    Would you like instructions (Y/n)?

... indicates that pressing [Enter] or pressing "y" will
cause the instructions to be displayed. The user has to
explicitly press "n" if they don't want the instructions.

Or, you could make no instructions the default:

    Would you like instructions (y/N)?

Also, I had some difficulty playing the game again:

    Do you want to play craps?(y/n)
    y

    Let's get started!

    Would you like instructions(y/n):
    n
    Ready to play? Good luck...

    <Enter> for first roll...

    --------FIRST ROLL-------+
    You rolled a 11          |
                             |
           +--------+        |
           |You win!|        |
           +--------+        |
                             |
    -------------------------+

    Have a nice day!

    Program terminating...
    Do you want to play craps?(y/n)
    y

    Have a nice day!

    Program terminating...
    Do you want to play craps?(y/n)
    y

    Have a nice day!

    Program terminating...
    Do you want to play craps?(y/n)
    y

    Have a nice day!

    Program terminating...
    Do you want to play craps?(y/n)

Looks like there are a few things still to fix. Otherwise,
excellent work. Any reason why this was late?

SCORE: 45/50

