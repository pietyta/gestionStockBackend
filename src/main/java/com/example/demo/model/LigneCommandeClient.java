package com.example.demo.model;
 
import javax.persistence.Column;
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
@Table(name="LigneCommandeClient")
public class LigneCommandeClient extends AbstractEntity{

	@Column( name= "code")
	 private String code;

	@ManyToOne
    @JoinColumn(name="idarticle")
	private Article article;
	
	@ManyToOne
    @JoinColumn(name="idcommandeclient")
	private CommandeClient commandeClient;
}
