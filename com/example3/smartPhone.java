package com.example3;

public class smartPhone extends smartDevice{

    // Atributos

    String message;
    String alert;


    // Constructores

    public smartPhone(){}


    public smartPhone(String brand, int price, String model, String color, String processor, int storage, int memory, int size, int serialNumber) {
        super(brand, price, model, color, processor, storage, memory, size, serialNumber);
    }



    // Metodos

    public String sendMessage(String message) {return message;} // Muestra un mensaje

    public String alert (){
        alert = "Tienes 10 actualizaciones pendientes";
        return alert;
    }
}
