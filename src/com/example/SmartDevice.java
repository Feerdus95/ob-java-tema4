package com.example;

public class SmartDevice {      //Clase SmartDevice, de la cual heredarán atributos
    String marca;               //las clases hijas SmartWatch y SmartPhone
    String modelo;
    String procesador;
    double pantalla;
    int ram;
    double bateria;

    public double usarDispositivo(double cantidad){     //Método a heredar
        return bateria-=cantidad;
    }
}
