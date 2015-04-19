
package anatomia;

/**
Operador Ternario ()?
*/
class Ternario{
public static void main(String[] args) {
    int puntuacion =3;
    /* Primera condicion por verdadero
        Despues del ; va por el falso
    */
 String mensaje = (puntuacion>5)? "has aprobado": "No has aprobado";
 System.out.println(mensaje);
}}