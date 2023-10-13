package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.StreamSupport;

import static java.lang.Math.random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Random random = new Random();
//        List<Integer> numbers = new ArrayList<>();
//        for (int i=0; i<10;i++){
//            numbers.add(random.nextInt(20));
//        }
//        long countPositive = numbers.stream().filter(s->s>0).count();
//        long countNegative = numbers.stream().filter(s->s<0).count();
//        long countDouble = numbers.stream().filter(s->s>=10 && s<100).count();
//        System.out.println("Positive: " + countDouble);
//        System.out.println("Negative: " + countNegative);
//        System.out.println("Count double digit: " + countDouble);

        //2
//        List<String>products = new ArrayList<>();
//        products.add("Apple");
//        products.add("Apple");
//        products.add("Banana");
//        products.add("Orange");
//        products.add("Pineapple");
//        products.add("Mellon");
//        products.stream().forEach(s->System.out.println(s));
//
//        System.out.println(2);
//        products.stream().filter(s->s.length()<=5).forEach(s->System.out.println(s));
//        System.out.println(3);
//        long countProd = products.stream().filter(s->s.equals("Apple")).count();
//        System.out.println("Count: " + countProd);
//        System.out.println(4);
//        products.stream().filter(s->s.startsWith("a".toUpperCase())).forEach(s->System.out.println(s));

        //4

        List<Proector> proectors = new ArrayList<>();
        proectors.add(new Proector("qwerty",2023,6000,"HP"));
        proectors.add(new Proector("asdfg",2016,9000,"HP"));
        proectors.add(new Proector("zxcvb",2018,1000,"LENOVO"));
        proectors.add(new Proector("qazwsx",2017,8000,"Apple"));
        proectors.stream().forEach(s->System.out.println(s));
        System.out.println(2);
        proectors.stream().filter(s->s.firm.equals("HP")).forEach(s->System.out.println(s));
        System.out.println(3);
        proectors.stream().filter(s->s.year == LocalDate.now().getYear()).forEach(s->System.out.println(s));
        System.out.println(4);
        proectors.stream().filter(s->s.price>7000).forEach(s->System.out.println(s));
        System.out.println(5);
        proectors.stream().sorted((s1,s2)->Double.compare(s1.price,s2.price)).forEach(s->System.out.println(s));
        System.out.println(6);
        proectors.stream().sorted((s1,s2)->Double.compare(s2.price,s1.price)).forEach(s->System.out.println(s));
        System.out.println(7);
        proectors.stream().sorted((s1,s2)->Integer.compare(s1.year,s2.year)).forEach(s->System.out.println(s));
        System.out.println(8);
        proectors.stream().sorted((s1,s2)->Integer.compare(s2.year,s1.year)).forEach(s->System.out.println(s));



    }
}