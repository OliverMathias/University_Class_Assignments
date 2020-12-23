'''
A script that takes a user's input (in seconds) and converts it to days, hours, mins, and seconds
quotients and integers dividing from largest units to smallest units
'''

#requests user input
time_seconds = int(input("Please input a number (seconds) between 1 & 86400: "))

# finds floor division of units and quotient remainder
#then tries floor division to the next smaller unit

hours = time_seconds // 3600
pre_mins = time_seconds % 3600
mins = pre_mins // 60
secs = pre_mins % 60

#prints output with unit labels
print(str(hours) + " Hours")

print(str(mins) + " Mins")

print(str(secs)+ " Secs")
