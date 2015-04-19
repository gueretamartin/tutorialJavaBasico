
package anatomia;

/**
Algunos metodos para manejo de String
*/
class Strings{
public static void main(String[] args) {
  /* Comparar dos String*/
    String respuesta1="hola";
    String respuesta2="hola1";
    boolean resultado=respuesta1.equals(respuesta2);
    if (resultado){
    System.out.println("Son iguales");
}
    else {System.out.println("Son distintos");
}
    
/* Buscar una cadena en un texto */
    String text="Hola que tal como andas";
    String pal ="equ";
    int rta=text.indexOf(pal);
    if (rta!=-1){System.out.println("Se encuentra en el texto");}
    else { System.out.println("No se encuentra en el texto"); }
    
;
/* Ver tamañano de un String */
   
String cadena= "hola";
int tam = cadena.length();
System.out.println("El tamaño es: " + tam);
}}