package com.sbgroup.haras.models;

import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "Horses")
public class HorseModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID horseId;
    private String name;
    private int animalType;
    private String gender;
    private int coatId;
    private String createdBy;
    private Timestamp createdAt;
    private String updateBy;
    private Timestamp updateAt;
    private String farmId;
}