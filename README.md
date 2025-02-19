# Banking-Application
It is a Java based simple application that shows the fundamental functionalities
This Java project provides a foundational implementation of a command-line banking application, designed to illustrate core banking functionalities in a simplified manner.  It allows users to interact with a simulated banking system through a menu-driven interface.  The application manages a collection of bank accounts, each identified by a unique account number.  

The project encompasses the following key features:

Deposit: Registered users can deposit funds into their accounts. The application checks for the validity of the account number and ensures that the deposit amount is not negative. Upon successful deposit, the account balance is updated accordingly.

Withdrawal: Users can withdraw funds from their accounts. The application verifies the account number, checks for sufficient funds to cover the withdrawal, and ensures the withdrawal amount is non-negative. If the withdrawal is valid, the account balance is reduced.

Balance Inquiry: Users can check the current balance of their accounts by providing their account number. The application retrieves and displays the balance associated with the given account.

The application incorporates basic input validation to handle common user errors, such as attempting to deposit or withdraw negative amounts, It uses the Scanner class for input processing and provides clear prompts to guide the user through the available options.
