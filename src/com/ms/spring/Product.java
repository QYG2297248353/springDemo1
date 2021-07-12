package com.ms.spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 实体类
 * 
 * @author Ms bean注解 属性初始化->注入
 *
 */
@Component("p")
public class Product {
	private int id;
	private String name = "Product 1";
	@Autowired
	private Category category;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
