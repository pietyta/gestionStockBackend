package com.example.demo.model;

import java.time.Instant;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper =true)
@Entity
@Table(name="CommandeFournisseur")
public class CommandeFournisseur extends AbstractEntity {

	

	 @Column( name= "code")
	 private String code;
	 
	 @Column( name= "datecommande")
	 private Instant dateCommande;
	 
	 @ManyToOne()
	 @JoinColumn( name= "idFournisseur")
	 private String Fournisseur;
	 
	 @OneToMany(mappedBy = "commandeFournisseur")
	 private List<LigneCommandeFournisseur> LigneCommandeFournisseurs;
}
