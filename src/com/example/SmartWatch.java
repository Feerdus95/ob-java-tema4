package com.example;

public class SmartWatch extends SmartDevice{

    boolean is4g;

    public SmartWatch() {}

    public SmartWatch(String marca, String modelo, String procesador, double pantalla, int ram, double bateria, boolean is4g){
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.pantalla = pantalla;
        this.ram = ram;
        this.bateria = bateria;
        this.is4g = is4g;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", procesador='" + procesador + '\'' +
                ", pantalla=" + pantalla +
                ", ram=" + ram +
                ", bateria=" + bateria +
                ", is4g=" + is4g +
                '}';
    }
}
