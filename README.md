# Product Management System

This is a Java program that implements a simple product management system for an online shop. It includes a `Product` class and its subclasses `Smartphone`, `Television`, and `Headphones`, which inherit from the `Product` class.

## Product Class

The `Product` class represents a generic product in the shop. It has the following attributes:

- `code` (integer)
- `name`
- `description`
- `price`
- `vat`

The access levels of the attributes are set appropriately, with the `code` attribute being read-only, and the others accessible for both reading and writing. The class provides getter and setter methods for the attributes.

The `Product` class also exposes two utility methods:

- `getBasePrice()`: Returns the base price of the product.
- `getPriceWithVAT()`: Returns the price of the product including VAT.

## Subclasses

The program includes three subclasses that inherit from the `Product` class:

### Smartphone Class

The `Smartphone` class represents a smartphone product and adds two additional attributes:

- `imei` (integer)
- `memory` (quantity of memory)

### Television Class

The `Television` class represents a television product and adds two additional attributes:

- `dimensions`
- `smart` - indicates whether the television is a smart TV or not.

### Headphones Class

The `Headphones` class represents a headphones product and adds two additional attributes:

- `color`
- `bluethoot` - indicates whether the headphones are wireless or wired.

## Shopping Cart (Carrello) Class

The `Carrello` class serves as the main class with the `main` method. It allows the user to create a shopping cart by entering product details via a scanner. During the input process, the user is asked to specify whether they are adding a smartphone, a television, or headphones. Based on their choice, the appropriate constructor is used to create the corresponding object.

At the end of the input process, the program prints a summary of the shopping cart by overriding the `toString` method for each class.

## Usage

To run the program, follow these steps:

1. Clone the repository to your local machine.
2. Compile the Java files using a Java compiler.
3. Run the program using the `java Carrello` command.

Please note that this is a simplified implementation for educational purposes and does not include features such as persistence or validation.

Enjoy shopping!
