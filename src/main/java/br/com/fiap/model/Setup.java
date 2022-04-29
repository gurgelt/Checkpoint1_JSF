package br.com.fiap.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Setup {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name = "Nome";
	private LocalDateTime data;
	private String email = "Email";
	private String senha = "Senha";

	public String getName() {
		return name;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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
	
	@Override
	public String toString() {
		return "Setup [name=" + name + ", data=" + data + ", email=" + email + "senha=" + senha + "]";
	}

	public Long getId() {
		return id;
	}
}
