# AP CS Text-based Adventure Game

Note from teacher: never store Java class files in the source repository (e.g., anything in the "out" directory). Always let the user rebuild the Java class files targeted to the particular version of the JDK that they're using. (BTW, you should not be using a JDK later than version 8.)

## Note from dean:
Level one is now finished and playable, I don't think there are any bugs, and I connected it to level 2. Also, for level 2 and 3 people I added a way to teleport instantly to your starting rooms for play-testing purposes. For level 2 it's: "go l2" and for level 3 it's: "go l3." It only works from the starting room so make sure you do it from there. When the game is finished we can delete them.

## Note From Derek:
Infinite Room Should be done. It just needs to be added to the path system for level 3 which we currently don't have mapped... Make sure the add path method is:
<previous_room>.addPath("<direction>", new InfiniteRoom());
Also, I'm not sure if we have any "openable" items so I didn't bother adding the turnAdder method to the actions of close, open, get, etc.
P.S. has anyone from floor 3 made progress on the rooms themselves?

## Note From Mr. Bob (11/2)
Add support for command "Put crystal in door" or "Put crystal in wall" in the dark room on level 1.
Didn't understand how to use or drink the potion to get past the lava.