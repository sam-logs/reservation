package com.railway.TrainReservation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.railway.TrainReservation.model.Reservation;

@Repository

public interface ReservationRepository extends JpaRepository<Reservation, String> {

	List<Reservation> deleteByPnr(long pnr);

	List<Reservation> findByPnr(long pnr);

}