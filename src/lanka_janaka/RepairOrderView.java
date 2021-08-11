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
public class RepairOrderView {
    
                    Connection conn = null;
                    Statement st = null;
                    ResultSet rs = null;
                    
                   
                   void viewRepair(){
                       
                       try {
                        
                        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                      
                        conn = DriverManager.getConnection("jdbc:ucanaccess://E:\\DB\\RepairdetailsDB.accdb");
                
                        st = conn.createStatement();
                       
                        st.getResultSet();
                        
                        rs = st.executeQuery("select * from repair");
                        
                        
                        System.out.println("repairNo"+"    "+"customerName"+"    "+"contactNo"+"    "+"proType"+"     "+"brand"+"      "+"comType");
                       
                        
                        while((rs!= null) && (rs.next())) {
                           
                           String s1 = rs.getString("repairNo");
                           String s2 = rs.getString("customerName");
                           String s3 = rs.getString("contactNo");
                           String s4 = rs.getString("proType");
                           String s5 = rs.getString("brand");
                           String s6 = rs.getString("comType");
                          
                          
                           
                           System.out.println(     s1 +"              "+ s2 +"       " + s3 +"     "+ s4+ "         "+s5+"       "+s6 );
                       }
                           
                       } catch (ClassNotFoundException | SQLException ee  ){}
                           
                             
                       
                      
                   }
                    
                    
                    
                    
                    
                    
                    
}
