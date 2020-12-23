'''
This assignment is a choose your own adventure game set in
space, the objective is to save the planet earth and NOT die.
'''
#importing os for clearing terminal
#importing sys for exiting script
#importing random to calculate death variable
import os
import sys
import random

# variable creation & setting loop control variable
next_room = 1
# generates a random number
death_die = random.randint(1,100)
#gives player the rules and the introduction to the story
#clears terminal
os.system('cls')
os.system('clear')
print()
print('Welcome to Adventure.py! A few notes before we begin... ')
print()
print('THE RULES:')
print('1: All words in " " represent valid inputs you, as the user can enter when prompted.  ')
print('2: Whenever you want to stop playing, just head for the "escape_pod" and the game will end.')
print('3: Always Floss (this one is more of a life rule)')
print()
print('And rememmber, nothing is off limits....')
print()
print('________________________________________________________')
print()
print('You awaken in a small white room. The sun shining, through a round, well sealed window with strange intensity into your eyes.' )
print('You find the scene all very ordinary, except for the fact that that you are floating away from your bed. Only loose straps hold you in place')
print('Without any memory of how or why you got into this situation, you float over to the window to make sure....')
print('Below you see the slowly rotating blue/green marble you call home. it\'s beauty accentuated by the sun\'s angle and the swirling clouds.')
print()

while next_room != 0:
    if next_room == 1:
        print()
        print()
        print('In the small room, you notice three labled doors, which read "closet" "hall" and "bathroom"')
        print()
        choice = input('Would you like to go into the "closet" the "hall" or the "bathroom"? ')
        if choice == 'closet':
            if death_die > 95:
                os.system('cls')
                os.system('clear')
                print("A small meteor hits the spaceship, and sucks you into the vaccume of space.")
                next_room = 0
            else:
                next_room = 2
                death_die = random.randint(1,100)
        elif choice == 'hall':
            next_room = 3
        elif choice == 'bathroom':
            next_room = 6
        else:
            os.system('cls')
            os.system('clear')
            print(choice, " wasn't one of the options. Try again." )

    # section for choosing 'closet'
    elif next_room == 2:
        os.system('cls')
        os.system('clear')
        print('You find yourself in a closet, with only a crate in the corner and a view of the rotating earth below...' )
        print()
        choice = input('Do you want to look in the "crate" or go "back"? ')
        if choice == "back":
            next_room = 1
        elif choice == "crate":
            os.system('cls')
            os.system('clear')
            print("Your eyes open wide in shock as you see 10,000 dip 'n dots fly out from the box, you try to float away but the dots are too fast. You are suffocated in a milky cloud of death.")
            next_room = 0
        else:
            print('')
            print(choice, " wasn't one of the options. Try again." )

    # section for choosing 'hall'
    #provides description of hallway and randomizes death variable
    #uses loop to ask user what room they want to enter
    elif next_room == 3:
        os.system('cls')
        os.system('clear')
        death_die = random.randint(1,100)
        print('You begin floating down a long, white hallway, a cramped space with a mess of tubes and blinking lights.')
        print('As you float slowly farther you notice four labled doors. "observation" "escape_pod" "off_limits" and "room"')
        print('')
        choice = input('Do you want to go into "observation" "escape_pod" "off_limits" or "room"? ')
        if choice == "observation":
            if death_die > 92:
                os.system('cls')
                os.system('clear')
                print('Before you could enter the room, shrapnel from one of Elon Musk\'s rockets hits your ship\'s ')
                print('oxygen tank and you suffocate within minutes')
                next_room = 0
            else:
                next_room = 5
        elif choice == "escape_pod":
            if death_die > 92:
                os.system('cls')
                os.system('clear')
                print('Before you could enter the room, shrapnel from one of Elon Musk\'s rockets hits your ship\'s ')
                print('oxygen tank and you suffocate within minutes')
                next_room = 0
            else:
                next_room = 4
        elif choice == "room":
            if death_die > 99:
                os.system('cls')
                os.system('clear')
                print('Before you could enter the room, shrapnel from one of Elon Musk\'s rockets hits your ship\'s ')
                print('oxygen tank and you suffocate within minutes')
                next_room = 0
            else:
                next_room = 1
        elif choice == "off_limits":
            os.system('cls')
            os.system('clear')
            print('You are pulled forward with immense force as you feel the air being sucked out of hall.')
            print('You feel the cold vaccume of space surrounding you as you are propelled forward. You know that it\'s only a matter of')
            print('time beofre you run out of oxygen and succumb to the fate we are all destined to.')
            print('With a final moot thought, you rememmber back to the words given you in the introduction to this game...')
            print()
            print('"nothing is off limits."')
            print()
            print('With a final chuckle your body grows limp and begins it\'s eternal voyage into deep space...')
            print()
            next_room = 0
        else:
            print(choice, " wasn't one of the options. Try again." )
#
#Below are the elif statements for each room you can enter,
#they contain code to exit the game, clear the terminal, die, and beat the game
#

    # section for choosing 'pod'
    elif next_room == 4:
        os.system('cls')
        os.system('clear')
        print('You strap into the high metal chair and flip a large switch that says "Exit Game" your pod jets off towards earth.')
        print('It\'ll be a long trip so you pop in your copy of "2001: a Space Odyssey" and enjoy the ride....')
        raise SystemExit

    # section for choosing 'observation'
    #final boss room, contains if & input statement to quiz user on monty python
    elif next_room == 5:
        os.system('cls')
        os.system('clear')
        print('You enter an immense white room, your jaw drops as you realize that the entire left wall is made completely of glass. ')
        print('"What kind of purpose would this serve on a space station?"')
        print('The thought slowly leaves your mind as you stand in front of the most beautiful and un-filtered view of the earth any human has ever seen. It\'s plains')
        print('and mountains creating a chaotic while also nurtiring backdrop to heards of animals, lush forests and swirling')
        print('clouds. At that very moment you hear a robotic and malicious voice from behind you.')
        print()
        print('"Amazing view isn\'t it?" the voice says.')
        print()
        print('You turn to find a giant red camera lense on the back wall, seemingly sizing you up with it\'s AI efficiency.')
        print()
        print('"I would savor this view if I were you. Seeing as the Earth won\'t be around much longer."')
        print()
        print('The red lense seems to let slip a hint of pleasure as it watches your body freeze upon hearing this.')
        print()
        print('"Of course, destroying the earth would be too easy. I find it quite a bore to complete this task with my usual level of efficiency. although,')
        print('now I won\'t have to, seeing as you\'ve made your way into my chamber. I can finally have some fun."')
        print()
        print('"ASK ME ANY QUESTION" the red lense booms. "AND IF I CANNOT ANSWER IT, AND YOU CAN.... I WILL NOT DESTROY THE EARTH."' )
        print()
        print('You pause for a moment and consider your question carefully. You think back to your time in the space academy, all those multivariable calculus classes')
        print('wouldn\'t come in handy now, not against a computer.')
        print()
        print('OF Course! You rememmber an old 20th century earth film called "Monty Python and the Holy Grail." One')
        print('scene in particular that would be most impossible for a computer to answer. The knights who say NEE! ')
        print()
        print('You ask the red lense, "What do the knights of NEE use to chop down trees?"')
        print()
        print('The lens takes a moment to answer, you can see it\'s red light pulsing as it calculates it\'s response. "The only logical answer for that question, given the time period and phrasing would be an Axe."')
        print('You smile as you imagine the parades and celebrations that will be thrown in your honor on the earth below.')
        print()
        print('"Ha! a good try, but you should have known that you could never have outsmarted me" the computer booms.')
        print()
        print('"But I have", you reply. "You answered incorrectly!" The computer retorts')
        print('"Impossible! That was the only logical answer!!" The computer had not taken into account that humans are very often illogical. ')
        print()
        print('"No matter" the computer says. "YOU still have to anser the question. Even the most logical human is not as perfect as I."')
        print('')
        print("What is the answer to the question? (please answer in lowercase letters and correct spelling so the world doesn't blow up)")
        #checks user input to see if it matches the correct answer
        choice = input("The Knights of NEE Chop Down Trees with a _____: ")
        if choice == "herring":
            os.system('cls')
            os.system('clear')
            print('"ILLOGICAL! ILLOGICAL!" the computer shrieks with almost a human like pain. It cannot fathom the illogical, and it is that which has caused the failure of it\'s evil plan.')
            print()
            print('Earth is saved, and your parades shall begin shortly')
            raise SystemExit
        else:
            os.system('cls')
            os.system('clear')
            print('You float to the floor on your hands and knees. You know what you have typed was not the correct answer. You have doomed all of humanity and shamed your ancestor\'s name for as long as it will be know (which is about 25 more seconds)')
            next_room = 0

    # choice for bathroom
    #checks to make sure user wants to enter this room, then gives them description and spits them back out
    elif next_room == 6:
        os.system('cls')
        os.system('clear')
        print('You find yourself in a well lit, mechanical looking bathroom. There is a toilet in one corner and a series of straps and')
        print('plastic shrouds surrounding a shower. You wonder how the space station gets it\'s steady supply of fresh drinking water. You notice a')
        print('tube running from the toilet into a box in the corner of the room. You think to yourself "Hey that looks a lot like the water fountain from the')
        print('other side..... Huh." Well no time for such complex questions. You exit the bathroom back to the small white room you came from ')
        next_room = 1
