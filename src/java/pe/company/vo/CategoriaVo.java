/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.company.vo;
import java.util.ArrayList;
import java.util.Collection;

    public class CategoriaVo
    {
     private int id_categoria;
     private String descripcion;
     private Collection<ProductoVo> itemsProducto=new ArrayList();
     public CategoriaVo() {
     }
     public CategoriaVo(int id_categoria, String descripcion) {
     this.id_categoria = id_categoria;
     this.descripcion = descripcion;
     }

 public void addProducto(ProductoVo producto) {
 itemsProducto.add(producto);
 }
 //Getters and Setters

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Collection<ProductoVo> getItemsProducto() {
        return itemsProducto;
    }

    public void setItemsProducto(Collection<ProductoVo> itemsProducto) {
        this.itemsProducto = itemsProducto;
    }
}