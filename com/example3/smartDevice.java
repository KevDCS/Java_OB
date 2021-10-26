package com.example3;



public class smartDevice {

    // Atributos

    protected String Brand;
    protected int Price;
    protected String Model;
    protected String Color;
    protected String Processor;
    protected int Storage;
    protected int Memory;
    protected int Size;
    protected int serialNumber;


    // Constructores

    public smartDevice(){}

    public smartDevice(String brand, int price, String model, String color, String processor, int storage, int memory, int size, int serialNumber) {
        Brand = brand;
        Price = price;
        Model = model;
        Color = color;
        Processor = processor;
        Storage = storage;
        Memory = memory;
        Size = size;
        this.serialNumber = serialNumber;
    }


    @Override
    public String toString() {
        return "smartDevice{" +
                "Brand='" + Brand + '\'' +
                ", Price=" + Price +
                ", Model='" + Model + '\'' +
                ", Color='" + Color + '\'' +
                ", Processor='" + Processor + '\'' +
                ", Storage=" + Storage +
                ", Memory=" + Memory +
                ", Size=" + Size +
                '}';
    }
}









/*
Ejercicio Sesión 4

Ejercicio 1

En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.

Agregaréis atributos tal cual tendrían esos objetos en la realidad.

Crear constructor vacío y con todos los parámetros para cada clase.

Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
*/