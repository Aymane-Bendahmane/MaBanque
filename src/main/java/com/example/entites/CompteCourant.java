package com.example.entites;

import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@DiscriminatorValue("CC")
public class CompteCourant extends Compte {

	private double decouvert;

	public CompteCourant() {
		super();
	}

	public CompteCourant(String codecompte, Date dataCreation, Double solde, Client client,
			Collection<Operation> operations, Double decouvert) {
		super(codecompte, dataCreation, solde, client, operations);
		this.decouvert = decouvert;
	}
}
