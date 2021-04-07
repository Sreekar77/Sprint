package com.bookmymovie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookmymovie.model.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer,String> {

}
