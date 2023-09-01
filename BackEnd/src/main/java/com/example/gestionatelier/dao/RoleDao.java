package com.example.gestionatelier.dao;

import com.example.gestionatelier.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}
