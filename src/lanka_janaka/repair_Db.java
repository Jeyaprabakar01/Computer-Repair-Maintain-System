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


public class repair_Db {
    
                    private String repNo;
                    private String cusNa;
                    private String cusNo;
                    private String pro_Type;
                    private String brand;
                    private String comType;

                    
                    
                    public void setrepair_No(String repair_No){

                            this.repNo = repair_No;
                    }

                    public void setcustomer_Name(String customer_Name){

                            this.cusNa = customer_Name;
                    }

                    public void setcustomer_Contact(String customer_Contact){

                            this.cusNo = customer_Contact;
                    }


                    public void setprocessor_Type(String processor_Type){

                            this.pro_Type = processor_Type;
                    }
                    

                    public void setbrand(String brand){

                            this.brand = brand;
                    }


                    public void setcom_Type(String com_Type){

                            this.comType = com_Type;
                    }
                    
                 
                    
                    void iprepair(){
                        
                    Connection conn = null;
                    Statement st = null;
                    ResultSet rs = null;
                        
                    try {
                       
                    System.out.println(repNo+"     "+cusNa +"           "+cusNo+"            "+pro_Type+"             "+brand+"           "+comType);
                    
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    conn = DriverManager.getConnection("jdbc:ucanaccess://E:\\DB\\RepairdetailsDB.accdb");
          
                    st = conn.createStatement();
                   
                    
                    int a = st.executeUpdate("Insert into repair(repairNo,customerName,contactNo,proType,brand,comType) values('"+repNo +"' ,'"+cusNa +"' ,'"+cusNo +"' , '"+pro_Type +"' "
                                                                                                                                                         + " , '"+brand +"' ,'"+comType+"')");
                            
                   
                    
                    if (a==1){
                            
                        System.out.println("Record Updated");
                    }
                    else{
                        
                        System.out.println("Error");
                    }
                     
                        } catch (ClassNotFoundException | SQLException ee  ){}
                    
                    
                    
                    
                    }
                    
                   
              }
            

            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            


