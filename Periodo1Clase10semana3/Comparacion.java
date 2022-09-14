package comparacion;
import java.util.Scanner; //el programa usa la clase Scanner
public class Comparacion {
    public static void main(String[] args) {
        // TODO code application logic here
        // Crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);
        
        int numero1; // primer número a comparar
        int numero2; // segundo número a comparar
        
        System.out.print("Escriba el primer entero: "); //indicador
        numero1 = entrada.nextInt(); // lee el primer número del usuario
        
        System.out.print("Escriba el segundo entero: "); //indicador
        numero2 = entrada.nextInt(); // lee el segundo número del usuario
        
        if (numero1 == numero2)
        System.out.println("El número" + numero1 + " es igual a " + numero2);
        
        if (numero1 != numero2)
        System.out.println("El número " + numero1 + " es distinto a " + numero2);
        
        if (numero1 < numero2)
        System.out.println("El número " + numero1 + " es menor a " + numero2);
        
        if (numero1 > numero2)
        System.out.println("El número " + numero1 + " es mayor a " + numero2);
        
        if (numero1 <= numero2)
        System.out.println("El número " + numero1 + " es menor o igual a " + numero2);
        
        if (numero1 >= numero2)
        System.out.println("El numero es" + numero1 + " es mayor o igual a "+ numero2);
        
    }
    
}
