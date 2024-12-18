package com.example.demo.dao.repositories;

import com.example.demo.dao.entities.Computer;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComputerInterface extends JpaRepository<Computer , Integer> {
    public List<Computer> findByProce(String proce);

}
