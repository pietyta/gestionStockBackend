package com.example.demo.model;
 
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
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
public class Adresse extends AbstractEntity{

	 @Column( name= "addresse1")
	 private String addresse1;
	 
	 @Column( name= "addresse2")
	 private String addresse2;
	 
	 @Column( name= "ville")
	 private String ville;
	 
	 @Column( name= "codepostale")
	 private String CodePostale;
	 
	 @Column( name= "pays")
	 private String pays;
	 
	 @OneToMany(mappedBy= "client")
	 private List<CommandeClient> commandeClients;
}
