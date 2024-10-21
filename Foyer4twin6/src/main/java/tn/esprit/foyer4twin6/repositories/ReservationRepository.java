package tn.esprit.foyer4twin6.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyer4twin6.entities.Reservation;


@Repository

public interface ReservationRepository extends JpaRepository<Reservation, String> {
}
