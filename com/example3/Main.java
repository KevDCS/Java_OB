package com.example3;


import com.example3.smartPhone;
import com.example3.smartWatch;
import java.time.LocalTime;



public class Main {

    public static void main (String[] args) {

        // Se crea un objeto para Smartphone

        smartPhone onePlus8 = new smartPhone(
                "OnePlus",
                599,
                "OnePlus 8",
                "Blue",
                "Qualcomm 850",
                128,
                16,
                6,
                25642);


        System.out.println("Este es el teléfono One PLus 8");
        System.out.println("------------------------------");
        System.out.println(onePlus8.Brand);
        System.out.println(onePlus8.Price);
        System.out.println(onePlus8.Model);
        System.out.println(onePlus8.Color);
        System.out.println(onePlus8.Processor);
        System.out.println(onePlus8.Storage);
        System.out.println(onePlus8.Memory);
        System.out.println(onePlus8.Size);
        System.out.println(onePlus8.serialNumber);
        System.out.println(onePlus8.sendMessage("Tienes un correo de voz pendiente"));
        System.out.println(onePlus8.alert());

        // Se crea un objeto para Smartwatch

        smartWatch TicWatch = new smartWatch(
                "Mobvio",
                199,
                "Tic Watch GTX",
                "Red",
                "A6",
                512,
                512,
                3,
                89,
                58,
                LocalTime.now(),
                124523523);



        System.out.println("Este es el TicWatch GTX");
        System.out.println("-----------------------");
        System.out.println(TicWatch.Brand);
        System.out.println(TicWatch.Price);
        System.out.println(TicWatch.Model);
        System.out.println(TicWatch.Color);
        System.out.println(TicWatch.Processor);
        System.out.println(TicWatch.Storage);
        System.out.println(TicWatch.Memory);
        System.out.println(TicWatch.Size);
        System.out.println(TicWatch.mostrarPulsaciones());
        System.out.println(TicWatch.getClock());
    }
}
