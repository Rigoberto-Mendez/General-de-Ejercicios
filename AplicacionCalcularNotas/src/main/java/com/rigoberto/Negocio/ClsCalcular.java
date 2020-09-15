package com.rigoberto.Negocio;

public class ClsCalcular {
    
// PRIMERO DEFINIMOS UNA VARIABLE DE TIPO DOUBLE GLOBAL QUE SERA UTILIZADA PARA ALMACENAR LOS RESULTADOS DE LOS TRES PERIODOS.
    public double result;
    
// CREAMOS UN METODO PARA EL PRIMER PERIODO.
    public void PirmerPeriodo(Double Laboratorio1, Double Parcial1) {
        
// AHORA CALCULAMOS EL PORCENTAJE Y LOS SUMAMOS Y SE ALMACENA EN LA VARIABLE RESULT.
 result = (Laboratorio1 * 0.40)  + (Parcial1 * 0.60);
    }
    
// CREAMOS UN METODO PARA EL SEGUNDO PERIODO.
    public void SegundoPeriodo(Double Laboratorio2, Double Parcial2){
        
  // AHORA CALCULAMOS EL PORCENTAJE Y LOS SUMAMOS Y SE ALMACENA EN LA VARIABLE RESULT.   
 result = (Laboratorio2 * 0.40) + (Parcial2 * 0.60);
    }

    // CREAMOS UN METODO PARA EL TERCER PERIODO.
    public void TercerPeriodo(Double Laboratorio3, Double Parcial3){
        
  // AHORA CALCULAMOS EL PORCENTAJE Y LOS SUMAMOS Y SE ALMACENA EN LA VARIABLE RESULT.    
 result = (Laboratorio3 * 0.40) + (Parcial3 * 0.60);
    }
    
// CREAMOS UNA VARIABLE PARA ALMACENAR EL PROMEDIO GENERAL.
    public Double Promedio;
    
// AHORA CREAMOS UN METODO PARA EL PROMEDIO GENERAL.
    public void PromedioGeneral (Double Resultado1, Double Resultado2, Double Resultado3){

// PRIMERO REALIZAMOS LA SUMA DE LOS DE LOS TRES RESULTADOS 
       result = Resultado1 + Resultado2 + Resultado3;
       
// AHORA DIVIDIMOS ESE RESULTADO POR 3.
    Promedio = result / 3;
    }

// AHORA CREAMOS UN METODO PARA LOS CONDICIONALES.
    public String AprobadoOReprobado() {

// AHORA CREAMOS UN CONDICIONAL IF EL CUAL NOS MOSTRARA REPROBADO.
        if (Promedio >= 0 && Promedio < 6) {
            return "REPROBADO";

// AHORA UN ELSE EL CUAL NOS MOSTRARA LO CONTRARIO QUE POR LOGICA SERIA APROBADO.
        } else {

            return "APROBADO";

        }

    }

}
