'''
This script asks for sales tax rate and sales price from the user to caculate
their total purchase cost. It takes the inputs as ints and converts them to floats.
Changing the raw % into a decimal to be used easier in equations. Then simply
multiplies the price of the item by 1+the tax rate in decimal form, and prints it out.
While checking that inputs are valid (positive numbers)
'''
sales_tax_raw = float(input("Hey, what's the sales tax in your area? %"))

if sales_tax_raw >= 0:
    sales_tax_dec = (sales_tax_raw / 100)
    sales_price = float(input("Whoa, and what's the price of the item you want to buy? $"))

    if sales_price >= 0:
        total_price = float(sales_price) * (1 + sales_tax_dec)

        print("You're gonna have to pay ${:.2f}".format(float(total_price)))

    else:
        print("Invalid sales price man")

else:
    print("Thats an invalid sales tax bro")
