package tn.esprit.foyer4twin6.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer4twin6.entities.Foyer;
import tn.esprit.foyer4twin6.repositories.FoyerRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerServiceImpl implements IFoyerService {

    private final FoyerRepository foyerRepository;

    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public List<Foyer> listFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer getFoyerById(Long idFoyer) {
        return foyerRepository.findById(idFoyer).orElse(null);
    }

    @Override
    public Foyer updateFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public void deleteFoyer(Long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }
}
