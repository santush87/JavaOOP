<h2>1.	Class Box</h2>
<p>You are given a geometric figure Box with fields length, width, and height. Model a class Box that can be instantiated by the same three parameters. Expose to the outside world only methods for its surface area, lateral surface area, and its volume (formulas: http://www.mathwords.com/r/rectangular_parallelepiped.htm).</p>
<p>On the first three lines, you will get the length, width, and height. On the next three lines print the surface area, lateral surface area, and the volume of the box.</p>
<p>A box’s side should not be zero or a negative number. Add data validation for each parameter given to the constructor. Make a private setter that performs data validation internally.</p>

![Screenshot_6](https://user-images.githubusercontent.com/73018624/198255871-337aa545-bb69-446d-ba9b-796c77823671.jpg)

<h3>Examples</h3>

![Screenshot_7](https://user-images.githubusercontent.com/73018624/198255982-9e05af11-547d-4795-beff-7c9d1ef94796.jpg)

<h2>2.	Animal Farm</h2>
<p>You should be familiar with encapsulation already. For this problem, you’ll need to create a class called Chicken. Chicken should contain several fields, a constructor, and several methods. Your task is to encapsulate or hide anything that is not intended to be viewed or modified from outside the class.</p>

![Screenshot_6](https://user-images.githubusercontent.com/73018624/198869484-3d0261f2-ef47-49c1-905b-105eaa18334e.jpg)

<p>Chicken lives for 15 years. Chicken has a name for sure, at least 1 symbol long. Chicken producing eggs:</p>
<p>•	First 6 years it produces 2 eggs per day [0 - 5].</p>
<p>•	Next 6 years it produces 1 egg per day [6 - 11].</p>
<p>•	And after that, it produces 0.75 eggs per day.</p>

<h2>3.	Shopping Spree</h2>
<p>Create two classes: class Person and class Product. Each person should have a name, money, and a bag of products. Each product should have a name and cost. The name cannot be an empty string. Be careful about white space in the name. Money and cost cannot be a negative number.</p>

![Screenshot_1](https://user-images.githubusercontent.com/73018624/199023292-20b87a78-7255-45bd-98d4-26a99fa81d18.jpg)

<p>Create a program in which each command corresponds to a person buying a product. If the person can afford a product add it to his bag. If a person doesn’t have enough money, print an appropriate exception message:
"{Person name} can't afford {Product name}"
</p>
<p>In the first two lines, you are given all people and all products. After all, purchases print every person in the order of appearance and all products that he has bought also in order of appearance. If nothing is bought, print: 
"{Person name} - Nothing bought".
</p>
<p>Read commands till you find the line with the "END" command. In case of invalid input (negative money exception message: "Money cannot be negative") or empty name: (empty name exception message "Name cannot be empty") break the program with an appropriate message. See the examples below:</p>
<h3>Examples</h3>

![Screenshot_2](https://user-images.githubusercontent.com/73018624/199023646-ba7596f3-5bac-423d-b81f-c9192d77a60a.jpg)

<h2>4.	Pizza Calories</h2>
<p>A Pizza is made of dough and different toppings. You should model a class Pizza which should have a name, dough, and toppings as fields. Every type of ingredient should have its class.</p>

![Screenshot_2](https://user-images.githubusercontent.com/73018624/199567111-311ca3c0-f986-4cbd-8b3f-3c18b89e2667.jpg)

<p>Every ingredient has different fields: the dough can be white or wholegrain and in addition, it can be crispy, chewy, or homemade. The toppings can be of type meat, veggies, cheese, or sauce. Every ingredient should weigh grams and a method for calculating its calories according to its type. Calories per gram are calculated through modifiers. Every ingredient has 2 calories per gram as a base and a modifier that gives the exact calories.</p>

![Screenshot_3](https://user-images.githubusercontent.com/73018624/199567274-71ccefeb-ba49-416d-8ef2-5c39afbd4e15.jpg)

<p>Your job is to model the classes in such a way that they are properly encapsulated and to provide a public method for every pizza that calculates its calories according to the ingredients it has.</p>

![Screenshot_4](https://user-images.githubusercontent.com/73018624/199567476-09e2e1e1-94e5-44ad-8d42-a5b16c15fd75.jpg)

<p>For example, the white dough has a modifier of 1.5, a chewy dough has a modifier of 1.1, which means that a white chewy dough weighing 100 grams will have (2 * 100) * 1.5 * 1.1 = 330.00 total calories.</p>
<p>For example, meat has a modifier of 1.2, which means that meat weighing 50 grams will have (2 * 50) * 1.2 = 120.00 total calories.</p>
<h3>Data Validation</h3>
<p>Data Validation must be in the order of the Input Data.</p>
<p>•	If an invalid flour type or an invalid baking technique is given an exception is thrown with the message "Invalid type of dough.".</p>
<p>•	If dough weight is outside of the range [1..200] throw an exception with the message "Dough weight should be in the range [1..200]."</p>
<p>•	If topping is not one of the provided types throw an exception with the message "Cannot place {name of invalid argument} on top of your pizza."</p>
<p>•	If topping weight is outside of the range [1..50] throw an exception with the message "{Topping type name} weight should be in the range [1..50].".</p>
<p>•	If the name of the pizza is empty, only whitespace or longer than 15 symbols throw an exception with the message "Pizza name should be between 1 and 15 symbols.".</p>
<p>•	If a number of toppings are outside of the range [0..10] throw an exception with the message "Number of toppings should be in range [0..10].".</p>
<p>The input for a pizza consists of several lines:</p>
<p>•	On the first line is the pizza name and the number of toppings it has in the format: 
Pizza {pizzaName} {numberOfToppings}
</p>
<p>•	On the second line you will get input for the dough in the format: 
Dough {flourType} {bakingTechnique} {weightInGrams}
</p>
<p>•	On the next lines, you will receive every topping the pizza has, until an"END" command is given: 
Topping {toppingType} {weightInGrams}
</p>
<p>If the creation of the pizza was successfully printed on a single line the name of the pizza and the total calories it has rounded to the second digit after the decimal point.</p>

<h3>Examples</h3>

![Screenshot_5](https://user-images.githubusercontent.com/73018624/199568166-c96835d8-1935-4e58-adf0-03688441a543.jpg)

<p></p>
