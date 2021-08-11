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

/**
 *
 * @author Jeyaprabakar
 */
public class PurchaseOrderView {
 
 
                    Connection conn = null;
                    Statement st = null;
                    ResultSet rs = null;
                    
                    void viewPurchase(){
                       
                       try {
                        
                        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                       
                        conn = DriverManager.getConnection("jdbc:ucanaccess://E:\\DB\\RepairdetailsDB.accdb");
                      
                        st = conn.createStatement();
                      
                        st.getResultSet();
                        
                        rs = st.executeQuery("select * from purchase");
                        
                      
                        System.out.println("purchaseNo"+"   "+"supName"+"   "+"contactNo"+"   "+"purPart"+"   "+"quantity");
                       
                        
                        while((rs!= null) && (rs.next())) {
                           
                           String s1 = rs.getString(1);
                           String s2 = rs.getString(2);
                           String s3 = rs.getString(3);
                           String s4 = rs.getString(4);
                           String s5 = rs.getString(5);
                          
                          
                           
                           System.out.println(  s1 +"           "+ s2 +"   " + s3 +"    "+ s4 +"        " + s5 );
                       }
                           
                       } catch (ClassNotFoundException | SQLException ee  ){}
                           
                             
                    }
                    
}
