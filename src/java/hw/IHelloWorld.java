package hw;


import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s.bakunowicz
 */
@WebService(name = "WorldHello" )
public interface IHelloWorld {
    @WebMethod
    String GetHelloWorld(String name);
    
    @WebMethod(operationName = "Products")
    List<Product> GetProducts();
}
