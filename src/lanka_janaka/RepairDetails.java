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
public class RepairDetails {
                private String repair_No;
                private String customer_Name;
                private String customer_Contact;
                private String processor_Type;
                private String brand;
                private String com_Type;
                
                
                public String getrepair_No(){
                                                                                                                           
                                                                                                                            
                                                                                                                                                                            
                    System.out.print("Repair No is:");
                    
                    return repair_No;
                }

                public void setrepair_No(String repair_No){

                    this.repair_No = repair_No;
                }
                

                public String getcustomer_Name(){

                    System.out.print("Customer name is:");
                    return customer_Name;
                }

                public void setcustomer_Name(String customer_Name){

                    this.customer_Name = customer_Name;
                }
                
                

                public String getcustomer_Contact(){

                    System.out.print("Customer conatct no is:");
                    return customer_Contact;
                }
                
                public void setcustomer_Contact(String customer_Contact){

                    this.customer_Contact = customer_Contact;
                }
                 
                public String getprocessor_Type(){

                    System.out.print("processor : ");
                    return processor_Type;
                }

                public void setprocessor_Type(String processor_Type){

                    this.processor_Type = processor_Type;
                }

                public String getbrand(){

                    System.out.print("brand: ");
                    return brand;
                }

                public void setbrand(String brand){

                    this.brand = brand;
                }


                
                public String getcom_Type(){

                    System.out.print("computer type: ");
                    return com_Type;
                }

                public void setcom_Type(String com_Type){

                    this.com_Type = com_Type;
                }
    
}
