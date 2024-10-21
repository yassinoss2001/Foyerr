package tn.esprit.foyer4twin6.services;

import tn.esprit.foyer4twin6.entities.Reservation;

import java.util.List;

public interface IReservationService {
    public Reservation addReservation(Reservation reservation);
    public List<Reservation> listReservations();
    public Reservation getReservationById(String idReservation);
    public Reservation updateReservation(Reservation reservation);
    void deleteReservation(String idReservation);
}
