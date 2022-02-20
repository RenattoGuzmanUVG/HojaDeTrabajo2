import java.util.ArrayList;
import java.util.List;

/**
 * PosfixCalc
 * Esta clase prepara los atributos y métodos a usar en los cálculos
 * @author Renatto Guzmán
 */
public class PosfixCalc implements IPosfixCalc{

    Stack<Integer> Stack = new Stack<Integer>();
    boolean tieneNum;
    boolean tieneSimb;
    List<Character> numAceptables;
    List<Character> simbAceptables;
    int num1;
    int num2;
    int resultado;
    char caracterActual;


    public PosfixCalc() {
        tieneNum = false;
        tieneSimb = false;
        numAceptables = new ArrayList<>(List.of('1', '2', '3', '4', '5', '6', '7', '8', '9', '0'));
        simbAceptables = new ArrayList<>(List.of('+', '-', '*', '/'));
        num1 = 0;
        num2 = 0;
        resultado = 0;
        caracterActual = ' ';
    }

    /***
     * Realiza las operaciones de los problemas que se le presenten
     * @param expresion 
     * @return el resultado de el proceso
     * 
     ***/
    @Override
    public int Evaluate(String expresion) 
    {
        // TODO Auto-generated method stub
        
        for (int i = 0; i <= expresion.length() - 1; i++) 
        {

            resultado = 0;
            caracterActual = expresion.charAt(i);
            tieneNum = numAceptables.contains(caracterActual);
            tieneSimb = simbAceptables.contains(caracterActual);

            if (tieneNum || tieneSimb)
            {
                if (tieneNum) 
                {
                    Stack.push(Character.getNumericValue(caracterActual));
                }
                if (tieneSimb)
                {
                    num1 = 0;
                    num2 = 0;
                    try 
                    {
                        num2 = Stack.peek();
                        Stack.pull();
                        num1 = Stack.peek();
                        Stack.pull();
                    } 
                    catch (Exception e) 
                        {
                        while (!Stack.isEmpty()) {
                            Stack.pull();
                        }
                        return 1111; // Error: Expresion no valida
                    }

                    switch (caracterActual) {
                        case '+':
                            Stack.push(num1 + num2);
                            break;

                        case '-':
                            Stack.push(num1 - num2);
                            break;


                        case '/':
                            if (num2 == 0) 
                            {
                                while (!Stack.isEmpty()) 
                                {
                                    Stack.pull();
                                }
                                return 2222; // Error: División entre 0 

                            } 

                            else if (num2 > num1) 
                            {
                                while (!Stack.isEmpty()) 
                                {
                                    Stack.pull();
                                }
                                return 3333; // Error: da como resultado un numero de decimales

                            } 

                            else 
                            {
                                Stack.push(num1 / num2);
                            }

                            break;



                        case '*':
                            Stack.push(num1 * num2);
                            break;
                    }

                }

            }
            
            else if (caracterActual != ' ') 
            {
                return 1111; // Error: Expresion no valida
            }

        }
        
        
        resultado = Stack.peek();
        while (!Stack.isEmpty()) 
        {
            Stack.pull();
        }
        return resultado;

    }

    
}