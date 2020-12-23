
# A simple game of Pig, two players roll a 6 sided die
# and the first one to reach 100 points wins
# players can choose to hold after scoring a certain number
# of points to preserve their score for the turn
# or risk rolling a 1 and losing all the points for that turn


#imprts random for roll and os for clearing console
import random
import os


#clears console and gives user direction
os.system('cls') # on windows
os.system('clear') # on linux / os x
print("This is a simple game of Pig, roll a die, try to get to 100 ")
print("points first. If you roll a 1, all points for that turn are lost.")
print("you can also hold and save the points won in that round.")
print("Good Luck!")

#sets control variables and total score variables
turn_int = 1
human_total = 0
ai_total = 0


#biggest while loop for tracking player scores
while human_total or ai_total < 100:

    #if you win, you win
    if human_total > 100:
        print("You won!")
        print()
        exit()
        break

    #resets variables for each turn loop
    roll_sum_turn = 0
    roll_sum_computer = 0

    #it's the human's turn when turn_int == 1
    while turn_int == 1:
        #ask user for input to hold or roll
        choice = input("Would you like to roll (r), or hold (h)?:  ")
        # if roll, gets rand num
        if choice == "r":
            roll = random.randint(1,6)
            # if you roll a 1, takes ur points and gives computer the turn
            if roll == 1:
                print("You rolled a 1, it's now the Computer's Turn")
                roll_sum_turn = 0
                turn_int = 0
                break
            # else it gives you the points and adds to turn total
            else:
                os.system('cls') # on windows
                os.system('clear') # on linux / os x
                print("You rolled a", roll)
                roll_sum_turn += roll
                print()
                print("Computer's Score:", ai_total)
                print("Your Score:", human_total)
                print("Your current turn total is:", roll_sum_turn)
                print()
                continue

        # if hold, adds roll total to game total and gives computer the turn
        if choice == "h":
            os.system('cls') # on windows
            os.system('clear') # on linux / os x
            print("You held for this round.")
            human_total += roll_sum_turn
            roll_sum_turn = 0
            turn_int = 0
            break

        # if you don't know how to spell goodly it tells you
        if choice is not 'r' or 'h':
            print('Make sure to input either an "r" or an "h" ')
            continue


    #computer's turn control variable
    while turn_int == 0:
        #if computer's score is greater than 100 they win
        if ai_total > 100:
            print("Computer won!")
            print()
            exit()
            break
        #makes a roll, random int
        roll_comp = random.randint(1,6)
        # if the computer doesn't roll a 1 or doesn't already have 20 then it rolls again
        if roll_comp != 1 and roll_sum_computer <20:
            roll_sum_computer += roll_comp
            continue
            # if the computer has more than 20 points
            # for the round, it adds it to the game total
        elif roll_sum_computer >= 20:
            os.system('cls') # on windows
            os.system('clear') # on linux / os xx
            print("Computer earned max points for this round:", roll_sum_computer)
            print("it's your turn")
            print()
            ai_total += roll_sum_computer
            turn_int = 1
            print("Computer's Score:", ai_total)
            print("Your Score:", human_total)
            break
        #if the computer rolls a 1, all points for turn are taken away
        # and it becomes the human's turn
        elif roll_comp == 1:
            os.system('cls') # on windows
            os.system('clear') # on linux / os x
            print("The computer rolled a 1 somewhere in it's turn!")
            print("It's your turn")
            print()
            print("Computer's Score:", ai_total)
            print("Your Score:", human_total)
            print("The Computer's Previous Roll was a:", roll_comp)
            print()
            roll_sum_computer = 0
            turn_int = 1
            break
#end of loop to see who won
else:
    print("The Computer Wins this Round")
