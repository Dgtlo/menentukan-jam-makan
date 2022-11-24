/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jammakan;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Jammakan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String tanya;
        Scanner scan = new Scanner (System.in);
        System.out.print ("Apakah saat ini pagi atau siang atau malam? : ");
        
        tanya = scan.next ();
        if ("pagi".equalsIgnoreCase(tanya))
        {
        System.out.println ("saatnya makan pagi");
        }
        else if ("siang".equalsIgnoreCase(tanya))
        {
        System.out.println ("saatnya makan siang");
        }
        else 
        {
        System.out.println ("saatnya makan malam");
        }
    }
    
}
