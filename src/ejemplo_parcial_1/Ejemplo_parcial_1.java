
package ejemplo_parcial_1;
import Clases.producto_clase;
import Clases.produ_proceso;
import java.io.IOException;

public class Ejemplo_parcial_1 {
    // new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    public static producto_clase produ_ingresa = new producto_clase ();
    public static produ_proceso proceso = new produ_proceso();
   
    public static void main(String[] args) throws IOException, InterruptedException{
       produ_ingresa.llenar_informacion1();
       produ_ingresa.llenar_informacion2();
       produ_ingresa.llenar_informacion3();
       produ_ingresa.llenar_informacion4();
       produ_ingresa.llenar_informacion_gastos();
        System.out.println("\n");
       proceso.primer_paso();
        System.out.println("------------------------------------------\n");
       proceso.segundo_paso();
       System.out.println("------------------------------------------\n");
       proceso.tercer_paso();
       System.out.println("------------------------------------------\n");
       proceso.cuarto_paso();
       System.out.println("------------------------------------------\n");
       proceso.quinto_paso();
       System.out.println("------------------------------------------\n");
       proceso.sexto_paso();
       System.out.println("------------------------------------------\n");
       proceso.septimo_paso();
       System.out.println("------------------------------------------\n");
       proceso.octavo_paso();
       System.out.println("------------------------------------------\n");
       proceso.noveno_paso();
       System.out.println("------------------------------------------\n");
       proceso.decimo_paso();
    }
    
}
