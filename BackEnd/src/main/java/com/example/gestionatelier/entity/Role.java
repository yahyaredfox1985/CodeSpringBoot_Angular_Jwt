package com.example.gestionatelier.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
@Data
@AllArgsConstructor
@Entity
public class Role {

    @Id
    private String roleName;
    private String roleDescription;

    public Role() {

    }
}
