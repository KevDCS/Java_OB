package com.example5;

import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Sessions789 {



    public static void main (String[] args) throws IOException {


        int opcion;

        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("Ejercicio 1");
        System.out.println("Ejercicio 2");
        System.out.println("Ejercicio 3");
        System.out.println("Ejercicio 4");
        System.out.println("Ejercicio 5");
        System.out.println("Ejercicio 6");
        System.out.println("Ejercicio 7");
        System.out.println("Ejercicio 8");

        opcion = sc.nextInt();

        do {

            switch (opcion) {
                case 1:

                    String str = "reconocer", nstr = "";
                    char ch;

                    System.out.println("-----Retornar un string al reves.-----");
                    System.out.println("Palabra original: ");
                    System.out.println("reconocer"); // Palabra de ejemplo

                    for (int i = 0; i < str.length(); i++) {
                        ch = str.charAt(i);
                        nstr = ch + nstr; // agrega cada caracter en frente de un string
                    }


                    System.out.println("Palabra al reves: ");
                    System.out.println(nstr);
                    System.out.println("-----------------------");
                    break;

                case 2:

                    String arrPalabras[] = {"Palabra", "Otra palabra", "235151", "Otra palabra de nuevo"};


                    System.out.println("-----Crear un array de strings e imprimir-----");
                    for (int i = 0; i < arrPalabras.length; i++) {
                        System.out.println(arrPalabras[i]);
                    }
                    System.out.println("-----------------------");
                    break;

                case 3:


                    int arrNumbers[] = {12, 35, 6423, 3634, 35, 142, 3497};
                    System.out.println("-----Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.-----");

                    for (int i = 0; i < arrNumbers.length; i++) {
                        System.out.println("Posicion: " + i + " valor: " + arrNumbers[i]);
                    }
                    System.out.println("-----------------------");
                    break;

                case 4:


                    Vector vector = new Vector(5);

                    vector.addElement("Hola");
                    vector.addElement(123);
                    vector.addElement("12345");
                    vector.addElement("Mundo");
                    vector.addElement(456);

                    System.out.println("-----Crea un \"Vector\" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.-----");

                    System.out.println(vector);

                    vector.remove(3);
                    vector.remove(2);

                    System.out.println(vector);
                    System.out.println("-----------------------");
                    break;

                // El problema de usar un vector con su valor por defecto, es que si el vector sobrepasa la capacidad inicial, o sea 10, este duplicara su capacidad, pasando a valer 20 en lugar de 10.

                case 5:


                    String arrString[] = {"A", "B", "C", "D"};

                    List<String> list = Arrays.asList(arrString);

                    System.out.println("-----Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.-----");

                    for (int i = 0; i < arrString.length; i++) {

                        System.out.println("Array: " + arrString[i]);
                        System.out.println("LinkedList: " + list.get(i));
                    }
                    System.out.println("-----------------------");
                    break;

                case 6:
                /* Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares.
                Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno. */


                    System.out.println("-----Array creado con 10 elementos.-----");


                    ArrayList<Integer> numberList = new ArrayList<Integer>(10);

                        for (int i = 1; i <= 10; i++){

                            numberList.add(i);

                        }

                        for (int j = 0; j < numberList.size(); j++) {

                            System.out.println(numberList.get(j) + "");

                        }

                        for (int i = 0; i < numberList.size(); i++) {

                            if (numberList.get(i) % 2 == 0){
                                numberList.remove(i);
                            }
                        }

                        System.out.println("-----Array sin numeros pares-----");

                        for (int j = 0; j <numberList.size(); j++) {

                            System.out.println(numberList.get(j) + "");
                        }

                    System.out.println("-----------------------");
                        break;

                case 7:
                /* Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
                Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".*/


                    int a, b;
                    double c;

                    Scanner cc = new Scanner(System.in);

                    System.out.println("Ingrese un valor para A: ");

                    a = cc.nextInt();

                    System.out.println("Ingrese un valor para B: ");

                    b = cc.nextInt();


                    try {
                        c = dividePorCero (a, b);
                    } catch (Exception ex) {
                        System.out.println("Esto no puede hacerse");
                    } finally {
                        System.out.println("Demo de codigo");
                    }

                    System.out.println("-----------------------");
                    break;

                case 8:
                /*Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
                La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".*/


                    String fileInput = ("/Users/kevo/Documents/FrontendDocs/textfile.rtf");
                    String fileOutput = ("/Users/kevo/Documents/FrontendDocs/filetext.rtf");
                    copiarArchivo(fileInput, fileOutput);


                    System.out.println("Archivo copiado en /Users/kevo/Documents/FrontendDocs/");

                    System.out.println("-----------------------");
                    break;

                default:
            }

            System.out.println("Menu");
            System.out.println("Ejercicio 1");
            System.out.println("Ejercicio 2");
            System.out.println("Ejercicio 3");
            System.out.println("Ejercicio 4");
            System.out.println("Ejercicio 5");
            System.out.println("Ejercicio 6");
            System.out.println("Ejercicio 7");
            System.out.println("Ejercicio 8");

            System.out.println("Presione 0 para salir");

            opcion = sc.nextInt();

        } while (opcion != 0);

    }

    public static void copiarArchivo(String fileInput, String fileOutput) throws IOException {

        InputStream fileIn = new FileInputStream(fileInput);
        BufferedInputStream bufferedFileIn = new BufferedInputStream(fileIn);


        try {
            byte[] datos = bufferedFileIn.readAllBytes();
            PrintStream fileOut = new PrintStream(fileOutput);

            fileOut.writeBytes(datos);
        } catch (IOException e) {
            System.out.println("Error de IO");
        }

    }

    public static double dividePorCero(int a, int b) throws ArithmeticException {
        try {
            return a / b;
        } catch (Exception ex) {
            throw new ArithmeticException();
        }
    }

    }
