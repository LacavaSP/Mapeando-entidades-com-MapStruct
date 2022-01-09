package com.api.tutorial;

//@SpringBootApplication
public class TutorialSubstruct1Application {

	
		public static void main(String[] args) {
	//	SpringApplication.run(TutorialSubstruct1Application.class, args);
	

	Funcionario funcionario = new Funcionario();
	
	System.out.println("Primeiro tipo do objeto" + funcionario.getClass() + "\n");
	
	System.out.println("Segundo tipo do objeto" + FuncionarioMapper.INSTANCE.toDto(funcionario).getClass());
	
	FuncionarioDTO dto = FuncionarioMapper.INSTANCE.toDto(funcionario);
	
	System.out.println("Revertendo conversão" + FuncionarioMapper.INSTANCE.toEntity(dto).getClass());
	}

}
