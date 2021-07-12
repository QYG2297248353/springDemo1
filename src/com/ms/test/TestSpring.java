package com.ms.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ms.service.CategoryService;
import com.ms.service.ProductService;
import com.ms.spring.Category;
import com.ms.spring.Product;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSpring {
	@Autowired
	Category c;
	@Autowired
	Product p;
	@Autowired
	CategoryService cs;
	@Autowired
	ProductService ps;

	@Test
	public void test() {
		System.out.println(c.getName());
		System.out.println(p.getName());
		System.out.println("---------------------------------");
	}

	@Test
	public void test1() {
		System.out.println(p.getName());
		System.out.println(p.getCategory().getName());
		System.out.println("---------------------------------");
	}

	@Test
	public void test2() {
		cs.doSomeService();
		ps.doSomeService();
		System.out.println("---------------------------------");
	}

}