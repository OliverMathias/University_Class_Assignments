'''
Adds up all natural numbers below the user's input and their input
'''

# kind of like addition factorial

# takes user input for top number and sets the total == 0; true
input = int(input("Hey input a # and I'll add up every number between it and 0 for some reason...: "))
total = 0

#while the users input is > 0 it adds it to the total and subtracts 1 from input then adds it
while input > 0:
    total += input
    input = input -1

#prints a pretty answer
print("The answer is " + str(total))
