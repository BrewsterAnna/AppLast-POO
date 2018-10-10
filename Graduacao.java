package negocio;

import java.util.Calendar;

public class Graduacao extends Aluno {
	
	private String email;
	private Calendar dataNascimento;
	
	@Override
	public void exibir() {
		
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
