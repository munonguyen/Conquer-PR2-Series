package ex2;

import ex1.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Product product1 = new Product();
        product1.input(sc);
        product1.displayInfo();
        String line = sc.nextLine();
        Product product2 = new Product();
        product2.input(sc);
        product2.displayInfo();

    }
}
