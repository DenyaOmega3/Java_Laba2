package com.modern_java;

import entities.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<Car>();
        carList.add(new Car("Mitsubishi", "Outlander",2004,"white",2700,"AA2455EE"));
        carList.add(new Car("Audi", "A7", 2010, "dark gray", 4900, "JAC184"));
        carList.add(new Car("Kia", "Stinger", 2017, "red", 3400, "AA1123AE"));
        carList.add(new Car("Infiniti", "FX", 2008, "white", 2340, "KA2SL"));
        carList.add(new Car("Mazda", "CX-5", 2013, "red", 4200, "WE5669"));
        carList.add(new Car("Kia", "Sportage", 2021, "green", 4350, "WE5662"));
        carList.add(new Car("Mitsubishi", "Outlander", 2006, "black", 2900, "WE5262"));

        List<Car> taskA = carList.stream()
                .filter(w -> w.getBrand().equals("Kia"))
                .toList();
        /*
        TODO:
            a) list of cars of given brand [✓]
            b) list of cars of given model, which is operated over n years [ ]
            c) list of cars of given release year, price of which is greater than given one from input [ ]
         */
    }
}
