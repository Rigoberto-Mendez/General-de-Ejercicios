package com.rigoberto.clase04.ejericiciopolimorfismo;

// Hacemos herencia de la clase Vehiculo a la clase VehiculoDeportivo 
public class VehiculoDeportivo extends Vehiculo  {
// Atributos propios de la clase VehiculoDeportivo 
    private int Cilindraje;
    
   public VehiculoDeportivo(int Cilindraje, String Marca, String Matricula, String Color) {
        super(Marca, Matricula, Color);
        this.Cilindraje = Cilindraje;
    }

    @Override
    public String toString() {
        return "VehiculoDeportivo{" + "Cilindraje=" + Cilindraje + '}';
    }
    
}
