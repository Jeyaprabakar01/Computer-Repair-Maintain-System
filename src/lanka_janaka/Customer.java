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
public class Customer {
    
                void addRepairDetails(){
                    System.out.println("****************************");
                    System.out.println("1. Add Customer Repair Order");
                    System.out.println("2. View Repair Orders" );
                    System.out.println("3. Delete Repair Order");
                    System.out.println("4. Update Repair Order");
                    System.out.println("5. Exit");
                    System.out.println("");
                    System.out.println(" >>>>>Click Option <<<<<    ");

                    
                    Scanner sc  = new Scanner(System.in);
                    int choice = sc.nextInt();

                    switch(choice) {

                                case 1:

                                      Repair obj1 = new Repair();
                                      obj1.ipcomp();
                                      break;


                                case 2:
                                      RepairOrderView obj2 = new RepairOrderView();
                                      obj2.viewRepair();
                                      break;
                                 
                                      
                                case 3:
                                      DeleteRepair obj4 = new DeleteRepair();
                                      obj4.deleterepair();
                                      break;
                                      
                                case 4:
                                    
                                      UpdateRepair obj3 = new UpdateRepair();
                                      obj3.updaterepair();
                                      break;


                                case 5:

                                       System.exit(5);
                                       break;

                                default:

                                System.out.println("Invalid Choice Try again");




                    }

                }
    

    
}
