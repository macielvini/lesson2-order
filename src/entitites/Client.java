package entitites;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private String name;
	private String email;
	private Date brithDate;
	
	public Client() {
		
	}

	public Client(String name, String email, Date brithDate) {
		this.name = name;
		this.email = email;
		this.brithDate = brithDate;
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

	public Date getBrithDate() {
		return brithDate;
	}

	public void setBrithDate(Date brithDate) {
		this.brithDate = brithDate;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(" (" + sdf.format(brithDate) + ") - ");
		sb.append(email);
		return sb.toString();
	}
}