package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ContactRepository;
import com.example.demo.entity.Contact;

@Service
public class ContactService {
	@Autowired
    ContactRepository contactRepository;
	public Iterable<Contact> getContacts() {
		return  contactRepository.findAll();
	}

	public void saveContact(Contact contact) {
		contactRepository.save(contact);
		
	}

	public void deleteContact(Integer id) {
		contactRepository.deleteById(id);
		
	}
}