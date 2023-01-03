
package arreglos13;

import java.util.Scanner;

/**
 *
 * @author HOMEPC
 */
public class ejercicio_13 {
    public static void main(String[] args){
            Scanner Lector= new Scanner(System.in);
            
            int contadorpares=0,contaontdorinpares=0;
            int[] numeros=new int[10];
            
            for(int i=0;i<numeros.length;i++){
                System.out.println("Escriba el valor #"+(i+1));
                numeros[i]=Lector.nextInt();
                
                if(numeros[i]%2 == 0){
                        contadorpares++;
                       //System.out.println(numeros[i]);
                    }else{
                        contaontdorinpares++;
                }
                
            }
        
            int[] pares= new int[contadorpares];
            int[] inpares= new int[contaontdorinpares];
            
            contadorpares=0;
            contaontdorinpares=0;
            
            for(int i=0;i<10;i++){
                if(numeros[i]%2 == 0){
                    
                    pares[contadorpares]=numeros[i];
                    contadorpares++;
                    
                }else{
                    inpares[contaontdorinpares]=numeros[i];
                    contaontdorinpares++;
                }
            }
            
            System.out.println("Pares");
            for(int i=0;i<pares.length;i++){
                System.out.println(pares[i]);
            }
            
            System.out.println("inpares");
            for(int i=0;i<inpares.length;i++){
                System.out.println(inpares[i]);
            }
            
            
    }
}
