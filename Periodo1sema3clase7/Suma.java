package suma;
import java.util.Scanner; //el programa usa la clase Scanner
/**
 *
 * @author danie
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);
        
        int numero1; //declaración de variable, primer numero a sumar
        int numero2; //declaración de variable, segundo numero a sumar
        int suma; // declaración de variable, suma de numero1 y numero2
        
        System.out.print("Escriba el primer entero: "); //indicador
        numero1 = entrada.nextInt(); //lee el primer numero del usuario
        
        System.out.print("Escriba el segundo entero: "); //indicador
        numero2 = entrada.nextInt(); // lee el segundo numero del usuario
        
        suma = numero1 + numero2; // suma de los numeros, después almacena el total en suma
        
        System.out.println("La suma es" + suma); // muestra la suma
    }
    
}
