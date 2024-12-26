package com.CabBooking.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CabBooking.Entity.CabBooking;

@Repository
public interface CabBookingRepo extends JpaRepository<CabBooking, Integer> {

	List<CabBooking> findByMobileNumber(Long mobileNumber);

}
