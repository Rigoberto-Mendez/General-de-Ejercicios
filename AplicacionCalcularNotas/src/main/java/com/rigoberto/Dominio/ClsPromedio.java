package com.rigoberto.Dominio;

public class ClsPromedio {
    
// ATRIBUTOS DE LA CLASE.
    private String Laboratorio1;
    private String Parcial1;
    private String Laboratorio2;
    private String Parcial2;
    private String Laboratorio3;
    private String Parcial3;
 
// AHORA CREAMOS UN CONTRUCTOR VACIO.
    public ClsPromedio() {
    }

    // AHORA CREAMOS UN SEGUNDO CONSTRUCTOR CON LOS PARAMETROS.
    public ClsPromedio(String Laboratorio1, String Parcial1, String Laboratorio2, String Parcial2, String Laboratorio3, String Parcial3) {

        this.Laboratorio1 = Laboratorio1;
        this.Laboratorio2 = Laboratorio2;
        this.Laboratorio3 = Laboratorio3;
        this.Parcial1 = Parcial1;
        this.Parcial2 = Parcial2;
        this.Parcial3 = Parcial3;
        
    }

    // AHORA CREAMOS LOS GET Y LOS SET.
    public String getLaboratorio1() {
        return Laboratorio1;
    }

    public void setLaboratorio1(String Laboratorio1) {
        this.Laboratorio1 = Laboratorio1;
    }

    public String getParcial1() {
        return Parcial1;
    }

    public void setParcial1(String Parcial1) {
        this.Parcial1 = Parcial1;
    }

    public String getLaboratorio2() {
        return Laboratorio2;
    }

    public void setLaboratorio2(String Laboratorio2) {
        this.Laboratorio2 = Laboratorio2;
    }

    public String getParcial2() {
        return Parcial2;
    }

    public void setParcial2(String Parcial2) {
        this.Parcial2 = Parcial2;
    }

    public String getLaboratorio3() {
        return Laboratorio3;
    }

    public void setLaboratorio3(String Laboratorio3) {
        this.Laboratorio3 = Laboratorio3;
    }

    public String getParcial3() {
        return Parcial3;
    }

    public void setParcial3(String Parcial3) {
        this.Parcial3 = Parcial3;
    }

}
