package com.ms.spring;
import org.springframework.stereotype.Component;
/**
 * ʵ����
 * 
 * @author Ms beanע�� ���Գ�ʼ��->ע��
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
