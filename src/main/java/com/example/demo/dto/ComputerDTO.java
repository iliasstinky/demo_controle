package com.example.demo.dto;


import lombok.*;
@Data
@Builder
@AllArgsConstructor
@ToString
public class ComputerDTO {
      private String proce;
      private String ram;
      private float price;
      private String hardDrive;
}
