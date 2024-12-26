package com.CabBooking.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CabBooking {

    @Id
    private int tripid;

    @Column(name = "MobileNumber")
    private Long mobileNumber;

    @Column(name = "PickUpLocation")
    private String pickUpLocation;

    @Column(name = "DropOffLocation")
    private String dropOffLocation;

    @Column(name = "IsCancelled")
    private Boolean isCancelled;

    // Getters and Setters
    public int getTripid() {
        return tripid;
    }

    public void setTripid(int tripid) {
        this.tripid = tripid;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(String pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public String getDropOffLocation() {
        return dropOffLocation;
    }

    public void setDropOffLocation(String dropOffLocation) {
        this.dropOffLocation = dropOffLocation;
    }

    public Boolean getIsCancelled() {
        return isCancelled;
    }

    public void setIsCancelled(Boolean isCancelled) {
        this.isCancelled = isCancelled;
    }

    @Override
    public String toString() {
        return "CabBooking{" +
               "tripid=" + tripid +
               ", mobileNumber=" + mobileNumber +
               ", pickUpLocation='" + pickUpLocation + '\'' +
               ", dropOffLocation='" + dropOffLocation + '\'' +
               ", isCancelled=" + isCancelled +
               '}';
    }

    // Optional: Override equals and hashCode (if necessary for collections)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CabBooking that = (CabBooking) o;
        return tripid == that.tripid;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(tripid);
    }
}
