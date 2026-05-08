package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Product product = new Product();
        product.input(sc);
        product.displayInfo();
    }
}
