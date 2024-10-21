package tn.esprit.foyer4twin6.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer4twin6.entities.Chambre;
import tn.esprit.foyer4twin6.repositories.ChambreRepository;

import java.util.List;


@Service
@AllArgsConstructor
public class ChambreServiceImpl implements IChambreService {

    private final ChambreRepository chrep;

    @Override
    public Chambre addChambre(Chambre chambre) {
        return chrep.save(chambre);
    }

    @Override
    public List<Chambre> listChambres() {
        return chrep.findAll();
    }

    @Override
    public Chambre getChambreById(Long idChambre) {
        return chrep.findById(idChambre).orElse(null);
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chrep.save(chambre);
    }

    @Override
    public void deleteChambre(Long idChambre) {
        chrep.deleteById(idChambre);
    }
}

