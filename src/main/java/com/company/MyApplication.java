package com.company;
import Methods.Customer_Controller;
import Methods.product_controller;

import java.util.InputMismatchException;
import java.util.Scanner;
public class MyApplication {
private final Customer_Controller controller;
private final product_controller controllerr;
private final Scanner scanner;
public MyApplication(Customer_Controller controller,product_controller controllerr ){
this.controller=controller;
this.controllerr = controllerr;
scanner=new Scanner(System.in);
}
public void Start(){
while(true){
    System.out.println();
    System.out.println("Welcome to My Application");
    System.out.println("Select option:");
    System.out.println("1. Get all users");
    System.out.println("2. Get user by id");
    System.out.println("3. Add Money");
    System.out.println("4. Top 3 product");
    System.out.println("5. Analyze favourite product of customer");
    System.out.println("6. Get product by ID");
    System.out.println("7. Get all product");

    System.out.println("0. Exit");
    System.out.println();
    try{
    System.out.print("Enter option (1-6): ");
    int option = scanner.nextInt();
    if (option == 1) {
        getAllCustomersMenu();
    } else if (option == 2) {
        getCustomerByIdMenu();
    } else if (option == 3) {
        getAddMoney();
    }else if (option == 4) {
        getTop3productMenu();
    } else if (option == 5) {
        getAnylyzeFavouriteProduct();
    } else if (option == 6) {
        getOrder();
    }
    else if (option == 6) {
        getOrder();
    }else {
        break;
    }
} catch (InputMismatchException e) {
        System.out.println("Input must be integer");
        scanner.nextLine(); // to ignore incorrect input
    }
            catch (Exception e) {
        System.out.println(e.getMessage());
    }

    System.out.println("*************************");

}
}
    public void getAllCustomersMenu() {
        String response = controller.getAllCustomers();
        System.out.println(response);
    }

    public void getCustomerByIdMenu() {
        System.out.println("Please enter id");

        String id = scanner.next();
        String response = controller.getCustomer(id);
        System.out.println(response);
    }
    public void getAddMoney(){
        System.out.println("please enter id");
        String id = scanner.next();
        System.out.println("please enter money amount that will add");
        Double money=scanner.nextDouble();
        String response= controller.getAddMoney(money,id);
        System.out.println(response);
    }
    public void getTop3productMenu(){
    System.out.println("Top 3 interesting products");
    String response = controller.getInterestingproductanalyzer();
    System.out.println(response);
    }
    public void getAnylyzeFavouriteProduct(){
    System.out.println("please enter id: ");
    String id =scanner.next();
    String response=controllerr.getAnylyzeFavouriteProduct(id);
    System.out.println(response);
    }
    public void getOrder(){
        System.out.println("please enter id: ");
        String id =scanner.next();
        String response=controllerr.getOrder(id);
        System.out.println(response);
    }
    public void getAllProductsMenu() {
        String response = controllerr.getAllProduct();
        System.out.println(response);
    }
}
