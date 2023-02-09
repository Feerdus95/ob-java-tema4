package com.example;

public class Main {
    public static void main(String[] args) {
        //Se crean 2 objetos con parámetros
        SmartWatch smartWatch = new SmartWatch("OEM","ZL02S","DA14683",1.28,1,220,true);
        SmartPhone smartPhone = new SmartPhone("Samsung","S8","Qualcomm Snapdragon",6.0,4,3000,false);
        //Se imprimen ambos objetos con valores por defecto.
        System.out.println(smartWatch);
        System.out.println(smartPhone);
        //Se usa el método usarDispositivo en ambos.
        smartWatch.usarDispositivo(110.0);
        smartPhone.usarDispositivo(800.0);
        //Se imprimen 2 Strings estilizando la muestra de datos, con los nuevos valores.
        System.out.println("El SmartWatch es un: "+smartWatch.marca+" "+smartWatch.modelo+" con procesador "+smartWatch.procesador+", su pantalla es de "+smartWatch.pantalla+ " pulgadas, "+smartWatch.ram+"GB de RAM, batería de "+smartWatch.bateria+" mAh y su conectividad 4G es: "+smartWatch.is4g);
        System.out.println("El SmartPhone es un: "+smartPhone.marca+" "+smartPhone.modelo+" con procesador "+smartPhone.procesador+", su pantalla es de "+smartPhone.pantalla+ " pulgadas, "+smartPhone.ram+"GB de RAM, batería de "+smartPhone.bateria+" mAh y su conectividad 5G es: "+smartPhone.is5g);
    }
}