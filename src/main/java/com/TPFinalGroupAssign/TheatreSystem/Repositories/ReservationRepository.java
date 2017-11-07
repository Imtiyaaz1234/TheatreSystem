package com.TPFinalGroupAssign.TheatreSystem.Repositories;


import com.TPFinalGroupAssign.TheatreSystem.Domain.Reservation;

import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {

}
