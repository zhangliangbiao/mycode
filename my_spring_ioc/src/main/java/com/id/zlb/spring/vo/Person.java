package com.id.zlb.spring.vo;

import java.io.Serializable;
/**
 * person�?
 * @author idzhangliangbiao
 *
 */
public class Person  implements Serializable{
 
	private static final long serialVersionUID = 5513367210808911996L;

	private String id;
	
	private String person_name;
	
	private String person_age;
	
	private String person_sex;
	
	private String person_img;
	
	private String person_phone;
	
	private String address;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPerson_name() {
		return person_name;
	}

	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}

	public String getPerson_age() {
		return person_age;
	}

	public void setPerson_age(String person_age) {
		this.person_age = person_age;
	}

	public String getPerson_sex() {
		return person_sex;
	}

	public void setPerson_sex(String person_sex) {
		this.person_sex = person_sex;
	}

	public String getPerson_img() {
		return person_img;
	}

	public void setPerson_img(String person_img) {
		this.person_img = person_img;
	}

	public String getPerson_phone() {
		return person_phone;
	}

	public void setPerson_phone(String person_phone) {
		this.person_phone = person_phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
