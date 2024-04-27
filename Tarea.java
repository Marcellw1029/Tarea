//Marcell Esau Delgado Fajardo - Grupo 1M1-S
// CARNET = 2024-1358U
import java.util.Scanner;

public class Tarea {
    public static int SUMAPEQUES (int num1, int num2, int num3 ) { //usamos un método para realizar la suma de los numeros mas pequeños
        int peque1 = Math.min(num1, num2); //con math, verificamos que entre el num1 y el num2 se escoga el valor mas pequeño
        int peque2 = Math.min(num3,Math.max(num1, num2)); //usamos math nuevamente para elegir los valores minimos
        return peque1 + peque2; //realizamos la suma de los valores mas pequeños
    }
        public static int RESTAPEQUES(int num1, int num2, int num3) {
            int grande1 = Math.max(num1, num2); //elegimos el numero mas grande 
            int grande2 = Math.max (num3, Math.min(num1, num2)); //elegimos el numero mas grande y hacemos que en num1 y num2, escoga el numero mas pequeño, por lo tanto no se mostrara como el mayor 
            return grande1 - grande2;
            
        }
            public static int NUMEROMAYOR(int num1, int num2, int num3) {
                int MAYOR = Math.max( num3,Math.max(num1, num2)); //elegimos el numero mas grande
                return MAYOR;
                
            }

    static int num1, num2, num3; //definimos el tipo de dato 
    
    

    public static void main(String[] args) throws Exception {
        Scanner cs = new Scanner(System.in);

        System.out.println("\"Hola, Profesor Larios\"");
        do {
            try {
                System.out.println("inserte 3 numeros enteros que no sean iguales");
                num1 = cs.nextInt(); //insertamos el primer numero
                num2 = cs.nextInt(); //insertamos el segundo numero
                num3 = cs.nextInt(); //insertamos el tercer numero 
            

                
                
            } catch (Exception e) {
                System.out.println(e); //imprimimos la excepcion
                cs.nextLine(); //limpiar el buffer
            }
            
        } while (num1==num2 || num1==num3 | num2==num3); //usamos el while para que los numeros no sean iguales, si son iguales, el programa se inicia de nuevo
         System.out.println("\"esta es la suma de los numeros mas pequeños: \"" +SUMAPEQUES(num1, num2, num3));
         System.out.println("esta es la resta de los números mayores: "+RESTAPEQUES(num1, num2, num3));
         System.out.println("este es el numero mayor entre todos los numeros: "+NUMEROMAYOR(num1, num2, num3));
           cs.close(); //cerramos el Scanner

        

    }
}
