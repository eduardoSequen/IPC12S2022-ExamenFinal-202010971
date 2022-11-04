
package examenfinal;

import java.util.Scanner;


public class ExamenFinal {

   
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int option = 0;
        
        do{
            System.out.println("MENÚ");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            option = in.nextInt();
            
            if (option >= 1 && option <=4) {
            options(option);
        }   else {
            
            }
            
        } while(option != 4);
        
        
    }
    
    public static void options(int option){
    
        switch (option) {
            case 1:
                numMayor();
                break;
            case 2:
                piramide();
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                throw new AssertionError();
        }
    }
    
    
    public static void numMayor(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("EJERCICIO 1");
        System.out.println("");
        
        System.out.print("Ingrese el primer número: ");
        int a = in.nextInt();
        System.out.print("ingrese el segundo número: ");
        int b = in.nextInt();
        
        if (a > b) {
            System.out.println("El número mayor es: " + a);
            System.out.println("");
        } else {
            System.out.println("El número mayor es: " + b);
            System.out.println("");
        }
    }
    
    
    public static void piramide(){
        Scanner in = new Scanner(System.in);
        int n , filaA = 0, espacio, asterisco;
        System.out.print("Ingrese el tamaño de la pirámide: ");
        n = in.nextInt();
        
        for(filaA = 1; filaA <= (n-2); filaA++){
            for(espacio = 0; espacio <= n-filaA; espacio++){
                System.out.print(" ");
            }
            for(asterisco = 0; asterisco < (filaA*2)-3; asterisco++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    
}
