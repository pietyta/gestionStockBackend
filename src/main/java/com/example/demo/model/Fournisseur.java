package com.example.demo.model;
 
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="Fournisseur")
public class Fournisseur extends AbstractEntity{

	
	@Column( name= "nom")
	 private String nom;
	 
	 @Column( name= "prenom")
	 private String prenom;
	 
	 @Embedded
	 private Adresse adresse;
	 
	 @Column( name= "photo")
	 private String photo;
	 
	 @Column( name= "mail")
	 private String mail;
	 
	 @Column( name= "numTel")
	 private String numTel;
	 
	 

	@ManyToOne
    @JoinColumn(name="idarticle")
	private Article article;
}
