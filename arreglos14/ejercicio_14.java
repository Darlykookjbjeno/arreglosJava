
package arreglos14;

import java.util.Scanner;


public class ejercicio_14 {
    
    public static void main(String[] args){
            Scanner Lector= new Scanner(System.in);
    
            boolean creciente=false,decreciente=false;
            
            int[] a=new int[10];
            int[] b=new int[10];
            int[] c=new int[20];
            
            do{
                System.out.println("escriba los numeros arreglo #1");
                for(int i=0;i<10;i++){
                    
                    a[i]=Lector.nextInt();
                }
                for(int i=0;i<9;i++){
                    if(a[i]<a[i+1]){
                        creciente=true;
                    }else{
                        creciente=false;
                    }
                }
                
                if(creciente==false){
                    System.out.println("No estan organizados creciente mente");
                }
   
            }while(creciente==false);
            
            
            
            do{
                System.out.println("escriba los numeros arreglo #2");
                for(int i=0;i<10;i++){
                    
                    b[i]=Lector.nextInt();
                }
                for(int i=0;i<9;i++){
                    if(b[i]<b[i+1]){
                        creciente=true;
                    }else{
                        creciente=false;
                    }
                }
                
                if(creciente==false){
                    System.out.println("No estan organizados creciente mente");
                }
   
            }while(creciente==false);
            
            System.out.println("Vector final");
            do{
            
            int j=0;
            
                for(int i=0;i<10;i++){

                    c[j]=a[i];
                    j++;

                    c[j]=b[i];
                    j++;
                }
                
                for(int i=0;i<c.length;i++){
                    System.out.println(c[i]);
                }
            
            
            }while(creciente == false); 
    
    }

}
