/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanka_janaka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Jeyaprabakar
 */
public class purchase_Db {
    
                        
                    private String purchase_No;
                    private String supplier_Name;
                    private String Contact;
                    private String Part;
                    private String Quantity;


                    public void setpurchase_No(String purchase_No){

                                this.purchase_No = purchase_No;
                    }


                    public void setsupplier_Name(String supplier_Name){

                                this.supplier_Name = supplier_Name;
                    }


                    public void setContact(String Contact){

                                this.Contact = Contact;
                    }



                    public void setPart(String Part){

                                this.Part = Part;
                    }


                    public void setQuantity(String Quantity){

                                this.Quantity = Quantity;
                    }
                    
                    
                     void ippurchase(){
                        
                    Connection conn = null;
                    Statement st = null;
                    ResultSet rs = null;
                        
                    try {
                       
                    System.out.println(purchase_No+"     "+supplier_Name +"           "+Contact+"            "+Part+"             "+Quantity);
                    
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    conn = DriverManager.getConnection("jdbc:ucanaccess://E:\\DB\\RepairdetailsDB.accdb");
          
                    st = conn.createStatement();
                   
                    
                    int a = st.executeUpdate("Insert into purchase(purchaseNo,supName,contactNo,purPart,quantity) values('"+purchase_No +"' ,'"+supplier_Name +"' ,'"+Contact +"' , '"+Part +"' , '"+Quantity +"')");
                    
                  
                    
                    if (a==1){
                            
                        System.out.println("Record Inserted");
                    }
                    else{
                        
                        System.out.println("Error");
                    }
                     
                        } catch (ClassNotFoundException | SQLException ee  ){}

                     }
    
                
}
