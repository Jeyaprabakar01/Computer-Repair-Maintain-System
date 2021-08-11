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
public class MainMenu {
    
    
        public static void main(String[] args){
            
            while(true){
                System.out.println("\t\t\t\t\t\t\t\t*********************************");
                System.out.println("\t\t\t\t\t\t\t\tLANKA JANAKA COMPUTER REPAIR SHOP");
                System.out.println("\t\t\t\t\t\t\t\t*********************************");
                System.out.println("");
                System.out.print("\t\t| 1. Customer |   ");
                System.out.print("\t\t\t| 2. Supplier |    ");
                System.out.print("\t\t\t| 3. Print Invoice | ");
                System.out.println("\t\t\t| 4. Exit |       ");
                System.out.println("");
                System.out.println(" >>>>>Click Option <<<<<    ");
                  
                Scanner sc = new Scanner(System.in);
                int choice = sc.nextInt();
                
                switch (choice) {
                
                              case 1:
                                  
                                    Customer obj1 = new Customer();
                                    obj1.addRepairDetails();
                                    break;
                
                              case 2:
                                  
                                    Supplier obj2 = new Supplier();
                                    obj2.addSupplierDetails();
                                    break;

                              
                              case 3:
                                  
                                    CustomerInvoice obj3 = new CustomerInvoice();
                                    obj3.cusinvoice();   
                                    break;
                         
                              
                              case 4:
                                  
                                    System.exit(4);
                                    break;
                              
                              default:
                                  
                            System.out.println("Invalid Choice Try again");
                    
                
                                     }
                
                             }
                     }
 
}
