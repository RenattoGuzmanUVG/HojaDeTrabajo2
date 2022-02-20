/**
 * Lector
 */
import java.io.*;
import java.util.*;

public class Lector {

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