package com.ms.service;

import org.springframework.stereotype.Component;

/**
 * 注解->bean->ps
 * @author Ms
 *
 */
@Component("ps")
public class ProductService {
	public void doSomeService(){
        
        System.out.println("Product->做了一点事情");
         
    }
}
