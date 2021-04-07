package com.bookmymovie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookmymovie.model.Payment;

@Repository
public interface PaymentDao extends JpaRepository<Payment,Integer>{

}
