package com.emccarthy.landon.data.repository;

import java.sql.Date;
import java.util.List;

import com.emccarthy.landon.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    List<Reservation> findByDate(Date date);
}