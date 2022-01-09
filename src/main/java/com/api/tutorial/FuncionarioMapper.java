package com.api.tutorial;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface FuncionarioMapper {


	FuncionarioMapper INSTANCE = Mappers.getMapper( FuncionarioMapper.class );
	
	Funcionario toEntity (FuncionarioDTO dto);
	
	@InheritInverseConfiguration
	FuncionarioDTO toDto (Funcionario funcionario);
}
