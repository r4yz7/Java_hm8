package org.example;

public class Proector {
    String name;
    int year;
    double price;
    String firm;

    public Proector(String name, int year, double price, String firm) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.firm = firm;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nYear: " + year + "\nPrice: " + price + "\nFirm: " + firm + "\n";
    }
}
