/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Formularios;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Conexion {
    static final String URL="jdbc:mysql://localhost:3306/aeropuerto?autoReconnet=true&useSSL=false";
    static final String usu = "root";
    static final String contra="honduras16";

    public Conexion() {
    }
    
    public Connection getConnection(){
        Connection conex=null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conex=  (Connection) DriverManager.getConnection(URL, usu, contra);
        }catch(Exception ex){
            System.err.println("Error: "+ex);
        }
        
        return conex;
    }
}
