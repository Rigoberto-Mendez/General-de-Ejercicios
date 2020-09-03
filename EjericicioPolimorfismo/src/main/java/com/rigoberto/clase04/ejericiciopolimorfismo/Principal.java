package com.rigoberto.clase04.ejericiciopolimorfismo;

public class Principal {

    public static void main(String[] args) {
        Vehiculo vh = new VehiculoDeportivo(0, "", "", "");
        Vehiculo vh1 = new VehiculoFurgoneta(0, "", "", "");
        Vehiculo vh2 = new VehiculoTurismo(0, "", "", "");

        System.out.println(vh.toString());
    }

}


