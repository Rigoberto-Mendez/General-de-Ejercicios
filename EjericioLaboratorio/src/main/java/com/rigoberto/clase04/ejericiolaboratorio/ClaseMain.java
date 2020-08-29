package com.rigoberto.clase04.ejericiolaboratorio;

import java.util.Scanner;

public class ClaseMain {

    public static void main(String[] args) {

//     INTRODUCCION DE DATOS POR TECLADO 
        Scanner sc = new Scanner(System.in);
        System.out.println("ESCRIBE TU NOMBRE");
        String Nombre = sc.nextLine();
        System.out.println("ESCRIBE TU EDAD");
        int  Edad = sc.nextInt();
        System.out.println("ESCRIBE TU SEXO");
        char Sexo = sc.next().charAt(0);
        System.out.println("ESCRIBE TU PESO ");
        double Peso = sc.nextDouble();
        System.out.println("ESCRIBE TU ESTATURA");
        double Altura = sc.nextDouble();
        
// CREAMOS OBJETOS CON CADA CONSTRUCTOR  E INSERTAMOS LOS DATOS QUE NO ESTEN COMPLETOS MEDIANTE EL SET

// CREAMOS EL PRIMER OBJETO CON TODAS LAS VARIABLES PEDIDAS POR TECLADO 
        Persona person1 = new Persona (Nombre, Edad, Sexo, Peso, Altura);
     
        System.out.println(person1.toString() );
        System.out.println(person1.esMayorDeEdad() );
        
// CREAMOS EL SEGUNDO OBJETO CON LAS VARIABLES NOMBRE, EDAD, SEXO Y LOS PASAMOS DIRECTAMENTE AL CONSTRUCTOR UTILIZANDO EL GET
        Persona person2 = new Persona (person1.getNombre(), person1.getEdad(), person1.getSexo() );
   
        System.out.println(person2.toString2());
        System.out.println(person2.esMayorDeEdad() );
        
// CREAMOS EL TERCER OBJETO DEFECTO Y UTILIZAMOS LOS METODOS SET  
        Persona person3 = new Persona ();
      
        person3.setNombre(Nombre);
        person3.setEdad(Edad);
        person3.setSexo(Sexo);
        person3.setPeso(Peso);
        person3.setAltura(Altura);
       
        System.out.println(person3.toString());
        System.out.println(person3.esMayorDeEdad() );     
    }
   
    
}
