package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // el bono si el empleado tiene entre 2 a 5 años es del 20%, si es mayor sera 30%
        //Ahora bien, el bono por concepto de sueldo, si éste es menor a $1000,
        // se da 25% de éste, cuando éste es mayor a $1000, pero menor o igual a $3500,
        //  se otorga 15% de su sueldo, para más de $3500, un 10%.

        Scanner leer =new Scanner(System.in);
        System.out.println("hola! yo calculare tu bono");
        System.out.println("ingresa tu antiguedad");
        int antiguedad = leer.nextInt();
        System.out.println("Ingresa tu sueldo");
        double sueldo = leer.nextInt();

	Empleado empleado = new Empleado (antiguedad,sueldo);

        System.out.println("si tu antiguedad es: " +antiguedad+" y tu sueldo es: " +sueldo);
        System.out.println("Entonces tu bono es: "); empleado.informarBono();

        System.out.print("El proceso ha finalizado");
    }}


