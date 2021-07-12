package com.ms.spring;
import org.springframework.stereotype.Component;
/**
 * 实体类
 * 
 * @author Ms bean注解 属性初始化->注入
 */
@Component("c")
public class Category {
	private int id;
	private String name = "Category 1";

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

}
