/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanka_janaka;

/**
 *
 * @author Jeyaprabakar
 */
public class OrderItemDetails {
    
                private String purchase_No;
                private String supplier_Name;
                private String Contact;
                private String Part;
                private String Quantity;

                
                public String getpurchase_No(){

                    System.out.print("Purchase No :");
                    return purchase_No;
                }

                public void setpurchase_No(String purchase_No){

                    this.purchase_No = purchase_No;
                }

                
                public String getsupplier_Name(){

                    System.out.print("Supplier name :");
                    return supplier_Name;
                }

                public void setsupplier_Name(String supplier_Name){

                    this.supplier_Name = supplier_Name;
                }

                

                public String getContact(){

                    System.out.print("Contact Number :");
                    return Contact;
                }

                public void setContact(String Contact){

                    this.Contact = Contact;
                }

                

                public String getPart(){

                    System.out.print("Purchased Part :");
                    return Part;
                }

                public void setPart(String Part){

                    this.Part = Part;
                }



                public String getQuantity(){

                    System.out.print("Quantity :");
                    return Quantity;
                }

                public void setQuantity(String Quantity){

                    this.Quantity = Quantity;
                }

    
}
