# Java-Programs
Currency Converter

Description

This is a simple Java-based currency converter that allows users to convert an amount in Indian Rupees (INR) to various foreign currencies, including:

US Dollar (USD)

Euro (EUR)

British Pound (GBP)

Pakistani Rupee (PKR)

Features

Accepts user input for the amount in INR

Provides a list of available currencies

Converts INR to the selected currency based on predefined exchange rates

Displays the converted amount

Prerequisites

Java Development Kit (JDK) installed (Version 8 or higher recommended)

A Java IDE or command-line interface to run the program

How to Run

Clone the repository or download the CurrencyConverter.java file.

Open a terminal or command prompt.

Navigate to the directory where the file is saved.

Compile the Java program using:

javac CurrencyConverter.java

Run the program using:

java CurrencyConverter

Follow the on-screen instructions to enter an amount and choose a currency.

Exchange Rates Used

The following exchange rates are hardcoded in the program:

1 USD = 86.56 INR

1 EUR = 90.25 INR

1 GBP = 107.74 INR

1 PKR = 0.310 INR

#Stone-Paper-Scissors Game

Overview

This is a simple Java-based Stone-Paper-Scissors game where a user competes against the computer (bot). The bot randomly selects an option, and the user inputs their choice. The winner is determined based on the standard rules of the game.

How to Play

Run the Java program.

You will be presented with three choices:

1 for Stone

2 for Paper

3 for Scissors

Enter your choice as a number (1, 2, or 3).

The bot will randomly generate its choice.

The result will be displayed:

"User Wins" if the user wins.

"Bot Wins" if the bot wins.

"Draw" if both select the same option.

Rules

Stone beats Scissors

Scissors beats Paper

Paper beats Stone

If both select the same option, the game results in a draw.

Prerequisites

Java Development Kit (JDK) installed

A Java-compatible IDE or command-line interface

How to Run the Game

Save the Java file as Game.java.

Open a terminal or command prompt and navigate to the file location.

Compile the program using:

javac Game.java

Run the program using:

java Game

Follow the on-screen instructions to play.

Example Output

     WELCOME

1.Stone 2.Paper 3.Scissor
Enter option:
2
User: Paper Bot: Stone
User Wins

Enhancements

Add a loop to allow multiple rounds without restarting the program.

Keep track of user and bot scores.

Improve input validation to handle incorrect inputs gracefully.



