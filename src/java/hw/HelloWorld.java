/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw;

import java.util.LinkedList;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author s.bakunowicz
 */
@WebService(endpointInterface = "hw.IHelloWorld", serviceName = "WeirdService")
public class HelloWorld implements IHelloWorld{

    @Override
    public String GetHelloWorld(String name) {
        return "Hello world " + name;
    }

    @Override
    public List<Product> GetProducts() {
        
        List<Product> list = new LinkedList<Product>();
        
            Product p = new Product();
            p.setCena(10);
            p.setNazwa("telefon");
            p.setOpis("Opis telefonu");
            list.add(p);
            
            Product p1 = new Product();
            p1.setCena(20);
            p1.setNazwa("Herbata");
            p1.setOpis("Opis herbaty");
            list.add(p1);
            
            Product p2 = new Product();
            p2.setCena(30);
            p2.setNazwa("Mleko");
            p2.setOpis("Opis mleka");
            list.add(p2);
            
            Product p3 = new Product();
            p3.setCena(40);
            p3.setNazwa("Jogurt");
            p3.setOpis("Opis jogurtu");
            list.add(p3);
            
            Product p4 = new Product();
            p4.setCena(50);
            p4.setNazwa("Woda");
            p4.setOpis("Opis wody");
            list.add(p4);
        return list;
    }
    
}
