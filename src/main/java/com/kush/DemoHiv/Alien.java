package com.kush.DemoHiv;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

//@Entity(name = "alien_table")
  @Entity
  @Table(name = "alien_name")
public class Alien {
	
	@Id
	private int id;
	
	@Column(name="alien_name")
	private Name name;
	
	//@Transient   //meaning we do not want this column to save now
	private String aid;
	
	private String color;

	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getAid() {
		return aid;
	}

	public void setAid(String aid) {
		this.aid = aid;
	}

	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + ", aid=" + aid + ", color=" + color + "]";
	}

	
	
	

	
	

}
