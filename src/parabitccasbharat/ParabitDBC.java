/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parabitccasbharat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement; 
import java.sql.ResultSet;

/**
 *
 * @author ASUS
 */
public class ParabitDBC {
    Connection con;
    Statement stm;
    ResultSet rs1;
    
ParabitDBC()
{
    try
    {
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/parabitccabharat", "root", "");
    stm = con.createStatement();
    }
    catch(Exception e)
    {
        System.out.println("....." +e);
    }
}

public static void main()
{
    ParabitDBC dbc = new ParabitDBC();
}
    
}
