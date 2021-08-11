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
public class Repair {
    
                RepairDetails ob1 = new RepairDetails();
                repair_Db ob2 = new repair_Db();

                Scanner sc = new Scanner(System.in);

    
                void ipcomp(){
                       
                    System.out.println("Enter Repair No");
                    String repNo = sc.nextLine();

                    System.out.println("Enter Customer name");
                    String cusNa = sc.nextLine();

                    System.out.println("Enter Customer contact no");
                    String cusNo = sc.nextLine();

                    System.out.println("Enter type");
                    String pro_Type = sc.nextLine();

                    System.out.println("Enter brand");
                    String brand = sc.nextLine();

                    System.out.println("Enter computer type");
                    String comType = sc.nextLine();


                    ob1.setrepair_No(repNo);
                    ob1.setcustomer_Name(cusNa);
                    ob1.setcustomer_Contact(cusNo);
                    ob1.setprocessor_Type(pro_Type);
                    ob1.setbrand(brand);
                    ob1.setcom_Type(comType);

                    System.out.println(ob1.getrepair_No());
                    System.out.println(ob1.getcustomer_Name());
                    System.out.println(ob1.getcustomer_Contact());
                    System.out.println(ob1.getprocessor_Type());
                    System.out.println(ob1.getbrand());
                    System.out.println(ob1.getcom_Type());

                    ob2.setrepair_No(repNo);
                    ob2.setcustomer_Name(cusNa);
                    ob2.setcustomer_Contact(cusNo);
                    ob2.setprocessor_Type(pro_Type);
                    ob2.setbrand(brand);
                    ob2.setcom_Type(comType);
                    
                    ob2.iprepair(); 

    }
            
                    
                    void delrepair(){
                        
                        System.out.println("Enter Repair No");
                        String repNo = sc.nextLine();

                        System.out.println("Enter Customer name");
                        String cusNa = sc.nextLine();

                        System.out.println("Enter Customer contact no");
                        String cusNo = sc.nextLine();

                        System.out.println("Enter type");
                        String pro_Type = sc.nextLine();

                        System.out.println("Enter brand");
                        String brand = sc.nextLine();

                        System.out.println("Enter computer type");
                        String comType = sc.nextLine();
                        
                        
                        
                        System.out.println("Repair Order updated Successfully.");
                        
                        
                        
                    }
                 
              
    
}
