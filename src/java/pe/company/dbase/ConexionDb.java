/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.company.dbase;

import java.sql.*;
public class ConexionDb
{
 public static Connection MySQL() throws ClassNotFoundException, SQLException {
 Class.forName("com.mysql.jdbc.Driver");
 Connection c=DriverManager.getConnection
 ("jdbc:mysql://localhost:3306/bd_example","root","123456");
 return c;
 }
}