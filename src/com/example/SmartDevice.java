package com.example;

public class SmartDevice {
    String marca;
    String modelo;
    String procesador;
    double pantalla;
    int ram;
    double bateria;

    public double usarDispositivo(double cantidad){
        return bateria-=cantidad;
    }
}
