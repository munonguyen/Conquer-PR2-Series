package Ex3;

import java.util.Scanner;

public class UpdateProduct {
    private String name;
    private double price;
    private double discout;


    public UpdateProduct(){}

    public UpdateProduct(String name, double price, double discout) {
        this.name = name;
        this.price = price;
        this.discout =discout;
    }
    public UpdateProduct(String name, double price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getDiscout(){
        return discout;
    }
    public void setDiscount(double discout){
        this.discout = discout;
    }
    private double getImportTax(){
        return price * 0.1;
    }
    public void displayInfo(){
        System.out.println("Name Product: "+ this.name);
        System.out.println("Price Product:" + this.price);
        System.out.println("Discount Product:" + this.discout);
        System.out.println("Tax Product:" + this.getImportTax());
    }
    public void input(Scanner sc){
        this.name = sc.nextLine();
        this.price = sc.nextDouble();
        this.discout = sc.nextDouble();
    }

}
