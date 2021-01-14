package com.company;

public class Empleado {
    private final Bono bono;
    private Integer antiguedad;
    private double sueldo;

    public Empleado(int antiguedad, double sueldo) {
        this.antiguedad = antiguedad;
        this.sueldo = sueldo;
        this.bono = new Bono(antiguedad,sueldo);
    }

    public void informarBono() {System.out.println("el bono es: $"+bono.obtenervalor());}


}