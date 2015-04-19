package anatomia;
import java.util.*;
/**

*/
class Reloj{
public static void main(String[] args) {
Calendar ahora = Calendar.getInstance();
int hora = ahora.get(Calendar.HOUR_OF_DAY);
int minuto = ahora.get(Calendar.MINUTE);
int mes = ahora.get(Calendar.MONTH);
int day = ahora.get(Calendar.DAY_OF_MONTH);
int year = ahora.get(Calendar.YEAR);

if (hora<12) { System.out.println("Buenos Dias!");}
else if (hora <17) {System.out.println("Buenas Tardes!");}
    System.out.println("Buenas Noches!");
    
   System.out.println("Son las: " +hora +":" +minuto 
                        + " del " +day +"/"+mes +"/"+year);
}
}