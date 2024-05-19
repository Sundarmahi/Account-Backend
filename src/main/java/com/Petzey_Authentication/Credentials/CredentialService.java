package com.Petzey_Authentication.Credentials;

import java.util.Map;

import com.Petzey_Authentication.Entity.Credentials;
import com.Petzey_Authentication.Exception.CredException;

public interface CredentialService {
	
	public Credentials saveCredentials(Credentials cred) throws CredException;
	
//	public String GetRoleByEmailId(String emailid) throws CredException;
	

	public Map<String, Object> getRoleAndIdByEmail(String email);

}
