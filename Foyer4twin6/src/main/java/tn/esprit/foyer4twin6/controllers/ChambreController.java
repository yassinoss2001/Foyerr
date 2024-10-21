package tn.esprit.foyer4twin6.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer4twin6.entities.Chambre;
import tn.esprit.foyer4twin6.services.IChambreService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/chambres")
public class ChambreController {

    IChambreService chambreService;

    // Add a new chambre
    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.addChambre(c);
        return chambre;
    }


    // Get the list of all chambres
    @GetMapping("/retrieve-all-chambres")
    public List<Chambre> getChambres() {
        List<Chambre> listChambres = chambreService.listChambres();
        return listChambres;
    }


    // Get a specific chambre by ID
    @GetMapping("/retrieve-chambre/{idChambre}")
    public Chambre retrieveChambre(@PathVariable("idChambre") Long idChambre) {
        Chambre chambre = chambreService.getChambreById(idChambre);
        return chambre;
    }

    // Update a chambre
    @PutMapping("/modify-chambre")
    public Chambre modifyChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.updateChambre(c);
        return chambre;
    }

    // Delete a chambre
    @DeleteMapping("/remove-chambre/{idChambre}")
    public void removeChambre(@PathVariable("idChambre") Long idChambre) {
        chambreService.deleteChambre(idChambre);
    }


}
