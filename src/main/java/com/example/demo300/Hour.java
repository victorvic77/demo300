package com.example.demo300;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;
import lombok.*;

@Data
@Entity
public class Hour {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Double Time;

    private Double Open;
    private Double High;
    private Double Low;
    private Double Close;
}