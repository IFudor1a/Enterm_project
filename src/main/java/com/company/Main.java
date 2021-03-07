package com.company;
import Methods.Customer_Controller;
import Methods.Customer_functions;
import Methods.product_controller;
import PostgresDB.IDB;
import PostgresDB.PostgresDB;
import Methods.product_functions;
import Entities.*;
public class Main {
    public static void main(String[] args) {
        IDB db = new PostgresDB();
        Customers repo = new Customer_functions(db);
        Products repos = new product_functions(db);
        Customer_Controller controller = new Customer_Controller(repo);
        product_controller controllerr = new product_controller(repos);
        MyApplication app = new MyApplication(controller,controllerr);
        app.Start();
    }

}
