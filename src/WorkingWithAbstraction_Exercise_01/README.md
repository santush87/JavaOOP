<h2>Problem 1.	Card Suit</h2>
<p>Create an enumeration type that has as its constants the four suits of a deck of playing cards (CLUBS, DIAMONDS, HEARTS, SPADES). Iterate over the values of the enumeration type and print all ordinal values and names. </p>
<h3>Examples</h3>

![Screenshot_1](https://user-images.githubusercontent.com/73018624/180030782-9b087953-1d79-4fb2-91c6-9089520fd360.jpg)

<h2>Problem 2.	Card Rank</h2>
<p>Create an enumeration type that has as its constants the thirteen ranks of a deck of playing cards (ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING). Iterate over the values of the enumeration type and print all ordinal values and names.</p>
<h3>Examples</h3>

![Screenshot_2](https://user-images.githubusercontent.com/73018624/180031121-8dcd0e91-4862-4032-8673-30f494a01b0c.jpg)

<h2>Problem 3.	Cards with Power</h2>
<p>Create a program that generates a deck of cards (class Card) that have power. The power of a card is calculated by adding the power of its rank plus the power of its suit.</p>
<p>Rank powers are as follows: (ACE - 14, TWO - 2, THREE - 3, FOUR - 4, FIVE - 5, SIX - 6, SEVEN - 7, EIGHT - 8, NINE - 9, TEN - 10, JACK - 11, QUEEN - 12, KING - 13).</p>
<p>Suit powers are as follows: (CLUBS - 0, DIAMONDS - 13, HEARTS - 26, SPADES - 39).</p>
<p>You will get a command consisting of two lines. On the first line, you will receive the Rank of the card and on the second line, you will get the suit of the card.</p>
<p>Print the output in the format: "Card name: {card name} of {suit name}; Card power: {power of rank + power of suit}".</p>
<h3>Examples</h3>

![Screenshot_1](https://user-images.githubusercontent.com/73018624/180191496-d60b788b-2e0f-4e81-b552-fa29e5f1e6b8.jpg)


<h2>Problem 4.	Traffic Lights</h2>
<p>Implement a simple state machine in the form of a traffic light. Every traffic light has three possible signals - red, green, and yellow. Each traffic light can be updated, which changes the color of its signal (e.g. if it is currently red, it changes to green, if it is green it changes to yellow). The order of signals is red -> green -> yellow -> red and so on.</p>
<p>On the first line, you will be given multiple traffic light signals in the format "RED GREEN YELLOW". They may be 3, more, or less than 3. You need to make as many traffic lights as there are signals in the input.</p>
<p>On the second line, you will receive the n number of times you need to change each traffic light's signal.</p>
<p>Your output should consist of n number of lines, including each updated traffic light's signal. To better understand the problem, see the example below.</p>
<h3>Examples</h3>

![Screenshot_2](https://user-images.githubusercontent.com/73018624/180191770-a2c03883-a3dc-4a1a-beec-943781418e1a.jpg)


<h2>Problem 5. Jedi Galaxy</h2>
<p>Peter is Jedi and so he starts gathering stars to grow stronger.</p>
<p>His galaxy is represented as a two-dimensional array. Every cell in the matrix is a star that has a value. Peter starts at the given col and row. He can move only on the diagonal from the lowest left to the upper right and adds to his score all the stars (values) from the cells he passes through. Unfortunately, there is always an Evil power that tries to prevent his success. </p>
<p>Evil power starts at the given row and col and instantly destroys all-stars on the opposite diagonal – From the lowest right to the upper left. </p>
<p>Peter adds the values only of the stars that are not destroyed by the evil power.</p>
<p>You will receive two integers, separated by space, which represent the two-dimensional array - the first being the rows and the second being the columns. Then, you must fill the two-dimensional array with increasing integers starting from 0, and continuing on every row, like this:</p>
<p>first row: 0, 1, 2… m</p>
<p>second row: n+1, n+2, n+3… n + n.</p>
<h3>Examples</h3>

![Screenshot_2](https://user-images.githubusercontent.com/73018624/180593920-6d92a5d5-db4f-4697-86bb-5b34715b8ff2.jpg)

<p>The input ends when you receive the command "Let the Force be with you". When that happens, you must print the value of all-stars that Peter has collected successfully.</p>
<h3>Input</h3>
<p>•	On the first line, you will receive the number N, M -> the dimensions of the matrix. You must then fill the matrix according to these dimensions.</p>
<p>•	On the next several lines you will begin receiving 2 integers separated by a single space, which represent Peter’s row and col. On the next line, you will receive the Evil Power’s coordinates.</p>
<p>•	There will always be at least 2 lines of input to represent at least 1 path of Peter and the Evil force.</p>
<p>•	When you receive the command, "Let the Force be with you" the input ends.</p>
<h3>Output</h3>
<p>•	The output is simple. Print the sum of the values from all-stars that Peter has collected.</p>
<h3>Constraints</h3>
<p>•	The dimensions of the matrix will be integers in the range [5, 2000].</p>
<p>•	The given rows will be valid integers in the range [0, 2000].</p>
<p>•	The given columns will be valid integers in the range [-231 + 1, 231 - 1]. </p>
<h3>Examples</h3>

![Screenshot_3](https://user-images.githubusercontent.com/73018624/180594040-d3524451-0072-41c1-958c-2fbef7d87793.jpg)


<h2>Problem 6. Greedy Times</h2>
<p>Finally, you have unlocked the safe and reached the treasure! Inside there are all kinds of gems, cash in different currencies, and gold bullions. Next to you, there is a bag which unfortunately has limited space. You don’t have much time so you need to take as much wealth as possible! But to get a bigger amount of the most valuable items, you need to keep the following rules:</p>
<p>•	The gold amount in your bag should always be more than or equal to the gem amount at any time</p>
<p>•	The gem amount should always be more than or equal to the cash amount at any time</p>
<p>If you read an item that breaks one of these rules you should not put it in the bag. You should always be careful not to exceed the overall bag’s capacity because it will tear down and you will lose everything! You will receive the content of the safe on a single line in the format "{item} {quantity}" pairs, separated by whitespace. You need to gather only three types of items:</p>
<p>•	Cash - All three letter items </p>
<p>•	Gem - All items which end on "Gem" (at least 4 symbols)</p>
<p>•	Gold - this type has only one item with the name - "Gold"</p>
<p>Each item that does not fall in one of the above categories is useless and you should skip it. Reading item’s names should be CASE-INSENSITIVE, except when the item is Cash. You should aggregate items’ quantities that have the same name.</p>
<p>If you’ve kept the rules you should escape successfully with a bag full of wealth. Now it’s time to review what you have managed to get out of the safe. Print all the types ordered by the total amount in descending order. Inside a type, order the items first alphabetically in descending order and then by their amount in ascending order. Use the format described below for each type.</p>

<h3>Input</h3>
<p>•	On the first line, you will receive a number that represents the capacity of the bag.</p>
<p>•	On the second line, you will receive a sequence of item and quantity pairs.</p>
<h3>Output</h3>
<p>Print only the types from which you have items in the bag ordered by Total Amount descending. Inside a type order, the items are first alphabetically in descending order and then by an amount in ascending order. Use the following format for each type:</p>
<p>"<{type}> ${total amount}"</p>
<p>"##{item} - {amount}" - each item on new line</p>

<h3>Constraints</h3>
<p>•	Bag’s max capacity will always be a positive number.</p>
<p>•	All quantities will be positive integer in the range [0 … 2100000000].</p>
<p>•	Each item of type gem will have a name - at least 4 symbols.</p>
<p>•	Time limit: 0.1 sec. Memory limit: 16 MB.</p>

<h3>Examples</h3>

![Screenshot_4](https://user-images.githubusercontent.com/73018624/180594197-701ef2e6-05c4-494a-ade7-69a55a25f8e5.jpg)
