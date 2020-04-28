package it.polito.tdp.poweroutages.model;

import java.util.*;

public class Nerc {

	
	private int id;
	private String value;
	private List<Rilevazione> rilevazioni;

	public Nerc(int id, String value) {
		this.id = id;
		this.value = value;
	}
	

	public List<Rilevazione> getRilevazioni() {
		return rilevazioni;
	}


	public void setRilevazioni(List<Rilevazione> rilevazioni) {
		this.rilevazioni = rilevazioni;
	}


	public Nerc(int id, String value, List<Rilevazione> rilevazioni) {
		super();
		this.id = id;
		this.value = value;
		this.rilevazioni = rilevazioni;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nerc other = (Nerc) obj;
		if (id != other.id)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Nerc [id=" + id + ", value=" + value + ", rilevazioni=" + rilevazioni + "]";
	}

	//@Override
	
	/**public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(value);
		return builder.toString();
	}**/

	

}
