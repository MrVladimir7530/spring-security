package com.example.springsecurity.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
public class Roles {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    private String name;

}
