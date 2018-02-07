package com.hdb.web.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="user_Table")
public class User {
		@Id
		@GeneratedValue
		private int uid;
		   private String name;
		   private String email;
		   private String gender;
		   @ElementCollection
		   private List<String> languages;
		   
		   public User() {
			// TODO Auto-generated constructor stub
			   System.out.println("created user dto");
		}
		   
		   
		   
		   
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public List<String> getLanguages() {
			return languages;
		}
		public void setLanguages(List<String> languages) {
			this.languages = languages;
		}
		@Override
		public String toString() {
			return "User [uid=" + uid + ", name=" + name + ", email=" + email + ", gender=" + gender + ", languages="
					+ languages + "]";
		}

		   //Setter and Getter methods

		
		   
}
