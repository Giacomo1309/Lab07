package it.polito.tdp.poweroutages.model;

import java.util.*;

public class Rilevazione {

	private Date dataInizio;
	private Date dataFine;
	private Integer numeroAffetti;
	private Nerc nerc;
	
	public Rilevazione(Date dataInizio, Date dataFine, Integer numeroAffetti, Nerc nerc) {
		super();
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		this.numeroAffetti = numeroAffetti;
		this.nerc = nerc;
	}
	public Date getDataInizio() {
		return dataInizio;
	}
	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}
	public Date getDataFine() {
		return dataFine;
	}
	public void setDataFine(Date dataFine) {
		this.dataFine = dataFine;
	}
	public Integer getNumeroAffetti() {
		return numeroAffetti;
	}
	public void setNumeroAffetti(Integer numeroAffetti) {
		this.numeroAffetti = numeroAffetti;
	}
	public Nerc getNerc() {
		return nerc;
	}
	public void setNerc(Nerc nerc) {
		this.nerc = nerc;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataFine == null) ? 0 : dataFine.hashCode());
		result = prime * result + ((dataInizio == null) ? 0 : dataInizio.hashCode());
		result = prime * result + ((nerc == null) ? 0 : nerc.hashCode());
		result = prime * result + ((numeroAffetti == null) ? 0 : numeroAffetti.hashCode());
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
		Rilevazione other = (Rilevazione) obj;
		if (dataFine == null) {
			if (other.dataFine != null)
				return false;
		} else if (!dataFine.equals(other.dataFine))
			return false;
		if (dataInizio == null) {
			if (other.dataInizio != null)
				return false;
		} else if (!dataInizio.equals(other.dataInizio))
			return false;
		if (nerc == null) {
			if (other.nerc != null)
				return false;
		} else if (!nerc.equals(other.nerc))
			return false;
		if (numeroAffetti == null) {
			if (other.numeroAffetti != null)
				return false;
		} else if (!numeroAffetti.equals(other.numeroAffetti))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Rilevazione [dataInizio=" + dataInizio + ", dataFine=" + dataFine + ", numeroAffetti=" + numeroAffetti
				+ this.nerc.getValue()+"]";
	}
	
}
