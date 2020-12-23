'''
Asks for the number of numbers the user wants to sum, then asks for each number
and sums them
'''
#input the number of numbers you want to add up
# and add 'em up!'
OG_num = int(input("Hey, how many numbers do you want to add?: "))
total = 0

#while the input is greater than 0, the loop is run and asks for more inputs then adds them up
while OG_num > 0:
    number = int(input("Number: "))
    total += number
    OG_num -= 1

print("The sum of your numbers is: " + str(total))
