/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.company.dao;

import java.sql.*;
import java.util.*;
import pe.company.dbase.ConexionDb;
import pe.company.vo.CategoriaVo;

    public class CategoriaDao
    {
     private Connection conn;
     private PreparedStatement ps;
     private ResultSet rs;

     public CategoriaDao() {}

     public CategoriaVo findById(int id_categoria) {
         CategoriaVo categoria=null;
         try {
         conn=ConexionDb.MySQL();
         ps=conn.prepareStatement("select * from categorias where id_categoria=?");
         ps.setInt(1,id_categoria);
         rs=ps.executeQuery();

         if(rs.next()) {
         categoria=new CategoriaVo();
         categoria.setId_categoria(rs.getInt("id_categoria"));
         categoria.setDescripcion(rs.getString("descripcion"));
     }
         }
         catch(ClassNotFoundException | SQLException ex){
         ex.toString();
         }
     return categoria;
     }

     public Collection<CategoriaVo> findAll() {
         List<CategoriaVo> list=new ArrayList<>();
         try {
         conn=ConexionDb.MySQL();
         ps=conn.prepareStatement("select * from categorias");
         rs=ps.executeQuery();

         while(rs.next()) {
         CategoriaVo categoria=new CategoriaVo();
         categoria.setId_categoria(rs.getInt("id_categoria"));
         categoria.setDescripcion(rs.getString("descripcion"));
         list.add(categoria);
         }
     }
     catch(ClassNotFoundException | SQLException ex){
     ex.toString();
     }
     return list;
     }
}