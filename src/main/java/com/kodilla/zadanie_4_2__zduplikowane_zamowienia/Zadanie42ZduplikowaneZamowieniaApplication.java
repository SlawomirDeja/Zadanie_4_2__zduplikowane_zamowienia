package com.kodilla.zadanie_4_2__zduplikowane_zamowienia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class Zadanie42ZduplikowaneZamowieniaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Zadanie42ZduplikowaneZamowieniaApplication.class, args);

        Set<Integer> orders = new HashSet<>();

        orders.add(2);
        orders.add(4);
        orders.add(4);
        orders.add(6);
        orders.add(8);
        orders.add(10);

        for (Integer order: orders) System.out.println(order);
    }

}
