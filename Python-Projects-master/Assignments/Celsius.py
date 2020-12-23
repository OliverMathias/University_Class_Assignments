'''
A script that converts a user's celsius input into farenheight by using
the formula and prints out an temp in farenheight
'''
#gets user's temp Input
temp_c = float(input("Please enter the current temperature in celsius: "))

# turns it into farenheight
temp_f = temp_c*(9/5) + 32

#prints out farenheight
print("The current temp in farenheight is "+str(temp_f))
