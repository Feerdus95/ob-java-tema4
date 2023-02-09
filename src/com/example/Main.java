package com.example;

public class Main {
    public static void main(String[] args) {
        //Se crean 2 objetos con parámetros
        SmartWatch smartWatch = new SmartWatch("OEM","ZL02S","DA14683",1.28,1,220,true);
        SmartPhone smartPhone = new SmartPhone("Samsung","S8","Qualcomm Snapdragon",6.0,8,3000,false);
        //Se imprimen ambos objetos con valores por defecto.
        System.out.println(smartWatch);
        System.out.println(smartPhone);
        //Se usa el método usarDispositivo en ambos.
        smartWatch.usarDispositivo(110.0);
        smartPhone.usarDispositivo(800.0);
        //Se vuelven a imprimir con los nuevos valores.
        System.out.println(smartWatch);
        System.out.println(smartPhone);
    }
}