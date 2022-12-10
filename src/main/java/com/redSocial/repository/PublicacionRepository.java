package com.redSocial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redSocial.dto.PublicacionDTO;

public interface PublicacionRepository extends JpaRepository<PublicacionRepository, Long>{
	public PublicacionDTO createPublicacion(PublicacionDTO publicacionDTO);
}
