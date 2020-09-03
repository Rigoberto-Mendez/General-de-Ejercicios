package com.rigoberto.clase04.ejericiciopolimorfismo;
// Hacemos herencia de la clase Vehiculo a la clase VehiculoTurismo 

public class VehiculoTurismo extends Vehiculo {
// Atributos propios de la clase VehiculoTurismo 

    private int NPuertas;

    public VehiculoTurismo(int NPuertas, String Marca, String Matricula, String Color) {
        super(Marca, Matricula, Color);
        this.NPuertas = NPuertas;
    }

}
