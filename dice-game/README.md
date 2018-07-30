##Dice Game - One throw of the dice
I want a program that outputs the result of a random dice throw. We will be using standard dice with 6 sides for this game.

##Dice Game part 2 - Several throws of the dice
The player/game must throw 5 standard dice at once instead of 1. We want the output of all 5 dice.

##Dice Game part 3 - Rethrow some dice
The player can throw the dice a maximum of 3 times. However with the rethrows, there is an extra rule: The player may not rethrow every dice.
The dice that have the same results cannot be thrown again.
For example:
In throw 1 the player throws 4, 5, 6, 4, 1. In the rethrow she may only throw 3 dice, since she has "lost" the two equal dice (in this case, those which show the number 4).
In throw 2 she throws 1, 5, 3. In the last throw she can still use 3 dice.
In throw 3 she throws 1, 1 and 5.

In all throws but the final throw, the score is the sum of all the repeated results. So in throw 1, she scores 8 (2 times 4). In throw 2 she scores nothing, since she had no duplicated results.
In the final throw we count all the results, so she scores 7 and her final score is 15.

It is possible that the player's turn ends after 1 or 2 throws.

##Dice Game part 4 - Nobody likes to play alone
The final part of this game is very simple: Noboby likes to play alone. The application should now give the throws and the scores of multiple players.
The application should also output the ranking of the players (eg 1st, 2nd, 3rd, 4th). The number of players should be random, between 2 and 4.

##Dice Game part 5 - Role-playing
My girlfriend is jealous of our game/application. She likes to play role-playing games and she would like to use our game, there is only one problem.
In the role-playing world they don't always use 5 dices or standard dices. Can you adjust the game so that you can give any number of dices to play with and any number of sides for the dices.
All the dices must have equal sides and the rules of the game don't change.
For example: You can play the game with 10 dices, and a dice has 20 sides. But all the dices are the same and have 20 sides.