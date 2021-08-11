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
public class OrderItem {
 
            OrderItemDetails ob1 = new OrderItemDetails();
            purchase_Db ob2 = new purchase_Db();
            
            Scanner sc = new Scanner(System.in);
            
            
            void addorder(){
                
               System.out.println("Enter purchase no");
               String purNo = sc.nextLine();
                
               System.out.println("Enter Supplier name");
               String supNa = sc.nextLine();
        
               System.out.println("Enter Supplier contact no");
               String contactNo = sc.nextLine();
        
               System.out.println("Enter Purchased Part");
               String part = sc.nextLine();
        
               System.out.println("Enter Quanity of parts");
               String quantity = sc.nextLine();
               
               ob1.setpurchase_No(purNo);
               ob1.setsupplier_Name(supNa);
               ob1.setContact(contactNo);
               ob1.setPart(part);
               ob1.setQuantity(quantity);
               
               System.out.println(ob1.getsupplier_Name());
               System.out.println(ob1.getContact());
               System.out.println(ob1.getPart());
               System.out.println(ob1.getQuantity());
                
               
               ob2.setpurchase_No(purNo);
               ob2.setsupplier_Name(supNa);
               ob2.setContact(contactNo);
               ob2.setPart(part);
               ob2.setQuantity(quantity);
               
               ob2.ippurchase();
               
               
               
               
            }
            
            
            
             
            
            
            
            
            
}
