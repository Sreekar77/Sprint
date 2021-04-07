package com.bookmymovie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookmymovie.model.ShowInCharge;

@Repository
public interface ShowInChargeDao extends JpaRepository<ShowInCharge, String> {

}
