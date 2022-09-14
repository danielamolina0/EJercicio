package periodo2clase171;
import java.util.Scanner;
public class Periodo2Clase171 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int supar=0;
        int suimpar=0;
        System.out.println("Introduce numer");
        num = teclado.nextInt();
        for(int ind=1;ind<=num;ind++){
            if (ind%2==0){
                supar+=ind;
            }
            else{
                suimpar+=ind;
            }
        } 
        System.out.println("La suma de los pares es: "+supar);
        System.out.println("La suma de los impares es: "+suimpar);
    }
}
