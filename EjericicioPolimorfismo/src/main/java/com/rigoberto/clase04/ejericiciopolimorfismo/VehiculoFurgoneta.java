package com.rigoberto.clase04.ejericiciopolimorfismo;
// Hacemos herencia de la clase Vehiculo a la clase VehiculoFurgoneta
public class VehiculoFurgoneta extends Vehiculo{
// Atributos propios de la clase VehiculoFurgoneta
    private int Carga;
   
    public VehiculoFurgoneta(int Carga, String Marca, String Matricula, String Color) {
        super(Marca, Matricula, Color);
        this.Carga = Carga;
    }
    
}
