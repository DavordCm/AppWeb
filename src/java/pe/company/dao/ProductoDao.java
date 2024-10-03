/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.company.dao;

import java.sql.*;
import java.util.*;
import pe.company.dbase.ConexionDb;
import pe.company.vo.CategoriaVo;
import pe.company.vo.ProductoVo;

    public class ProductoDao
    {
     private Connection conn;
     private PreparedStatement ps;
     private ResultSet rs;
     private CategoriaDao categoriaDao=new CategoriaDao();
     public ProductoDao() {}

     public Collection<ProductoVo> findAll()
     {
         List<ProductoVo> list=new ArrayList<>();
         try {
         conn=ConexionDb.MySQL();
         ps=conn.prepareStatement("select * from productos");
         rs=ps.executeQuery();

         while(rs.next()) {
         ProductoVo producto=new ProductoVo();

         producto.setId_producto(rs.getInt("id_producto"));
         producto.setNombre(rs.getString("nombre"));
         producto.setMarca(rs.getString("marca"));
         producto.setPrecio(rs.getDouble("precio"));
         producto.setStock(rs.getInt("stock"));

         CategoriaVo categoria=categoriaDao.findById(rs.getInt("id_categoria"));
         producto.setCategoria(categoria);

         list.add(producto);
         }
     }
     catch(ClassNotFoundException | SQLException ex){
        ex.toString();
     }
     return list;
     }
}

