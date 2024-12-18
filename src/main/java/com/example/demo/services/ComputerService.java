package com.example.demo.services;


import com.example.demo.dao.entities.Computer;
import com.example.demo.dao.repositories.ComputerInterface;
import com.example.demo.dto.ComputerDTO;
import com.example.demo.mappers.ComputerMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComputerService implements ComputerServiceInterface{

    @Autowired
    ComputerInterface computerInterface;

    @Autowired
    ComputerMapper computerMapper;


    @Override
    public List<ComputerDTO> getComputerByProce(String proce) {
        List<Computer> Computers = computerInterface.findByProce(proce);
        List<ComputerDTO> ComputerDtos = new ArrayList<>();
        for (Computer computers : Computers){
            ComputerDtos.add(computerMapper.FromComputertoComputerDto(computers));
        }
        return ComputerDtos;

    }

    @Override
    public ComputerDTO saveComputer(ComputerDTO computerDTO) {
        Computer computer = computerMapper.FromComputerDtotoComputer(computerDTO);
        computer = computerInterface.save(computer);
        computerDTO = computerMapper.FromComputertoComputerDto(computer);
        return computerDTO;
    }


}
