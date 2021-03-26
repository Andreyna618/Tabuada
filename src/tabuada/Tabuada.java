
package tabuada;

import java.util.Scanner;




public class Tabuada {

  
    
    public static void main(String[] args) {
    
        Scanner leia;
        leia = new Scanner (System.in);
       
   
     
        for (int i =0; i <11 ; i++) {
            
        
   System.out.print("Digite a tabuada:");
   int tabuada = leia.nextInt();

   
   
            System.out.println(tabuada + "x"+ i + "=" +(tabuada*i));
 
        }
        
   
     
        
        
        }
    
   }
