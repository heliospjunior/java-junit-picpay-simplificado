package com.picpaysimplificado.domain.user;

import java.math.BigDecimal;

import com.picpaysimplificado.dtos.UserDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="users")
@Table(name="users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")



public class User {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String firstName;
	 	
	private String lastName;
	
	@Column(unique=true)
	private String document;
	
	@Column(unique=true)
	private String email;
	
	private String password;
	
	private BigDecimal balance;
	
	@Enumerated(EnumType.STRING)
	private UserType userType;
	
	public User(){ }
	
	public User(UserDTO data) {
		
		this.firstName = data.firstName();
		this.lastName = data.lastName();
		this.document = data.document();
		this.email = data.email();
		this.password = data.password();
		this.userType = data.userType();
		this.balance = data.balance();
		
	}
	
	
	public Long getId() {
		return id;
	}

	
	public UserType getUserType() {
		return userType;
	}


	public BigDecimal getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	
	
	public String getDocument() {
		// TODO Auto-generated method stub
		return document;
	}


	public void setBalance(BigDecimal subtract) {
		// TODO Auto-generated method stub
		
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	
}
