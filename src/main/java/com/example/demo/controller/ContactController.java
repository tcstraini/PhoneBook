package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Contact;
import com.example.demo.service.ContactService;

@RestController
public class ContactController {

	@Autowired
	ContactService contactService;
    
    @GetMapping("/contact")
	Iterable<Contact> getContacts() {
	      return contactService.getContacts();
	 }
	
	@PostMapping("/contact")
	void createContact(@RequestBody Contact contact) {
		System.out.println(contact.getFirstname());
		System.out.println(contact.getLastname());
		
	contactService.saveContact(contact);
	}
	
	@DeleteMapping("/contact/{id}")
	void deleteContact(@PathVariable("id") Integer id) {
		contactService.deleteContact(id);
	}
	
	
}