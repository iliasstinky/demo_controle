package com.example.demo.mappers;

import com.example.demo.dao.entities.Computer;
import com.example.demo.dto.ComputerDTO;
import org.springframework.stereotype.Component;
import org.modelmapper.ModelMapper;

@Component
public class ComputerMapper {

    private final ModelMapper mapper = new ModelMapper();

    public ComputerDTO FromComputertoComputerDto(Computer computer) {
        return mapper.map(computer, ComputerDTO.class);
    }

    public Computer FromComputerDtotoComputer(ComputerDTO computerDTO) {
        return mapper.map(computerDTO, Computer.class);
    }
}