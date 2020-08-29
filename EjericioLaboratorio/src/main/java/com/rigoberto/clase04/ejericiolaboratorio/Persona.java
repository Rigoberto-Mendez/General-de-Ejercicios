

package com.rigoberto.clase04.ejericiolaboratorio;

public class Persona {
// ATRIBUTOS CLASE PERSONA
    
    private String Nombre;
    private int Edad;
    private char Sexo;
    private double Peso;
    private double Altura;
    
// CONSTRUCTOR VACIO 
    public Persona() {
    }
//CONSTRUCTOR CON NOMBRE, EDAD Y SEXO
    public Persona(String Nombre, int Edad, char Sexo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
    }
//CONSTRUCTOR CON TODOS LOS ATRIBUTOS COMO PARAMETROS
    public Persona(String Nombre, int Edad, char Sexo, double Peso, double Altura) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Peso = Peso;
        this.Altura = Altura;
    }

 // LOS GET Y LOS SET 
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }
    
// METODO PARA DECIDIR SI ES MAYOR DE EDAD O MENOR DE EDAD
     public String esMayorDeEdad () {
    int edad;
    edad = this.Edad;
    if (Edad<18){
    return "Eres menor de edad ";
    }
    else {
    return "Eres mayor de edad";
    
    }
    
 
    }
    
// METODOS toSTRING
    @Override 
    public String toString () {
        return "Persona{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Sexo=" + Sexo + ", Peso=" + Peso + ", Altura=" + Altura + '}';
    }
    public String toString2() {
        return "Persona{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Sexo=" + Sexo + ", Peso=" + Peso + ", Altura=" + Altura + '}';
    }
       
}
