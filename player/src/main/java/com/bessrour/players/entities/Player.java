package com.bessrour.players.entities;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPlayer;
	private String nomPLayer;
	private Date dateCreation;
	private Double scorePLayer;
	
	public Player() {
		super();
	}
	
	public Player(String nomPLayer, Date dateCreation , Double scorePLayer) {
		super();
		this.nomPLayer = nomPLayer;
		this.dateCreation = dateCreation;
		this.scorePLayer = scorePLayer;
	}

	public Long getIdPlayer() {
		return idPlayer;
	}

	public void setIdPlayer(Long idPlayer) {
		this.idPlayer = idPlayer;
	}

	public String getNomPLayer() {
		return nomPLayer;
	}

	public void setNomPLayer(String nomPLayer) {
		this.nomPLayer = nomPLayer;
	}


	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Double getScorePLayer() {
		return scorePLayer;
	}

	public void setScorePLayer(Double scorePLayer) {
		this.scorePLayer = scorePLayer;
	}

	@Override
	public String toString() {
		return "Player [idPlayer=" + idPlayer + ", nomPLayer=" + nomPLayer + ", dateCreation=" + dateCreation
				+ ", scorePLayer=" + scorePLayer + "]";
	}
	
}