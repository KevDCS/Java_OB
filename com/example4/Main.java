package com.example4;

import java.util.List;

public class Main {


    public static void main (String [] args){

        cocheCRUD coche = (cocheCRUD) new Cocheimple();
            coche.save();
            coche.findAll();
            coche.delete();
    }

}
