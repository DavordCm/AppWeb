/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/EjbWebService.java to edit this template
 */
package pe.company.ws;
import java.util.Collection;
import javax.jws.*;
import pe.company.dao.ProductoDao;
import pe.company.vo.ProductoVo;

@WebService(serviceName = "ProductoWS")
public class ProductoWS
{
 //se instancia dao del producto
 private ProductoDao productoDao=new ProductoDao();

 @WebMethod(operationName="listarProductos")
 public Collection<ProductoVo> listarProducto(@WebParam(name="codigo") String codigo) {
 return productoDao.findAll();
 }
}
