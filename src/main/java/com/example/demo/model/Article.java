package com.example.demo.model;
 
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
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
@Table(name="article")
public class Article extends AbstractEntity {
	
     @Column( name= "codeArticle")
	 private String codeArticle ;
     
     @Column( name= "designation")
	 private String designation ;
     
     @Column( name= "prixunitaireht")
	 private BigDecimal prixUnitaireHt ;
     
     @Column( name= "tauxtva")
   	 private BigDecimal tauxTVA ;
     
     @Column( name= "prixUnitairettc")
   	 private BigDecimal prixUnitairettc ;
     
     @Column( name= "photo")
     private String photo ;
     
     @OneToMany
     @JoinColumn(name="idcategory")
     private Category category;
	 
}
