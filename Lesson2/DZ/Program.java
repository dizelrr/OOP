package ru.geekbrains.oop.lesson2.DZ2;


import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Cat[] catList = {
            new Cat("Barsik", 5),
            new Cat("Mursik", 10),
            new Cat("Vas'ka", 15),
            new Cat("Boris", 25),
            new Cat("Feliks"),
            new Cat()};
            Plate plate = new Plate(50);
            plate.info();
            for (Cat cat : catList) {
                // System.out.println(cat.toString());
                plate.setFood(cat.eat(plate.getFood()));
                if (cat.isSatiety()) {
                    System.out.println("Котик " + cat.getName() + " сыт");
                }
                else {
                    System.out.println("Котик " + cat.getName() + " голоден");
                }
                plate.info();

                
            }
                       
        }
    
               
    }
    

