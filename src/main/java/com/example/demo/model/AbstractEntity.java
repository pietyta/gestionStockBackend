package com.example.demo.model;
import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)

public class AbstractEntity implements Serializable {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@CreatedDate
	@Column(name="CreationDate" , nullable= false)
	@JsonIgnore
	private Instant creationDate ;
	
	@LastModifiedDate
    @Column(name="LastUpdateDate" )
	@JsonIgnore
    private Instant LastUpdateDate ;
	
}
