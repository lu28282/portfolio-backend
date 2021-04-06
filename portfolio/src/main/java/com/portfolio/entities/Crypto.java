package com.portfolio.entities;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Crypto extends Asset {
    
    private String abbreviation;
}
