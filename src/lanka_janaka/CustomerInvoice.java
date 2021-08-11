/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanka_janaka;
import java.util.Scanner;
/**
 *
 * @author Jeyaprabakar
 */
public class CustomerInvoice {
    
                void cusinvoice(){

                Scanner sc= new Scanner(System.in); 
                
                 
                System.out.println("Enter Date: ");  
                String date= sc.next(); 
                
                System.out.println("Enter name: ");  
                String name= sc.next();              
                
                System.out.println("Enter Contact No: ");  
                String contact= sc.next();  
                
                System.out.println("Enter Replaced Part: ");   
                String part= sc.next();  
              
                System.out.println("Enter Amount: ");   
                String amount= sc.next();  
                
                System.out.println("\t\t\t\t****************************");
                System.out.println("\t\t\t\t***********INVOICE**********");
                System.out.println("\t\t\t\t********JANAKA LANKA********");
                System.out.println("\t\t\t\t****************************");
                System.out.println("\t\t\t\t  Date         : "+date);  
                System.out.println("\t\t\t\t  Name         : "+name);  
                System.out.println("\t\t\t\t  Contact No   : "+contact);  
                System.out.println("\t\t\t\t  Replaced Part: "+part);  
                System.out.println("\t\t\t\t  Amount       : "+amount);  
                System.out.println("\t\t\t\t*****************************");
                System.out.println("");
                
               
                 
}                  

}