'''
This script will solve a quadratic equation for someone by asking for the variables
and using the quadratic formula in the back end. Checks the discriminates to see if they are negative, and either
tells the user they will have 1, 2 or no real roots
'''
#import cmath and talks to use
import math
print("I'm gonna help you solve a quadratic equation!! But first, I need some info...")

#asks for all necessary values & converts them to floats
a = float(input("What's the a value? "))
b = float(input("What's the b value? "))
c = float(input("What's the c value? "))

disc = b**2 - 4*a*c

if disc > 0:
    # 2 real roots
    #calculate roots using quadratic formula
    Quad_1 = (-b + math.sqrt(disc)) / (2 * a)
    Quad_2 = (-b - math.sqrt(disc)) / (2 * a)

    print("These are the root answers: {:.2f} & {:.2f}".format(Quad_1, Quad_2))


elif disc == 0:
    #1 real root
    root = -b/2*a
    print("the root is {:.2f}".format(root))
else:
    print("no real roots discrim is negative")
