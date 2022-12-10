package com.redSocial.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@Table( name = "publicaciones" , uniqueConstraints = {@UniqueConstraint (columnNames = {"titulo"})} )
public class Publicacion {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String titulo;
	@Column(nullable = false)
	private String descripcion;
	@Column(nullable = false)
	private String contenido;
}
