package com.example.demo.services;

import com.example.demo.dao.entities.Computer;
import com.example.demo.dto.ComputerDTO;

import java.util.List;

public interface ComputerServiceInterface {
    public List<ComputerDTO> getComputerByProce(String proce);

    public ComputerDTO saveComputer(ComputerDTO computerDTO);
}
