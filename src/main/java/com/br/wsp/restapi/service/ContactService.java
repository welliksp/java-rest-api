package com.br.wsp.restapi.service;

import java.util.*;

import com.br.wsp.restapi.model.Contact;

public interface ContactService {
	
	public List<Contact> findAll();
	public Contact findById(String contactId);
	public Contact create(Contact contact);
	public Contact delete(Contact contact);

}
