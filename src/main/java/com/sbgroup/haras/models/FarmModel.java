package com.sbgroup.haras.models;

import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "Farms")
public class FarmModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID farmId;
    private String name;
    private String address;
    private String city;
    private String state;
    private String country;
    private String cep;
    private Timestamp createdAt;
}