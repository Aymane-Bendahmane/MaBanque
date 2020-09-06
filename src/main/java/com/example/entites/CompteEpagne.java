package com.example.entites;

import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data

@DiscriminatorValue("CE")
public class CompteEpagne extends Compte {

	private double taux;

	public CompteEpagne() {
		super();
	}

	public CompteEpagne(String codecompte, Date dataCreation, Double solde, Client client,
			Collection<Operation> operations) {
		super(codecompte, dataCreation, solde, client, operations);
		// TODO Auto-generated constructor stub
	}

}
