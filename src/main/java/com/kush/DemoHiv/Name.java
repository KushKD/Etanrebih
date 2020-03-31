package com.kush.DemoHiv;

import javax.persistence.Embeddable;

@Embeddable // We want to embed this field inside the name class
public class Name {
	
	private String first_name;
	private String middle_name;
	private String last_name;
	private String nick_name;
	

	public Name() {
		// TODO Auto-generated constructor stub
	}
	
	


	public Name(String first_name, String middle_name, String last_name, String nick_name) {
		super();
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.nick_name = nick_name;
	}




	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getMiddle_name() {
		return middle_name;
	}


	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getNick_name() {
		return nick_name;
	}


	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}


	@Override
	public String toString() {
		return "Name [first_name=" + first_name + ", middle_name=" + middle_name + ", last_name=" + last_name
				+ ", nick_name=" + nick_name + "]";
	}
	
	

}
