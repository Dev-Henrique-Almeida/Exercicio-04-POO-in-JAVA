package br.com.ufape.poo;

public class Login {
	private String username;
	private String password;
	
	public Login(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public boolean autenticar(String password) {
		if(password.equals(this.password)) {
			return true;
		}else {
		System.out.print("Senha incorreta!");
		return false;
		}
	}

	public String getUsername() {
		return username;
	}


	public String getPassword() {
		return password;
	}
	
	
}
