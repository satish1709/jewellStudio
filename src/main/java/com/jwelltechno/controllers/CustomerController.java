package com.jwelltechno.controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jwelltechno.models.Address;
import com.jwelltechno.models.Customer;

@Controller
@RequestMapping("/api")
public class CustomerController {

	@PostMapping("/customer")
	public String customerDetails(@ModelAttribute Customer customer, Address address) {

		Configuration con = new Configuration().configure().addAnnotatedClass(Customer.class)
				.addAnnotatedClass(Address.class);

		SessionFactory sf = con.buildSessionFactory();
		Session ss = sf.openSession();
		ss.beginTransaction();

		ss.save(customer);
		ss.save(address);

		ss.getTransaction().commit();
		ss.close();
		sf.close();

		return "customer";
	}
}
