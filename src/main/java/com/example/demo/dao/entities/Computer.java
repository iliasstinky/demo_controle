package com.example.demo.dao.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

public class Computer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id_pc ;
    private String proce ;
    private String ram ;
    private String hardDrive;
    private float price ;
    private String macAdress ;

}
