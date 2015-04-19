package anatomia;
import java.awt.*;

/* Un applet es un componente de una aplicación que se ejecuta en el contexto de otro programa, 
por ejemplo en un navegador web. El applet debe ejecutarse en un contenedor,    
que le proporciona un programa anfitrión, mediante un plugin,1 o en aplicaciones como 
teléfonos móviles que soportan el modelo de programación por "applets".

A diferencia de un programa, un applet no puede ejecutarse de manera independiente,
ofrece información gráfica y a veces interactúa con el usuario, típicamente carece de sesión
y tiene privilegios de seguridad restringidos.*/

public class Apllet extends javax.swing. JApplet {
    int numero;
    
    public void init() {
        numero=317;
    } 
     
    public void paint(Graphics screen){
        Graphics2D screen2D = (Graphics2D) screen;
        screen2D. drawString("La raiz cuadrada de"+
                numero + 
                "es" +
                Math.sqrt(numero), 5,50);   
    
    
    
    }
}