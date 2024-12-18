package com.example.demo.web;

import com.example.demo.dto.ComputerDTO;
import com.example.demo.services.ComputerService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ComputerGraphQLController  {

    private final ComputerService computerService;

    // Query to get computers by processor type
    public List<ComputerDTO> getComputersByProce(String proce) {
        return computerService.getComputerByProce(proce);
    }

    // Mutation to save a new computer
    public ComputerDTO saveComputer(ComputerDTO computerDTO) {
        return computerService.saveComputer(computerDTO);
    }
}
