package tn.esprit.foyer4twin6.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer4twin6.entities.Reservation;
import tn.esprit.foyer4twin6.repositories.ReservationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService {

    private final ReservationRepository reservationRepository;

    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> listReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation getReservationById(String idReservation) {
        return reservationRepository.findById(idReservation).orElse(null);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservation(String idReservation) {
        reservationRepository.deleteById(idReservation);
    }
}
