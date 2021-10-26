package com.example3;

import java.time.LocalTime;
import java.util.concurrent.ThreadLocalRandom;

public class smartWatch extends smartDevice {

    // Atributos

    protected int sensorFrequency;
    protected int sensorMovement;
    protected LocalTime Clock;
    protected int Size;


    // Constructores

    public smartWatch(String brand, int price, String model, String color, String processor, int storage, int memory, int size, int sensorFrequency, int sensorMovement, LocalTime clock, int serialNumber) {
        super(brand,
                price,
                model,
                color,
                processor,
                storage,
                memory,
                size,
                serialNumber);
        this.sensorFrequency = sensorFrequency;
        this.sensorMovement = sensorMovement;
        Clock = clock;
    }


    // Metodos

    public String mostrarPulsaciones() {

        int int_random = ThreadLocalRandom.current().nextInt();
        return "Las pulsaciones por segundo son " + int_random;
    }

    public String getClock() {
        LocalTime time = LocalTime.now();
        return "La hora es " + time;
    }

    @Override
    public String toString() {
        return "smartWatch{" +
                "sensorFrequency=" + sensorFrequency +
                ", sensorMovement=" + sensorMovement +
                ", Clock=" + Clock +
                '}';
    }
}

