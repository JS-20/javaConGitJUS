package com.company;

public class Bono {
    double valor;

    public Bono(int antiguedad, double sueldo) {
        double bonoAntiguedad= calcularBonoAntiguedad(antiguedad, sueldo);
        double bonoSueldo= calcularBonoSueldo(sueldo);
        this.valor = !(bonoAntiguedad <= bonoSueldo) ? bonoAntiguedad : bonoSueldo;

    }

    private double calcularBonoAntiguedad(int antiguedad, double sueldo) {
        double bonoAntiguedad;
        if (antiguedad > 2 && antiguedad < 5){
            bonoAntiguedad = sueldo * 0.2;
        } else if (antiguedad >= 5) {
            bonoAntiguedad = sueldo * 0.3;
        } else {
            bonoAntiguedad = 0.0;
        }

        return bonoAntiguedad;
    }


    private double calcularBonoSueldo(double sueldo) {
        double bonoSueldo;
        if (sueldo < 1000){
            bonoSueldo= sueldo * 0.25;
        }else if (sueldo > 1000 && sueldo <= 3500) {
            bonoSueldo = sueldo * 0.15;
        }else {
            bonoSueldo = sueldo * 0.10;
        }
        return bonoSueldo;
    }

    public double obtenervalor() {return this.valor;}
}
