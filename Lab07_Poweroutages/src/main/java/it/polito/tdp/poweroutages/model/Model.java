package it.polito.tdp.poweroutages.model;

import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.poweroutages.DAO.PowerOutageDAO;

public class Model {
	
	PowerOutageDAO podao;
	private List<Rilevazione> soluzione;
	
	public Model() {
		podao = new PowerOutageDAO();
	}
	
	public List<Nerc> getNercList() {
		return podao.getNercList();
	}
	
	public List<Rilevazione> getSoluzione(){
		this.soluzione=new ArrayList<Rilevazione>();
		ricorsione();
		return soluzione;
		}

	
	private void ricorsione() {
		
		
	}

}
