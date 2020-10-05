package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	
	private String name;
	private String email;
	private Date BirthDate;


	public Client() {
	}


	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		BirthDate = birthDate;
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


	public Date getBirthDate() {
		return BirthDate;
	}


	public void setBirthDate(Date birthDate) {
		BirthDate = birthDate;
	}


@Override
	public String toString(){
	 
		StringBuilder sb = new StringBuilder();
		
		sb.append("\n Client name: ");
		sb.append(name);
		sb.append("\n Client mail: ");
		sb.append(email);
		sb.append("\n Client Birth Date: ");
		sb.append(sdf.format(BirthDate));

	return sb.toString();
		
	}






}
