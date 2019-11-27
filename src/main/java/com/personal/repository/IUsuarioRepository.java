package com.personal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.personal.entity.Usuario;

@Repository
public interface IUsuarioRepository extends  CrudRepository<Usuario,Integer>{

}
