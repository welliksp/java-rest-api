
package com.br.wsp.restapi.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.wsp.restapi.model.Contact;
import com.br.wsp.restapi.repository.ContactRepository;
import com.br.wsp.restapi.service.ContactService;

/**
 *
 * @author Wellik Perroni <welliksp@gmail.com>
 */

@RestController
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	
	
	@GetMapping("/client")
	public List<Contact> contactList() {
		return this.contactService.findAll();
	}
	
	@GetMapping("/{contactId}")
	public Contact findById(@PathVariable String contactId) {
            return this.contactService.findById(contactId);
	}
	
	@PostMapping(value = "/create")
	public Contact insert(@RequestBody Contact contact) {
            
         return contactService.create(contact);
		
		
	}


}
