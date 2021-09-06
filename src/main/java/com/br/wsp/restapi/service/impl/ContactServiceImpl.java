package com.br.wsp.restapi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.wsp.restapi.model.Contact;
import com.br.wsp.restapi.repository.ContactRepository;
import com.br.wsp.restapi.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepository;
	
	@Override
	public List<Contact> findAll() {

		return this.contactRepository.findAll();
	}

	@Override
	public Contact findById(String contactId) {

		return this.contactRepository.findById(contactId).orElseThrow(() -> new IllegalArgumentException("Contato não existe"));
	}

	@Override
	public Contact create(Contact contact) {
		return this.contactRepository.save(contact);
	}

	
	@Override
	public Contact delete() {
		return this.contactRepository.deleteAll();
	}

}
