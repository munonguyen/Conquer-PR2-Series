package Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        UpdateProduct product1 = new UpdateProduct();
        product1.input(sc);
        product1.displayInfo();
        String line  = sc.nextLine();
        UpdateProduct product2 = new UpdateProduct();
        product2.input(sc);
        product2.displayInfo();
    }
}
