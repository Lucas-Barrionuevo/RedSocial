package com.redSocial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redSocial.dto.PublicacionDTO;
import com.redSocial.entity.Publicacion;

@Service
public class PublicacionService {
	@Autowired
	private PublicacionService publicacionRepository;
	
	public PublicacionDTO createPublicacion (PublicacionDTO publicacionDTO) {
		Publicacion publicacion = mapearEntidad(publicacionDTO);
		
		Publicacion nuevaPublicacion = publicacionRepository.
		
		PublicacionDTO publicacionRespuesta = mapearDTO(nuevaPublicacion);
		
		return publicacionRespuesta;
		
		
	}
	//Convierte de entidad a DTO
	private PublicacionDTO mapearDTO (Publicacion publicacion) {
		PublicacionDTO publicacionDTO = new PublicacionDTO();
		
		publicacionDTO.setId(publicacion.getId());
		publicacionDTO.setTitulo(publicacion.getTitulo());
		publicacionDTO.setDescripcion(publicacion.getDescripcion());
		publicacionDTO.setContenido(publicacion.getContenido());
		
		return publicacionDTO;
	}
	//Convierte de DTO a entidad
	private Publicacion mapearEntidad (PublicacionDTO publicacionDTO) {
		Publicacion publicacion = new Publicacion();
		
		publicacion.setId(publicacionDTO.getId());
		publicacion.setTitulo(publicacionDTO.getTitulo());
		publicacion.setDescripcion(publicacionDTO.getDescripcion());
		publicacion.setContenido(publicacionDTO.getContenido());
		
		return publicacion;
	}
}
