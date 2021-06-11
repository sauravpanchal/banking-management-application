/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bankingmanagementsystem;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author saura
 */
public class JavaConnect 
{
    Connection conn = null;
    
    public static Connection ConnecrDb()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\saura\\OneDrive\\Documents\\Indus University\\Java\\Project\\BankingManagementSystem\\bankingmanagementsystem.db");
            return conn;
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }   
}
