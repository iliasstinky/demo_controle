package com.example.demo;

import com.example.demo.dto.ComputerDTO;
import com.example.demo.services.ComputerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	CommandLineRunner start(ComputerService computerService){
		return  args -> {
			List<ComputerDTO> computersDTO = List.of(
					ComputerDTO.builder().proce("model1").hardDrive("54ee").ram("12").price(12345.2f).build(),
					ComputerDTO.builder().proce("model2").hardDrive("aze5ee").ram("32").price(65489f).build(),
					ComputerDTO.builder().proce("model3").hardDrive("eze54z4e").ram("15").price(89789f).build(),
					ComputerDTO.builder().proce("model4").hardDrive("zaeza54").ram("16").price(67489f).build()
			);
			for(ComputerDTO computerDTO : computersDTO){
				computerService.saveComputer(computerDTO);
			}
		};
	}
}
