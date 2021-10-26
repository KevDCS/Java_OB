package com.example1;

import java.util.*;

    // Ejercicio imprimir un precio que incluya el IVA

public class Project1 {

    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {

        int Imp = 15;
        int precio;
        int total;

        System.out.println("Indique precio: ");
        precio = console.nextInt();
        total = Imp + precio;


        System.out.println("El precio con IVA incluido es: " + total);

    }
}
