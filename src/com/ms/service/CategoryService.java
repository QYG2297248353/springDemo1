package com.ms.service;
/**
 * 注解->bean->cs
 */
import org.springframework.stereotype.Component;

@Component("cs")
public class CategoryService {
	public void doSomeService() {

		System.out.println("Category->做了一点事情");

	}
}
