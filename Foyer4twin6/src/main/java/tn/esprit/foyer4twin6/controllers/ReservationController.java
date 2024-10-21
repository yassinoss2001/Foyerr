package tn.esprit.foyer4twin6.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer4twin6.entities.Reservation;
import tn.esprit.foyer4twin6.services.ReservationServiceImpl;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/reservations")  // Base URL for reservation-related operations
public class ReservationController {

    private final ReservationServiceImpl reservationService;

    // Add a new reservation
    @PostMapping
    public ResponseEntity<Reservation> addReservation(@RequestBody Reservation reservation) {
        Reservation newReservation = reservationService.addReservation(reservation);
        return ResponseEntity.ok(newReservation);
    }

    // Get the list of all reservations
    @GetMapping
    public ResponseEntity<List<Reservation>> listReservations() {
        List<Reservation> reservations = reservationService.listReservations();
        return ResponseEntity.ok(reservations);
    }

    // Get a specific reservation by ID
    @GetMapping("/{idReservation}")
    public ResponseEntity<Reservation> getReservationById(@PathVariable String idReservation) {
        Reservation reservation = reservationService.getReservationById(idReservation);
        if (reservation != null) {
            return ResponseEntity.ok(reservation);
        } else {
            return ResponseEntity.notFound().build();  // Return 404 if reservation not found
        }
    }

    // Update a reservation
    @PutMapping("/{idReservation}")
    public ResponseEntity<Reservation> updateReservation(@PathVariable String idReservation, @RequestBody Reservation reservation) {
        reservation.setIdReservation(idReservation);  // Ensure the ID is set
        Reservation updatedReservation = reservationService.updateReservation(reservation);
        return ResponseEntity.ok(updatedReservation);
    }

    // Delete a reservation
    @DeleteMapping("/{idReservation}")
    public ResponseEntity<Void> deleteReservation(@PathVariable String idReservation) {
        reservationService.deleteReservation(idReservation);
        return ResponseEntity.noContent().build();  // Return 204 No Content on successful deletion
    }
}
