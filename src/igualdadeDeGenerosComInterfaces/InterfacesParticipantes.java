package igualdadeDeGenerosComInterfaces;

import java.util.ArrayList;

public interface InterfacesParticipantes {

	 		 	 
	//Métodos Getters e Setters
	 	abstract ArrayList<String> getEmail(); 
		abstract void setEmail(ArrayList<String> email); 
		abstract ArrayList<Integer> getSenha(); 
		abstract void setSenha(ArrayList<Integer> senha); 
		
		public String getLogin();
		public void setLogin(String login);
		public ArrayList<String> getNome(); 
		public void setNome(ArrayList<String> nome); 
		public ArrayList<String> getGenero(); 
		public void setGenero(ArrayList<String> genero); 
		public ArrayList<String> getFilhos(); 
		public void setFilhos(ArrayList<String> filhos);
		
		//Método para ser implementado na Classe cadastroDosUsuarios
		public abstract void CadastrarParticipantes();
}
