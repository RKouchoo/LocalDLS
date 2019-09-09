
pizza = ["Small", "Medium", "Large"]
pizzaPrice = [10, 13, 16]
crust = ["Thin", "Thick"]
topping = ["Cheese", "Oninios", "Tomato", "Beef"]
toppingPrice [1, 2, 1, 3]
drink = ["Coke", "Sprite", "NoU", "Beer"]
drinkSize ["Small", "Medium", "Large"]

size = ""
while size not in pizza:
	size = input("Please enter a pizza size (Small, Medium or Large): ")

thickness = ""
while thickness not in crust:
	thickness = input("Please choose a pizza thickness (Thin or Thick): ")

toppings = []

print("Avaliable toppings: ")
print(topping)
numToppings = int(input("Please enter the number of toppings you would like to have: "))

topCount = 0
for topCount in range(0, numToppings):
	
	toppingSelection = ""
	while toppingSelection not in topping:
		toppingSelection = input("Please select a topping from the above list: ")

	toppings.append(toppingSelection)

drinks = []

print("Avaliable drinks: ")
print(drink)
numDrinks = int(input("Please enter the number of drinks you would like to have: "))

drinkCount = 0
for drinkCount in range(0, numDrinks):
	
	drinkSelection = ""
	while drinkSelection not in drink:
		drinkSelection = input("Please select a topping from the above list: ")

	drinks.append(drinkSelection)

drinkSizes = ""
while drinkSizes not in drinkSize:
	drinkSizes = input("Please choose a drink size (Small, Medium or Large): ")

toppings = []

address = input("Please enter your deliver address: ")


