package com.Petzey_Authentication.Repository;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Petzey_Authentication.Entity.Credentials;

public interface CredentialsRepositiory extends JpaRepository<Credentials, Long>{
	
	// @Query(value="select role from Credentials m where m.emailid=:emailid")
	// public String getRoleByEmailId(@Param (value = "emailid")String emailid);
	
	
	
    // @Query(value="SELECT  c.role FROM Credentials c WHERE c.emailid=:email")
    // public String getrolebyEmailId(@Param(value="email") String email);
    
    // @Query(value="SELECT c.userid FROM Credentials c WHERE c.emailid=:email")
    // public Long getidbyEmail(@Param(value="email") String email);
    
    @Query("SELECT c.role AS role, c.userid AS userid, c.name AS name FROM Credentials c WHERE c.emailid = :email")
    public Map<String, Object> getRoleAndIdByEmail(@Param("email") String email);

}


//private long userid;
//private String role;
//private String name;
//private String emailid;