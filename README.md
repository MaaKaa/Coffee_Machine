A simple console app that is a coffee-machine simulator. Done within the Hyperskill.org course.

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Features](#features)
* [Status](#status)
* [Contact](#contact)

## General info
The machine works with quite typical products: coffee, milk, sugar, and plastic cups; if it runs out of something, it shows a notification. The machine can make three types of coffee: espresso, cappuccino and latte. Since nothing’s for free, it also collects the money.

## Technologies
* Java 8
* Gradle 4.8.1
* IntelliJ IDEA Ultimate
* Hyperskill.org

## Features
Let's simulate an actual coffee machine. It has a limited supply of water, milk, coffee beans, and disposable cups. Also, it counts how much money it gets for selling coffee. 
The coffee machine has several options: 
* first, it needs to be able to sell coffee. It can make different varieties of coffee: espresso, latte, and cappuccino. Of course, each variety requires a different amount of supplies, except that all of them requires only one disposable cup.
* second, the coffee machine should be able to get replenished by a special worker.
* third, another special worker should be able to take money from the coffee machine.

The program shows a Main Menu. Then, it reads one line from standard input, which can be:
* "buy" – to display another menu, allowing user to choose a type of coffee that (s)he wants to buy.
* "fill" – allows to  fill out all the supplies for the coffee machine by asking the user how much water, milk, coffee beans and how many disposable cups he wants to add into the coffee machine,
* "take" – allows to take the money from the coffee machine,
* „remaining” - displays the state of the coffee machine (e.g. how much milk does it have, etc.),
* „exit” - quits the program.

If the user writes "buy" then he must choose one of three varieties of coffee that the coffee machine can make: espresso, latte, or cappuccino.

    • For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4. 
    • For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7. 
    • And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee. It costs $6. 

If the coffee machine doesn’t have enough resources to make a coffee, it displays a special message.

## Status
Project is: completed.

## Contact
Created by [Marzena Kacprowicz](http://zrobtowinternecie.pl/) - feel free to contact me!
