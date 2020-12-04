/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_uf4;

/**
 *
 * @author GeriQuinzel
 */
public class proves {
    
    public static void main (String[] args){
        
        long start, end;
        System.out.println("Timing a for loop from 0 to 1000");
        // time a for loop from o to 1000
        start = System.currentTimeMillis(); // get time
        System.out.println("Starting time in milliseconds : " + start);
        
        for (int i = 0; i < 1000; i++)  // LINE A
        {
            
            for(int j =0; j < 2000; j++)
            {
                for( int k =0; k < 3000; k++)
                {
                    
                }
            }
        }
        end = System.currentTimeMillis(); // get ending time
        System.out.println("Ending time in milliseconds : " + end);
        System.out.println("Elapsed time: " + (end - start)+ " ms"); // LINE B   
        
    }
    
}
