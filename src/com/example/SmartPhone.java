package com.example;

public class SmartPhone extends SmartDevice {

    boolean is5g;

    public SmartPhone() {}

    public SmartPhone(String marca, String modelo, String procesador, double pantalla, int ram, double bateria, boolean is5g){
            this.marca = marca;
            this.modelo = modelo;
            this.procesador = procesador;
            this.pantalla = pantalla;
            this.ram = ram;
            this.bateria = bateria;
        }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", procesador='" + procesador + '\'' +
                ", pantalla=" + pantalla +
                ", ram=" + ram +
                ", bateria=" + bateria +
                ", is5g=" + is5g +
                '}';
    }
}

