package com.CabBooking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CabBooking.Entity.CabBooking;
import com.CabBooking.Repo.CabBookingRepo;

@RestController
public class CabBookingController {
    
    @Autowired
    private CabBookingRepo repo;

    // Get all booking details
    @GetMapping("/bookings")
    public List<CabBooking> getAllBookings() {
        return repo.findAll();
    }

    // Get bookings by mobile number
    @GetMapping("/bookings/{mobileNumber}")
    public List<CabBooking> getBookingsByMobileNumber(@PathVariable Long mobileNumber) {
        return repo.findByMobileNumber(mobileNumber);
    }

    // Add a new booking
    @PostMapping("/bookings")
    public CabBooking addBooking(@RequestBody CabBooking cab) {
        return repo.save(cab);
    }

    // Update an existing booking
    @PutMapping("/bookings")
    public CabBooking updateBooking(@RequestBody CabBooking cab) {
        return repo.save(cab);
    }

    // Delete a booking by trip ID
    @DeleteMapping("/bookings/{tripid}")
    public void deleteBooking(@PathVariable int tripid) {
        repo.deleteById(tripid);
    }
}
