package com.br.wsp.restapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.br.wsp.restapi.model.Contact;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends MongoRepository<Contact, String>  {

}
