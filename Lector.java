/**
 * Lector
 * @author Renatto Guzmán
 */
import java.io.*;
import java.util.*;

public class Lector {

    /**
     * Lee el documento de texto con los problemas a resolver
     * @param archivo
     * @return texto, arraylist con todas las entradas de problemas a resolver
     */
    public ArrayList<String> elLector(String archivo) {

        String linea;
        ArrayList<String> texto = new ArrayList<String>();
        try(BufferedReader br = new BufferedReader(new FileReader(archivo))) 
        {
            
            while ((linea = br.readLine()) != null) {
            texto.add(linea);
            }
        }
        catch (IOException e) {
            System.out.println("No existe un documento llamado datos.txt, por favor crear uno.");
            e.printStackTrace();
        }
    return texto;
    }    
    
}