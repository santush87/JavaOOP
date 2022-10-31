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


