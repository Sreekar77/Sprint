package com.bookmymovie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookmymovie.model.Administrator;

@Repository 
public interface AdministratorDao extends JpaRepository <Administrator,Integer> {

}