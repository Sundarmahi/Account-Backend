package com.Petzey_Authentication.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Credentials {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private long userid;
	private String role;
	private String name;
	private String emailid;

}
