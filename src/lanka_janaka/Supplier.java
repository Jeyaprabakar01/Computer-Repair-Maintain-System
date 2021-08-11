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
public class Supplier {
    
                    void addSupplierDetails(){
                       System.out.println("*********************************");
                       System.out.println("1. Add Purchase Order Item");
                       System.out.println("2. View Purchase Order Item List");
                       System.out.println("3. Exit");
                       System.out.println("");
                       System.out.println(" >>>>>Click Option <<<<<    ");

                       Scanner sc  = new Scanner(System.in);
                       int choice = sc.nextInt();


                       switch(choice) {

                                   case 1:

                                       OrderItem obj1 = new OrderItem();
                                       obj1.addorder();

                                   break;


                                   case 2:

                                       PurchaseOrderView obj2 = new PurchaseOrderView();
                                       obj2.viewPurchase();

                                   break;


                                   case 3:

                                        System.exit(3);
                                        break;

                                   default:

                                   System.out.println("Invalid Choice Try again");

                       }

                    }
}
