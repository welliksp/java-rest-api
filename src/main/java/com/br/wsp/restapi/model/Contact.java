
package com.br.wsp.restapi.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Wellik Perroni <welliksp@gmail.com>
 */

@Document
public class Contact {

	private String status;
	private String givenName;
	private String familiyName;
	private String birthDate;
	private Map<String, String> address = new HashMap<>();
	private Map<String, String> phones = new HashMap<>();

	
	

	
	public Contact(String status, String givenName, String familiyName, String birthDate, Map<String, String> address,
			Map<String, String> phones) {
		super();
		this.status = status;
		this.givenName = givenName;
		this.familiyName = familiyName;
		this.birthDate = birthDate;
		this.address = address;
		this.phones = phones;
	}
	
	

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGivenName() {
		return givenName;
	}
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	public String getFamiliyName() {
		return familiyName;
	}
	public void setFamiliyName(String familiyName) {
		this.familiyName = familiyName;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public Map<String, String> getAddress() {
		return address;
	}
	public void setAddress(Map<String, String> address) {
		this.address = address;
	}
	public Map<String, String> getPhones() {
		return phones;
	}
	public void setPhones(Map<String, String> phones) {
		this.phones = phones;
	}

	
	
}
