/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.ed.clothshop.services;

import gr.ed.clothshop.model.Customer;
import gr.ed.clothshop.model.Order;
import gr.ed.clothshop.model.Product;
import java.util.List;

/**
 *
 * @author mantz
 */
public interface CustomerService {
    
    boolean register(Customer customer);
    
    boolean placeOrder(int customerId, int productId, int Orderid);
    
    List<Product> searchProduct(String productName);
    
    Order showOrder(int orderId);
}
