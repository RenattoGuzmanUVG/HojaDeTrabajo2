import java.util.*;

/**
 * Main
 * @author Renatto Guzmán
 */

public class Main {

    /**
     * Clase Main que realiza todas las acciones del programa
     * @param args
     */
    public static void main(String[] args) {

        PosfixCalc myPosfixCalc = new PosfixCalc();
        Lector unLector = new Lector();
        ArrayList<String> texto;
        int i;
        int resultado;

        texto = unLector.elLector("datos.txt");

        System.out.println("¡BIENVENIDO A LA CALCULADORA PARA EL FORMATIO POSTFIX! \n\n (Para utilizar la calculadora modifique un archivo de texto datos.txt en esta carpeta)\n\n");;
    
        System.out.println("Los resultados de sus problemas se muestran a continuación: \n\n");
        
        i = 0;
        for (String linea : texto) 
        {
            resultado = myPosfixCalc.Evaluate(linea);
            
            if (resultado == 1111) 
            {
                System.out.println("Resolución Linea # " + (i + 1) + ": Expresión inválida ERROR | " + linea + " |\n");
            } 

            else if (resultado == 2222) 
            {
                System.out.println("Resolución Linea # " + (i + 1) +": Expresión inválida ERROR división entre cero (" + linea + ")\n");
            } 
            
            else if (resultado == 3333) 
            {
                System.out.println("Resolución Linea # " + (i + 1) + ":  Expresión inválida ERROR división con decimales (" + linea + ")\n");
            } 
            else 
            {
                System.out.println("Resolución Linea # " + (i + 1) + ":  ("  + linea + ") = "
                        + resultado + "\n");
            }
            i++;
        }
    
    }
}
