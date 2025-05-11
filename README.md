# INVENTORY-MANAGEMENT-SYSTEM-JAVA-
Inventory Management System
This is a simple Inventory Management System built with Java, Hibernate, and Maven. The application allows users to manage products in an inventory system, enabling functionalities such as adding, listing, updating, and deleting products.

Features
Add Product: Allows the user to add a new product to the inventory, including product name, quantity, and price.

List Products: Displays all products currently in the inventory, showing their names, quantities, and prices.

Update Product: Enables the user to update the quantity of an existing product.

Delete Product: Allows for deleting products from the inventory.

Prerequisites
Before running the project, make sure you have the following installed:

Java (JDK 8 or above)

Apache Maven

MySQL or another relational database (optional)

Setup
1. Clone the Repository
To clone this repository, use the following command:

bash
Copy
Edit
git clone https://github.com/yourusername/inventory-management.git
2. Configure the Database
Set up a MySQL database (or another relational database) to store the product data.

You can create a database with the following command:

pgsql
Copy
Edit
CREATE DATABASE inventory_db;
Configure your hibernate.cfg.xml file to connect to the database by providing the correct credentials:

php-template
Copy
Edit
<property name="hibernate.connection.username">your_mysql_username</property>
<property name="hibernate.connection.password">your_mysql_password</property>
Optionally, create a table for products manually or let Hibernate auto-generate the schema.

3. Build the Project
Navigate to your project directory and run the following Maven command to build the project:

nginx
Copy
Edit
mvn clean install
This will download all necessary dependencies and compile your project.

4. Run the Application
To run the application, use the following Maven command:

bash
Copy
Edit
mvn exec:java -Dexec.mainClass="com.example.InventoryApp"
Alternatively, you can run the InventoryApp.java file directly from your IDE.

Usage
Once the application is running, you will see the following menu in the console:

mathematica
Copy
Edit
=== Inventory Menu ===
1. Add Product
2. List Products
3. Update Product
4. Delete Product
0. Exit
Add Product: You will be prompted to enter the product name, quantity, and price.

List Products: Displays all products in the inventory.

Update Product: Allows you to select a product and update its quantity.

Delete Product: Allows you to delete a product from the inventory by its ID.

Exit: Closes the application.

Technologies Used
Java: Core programming language.

Hibernate: ORM (Object-Relational Mapping) framework for interacting with the database.

MySQL: Relational database for storing product data.

Maven: Build tool for managing project dependencies and building the project.

SLF4J: Logging facade used for logging output.

