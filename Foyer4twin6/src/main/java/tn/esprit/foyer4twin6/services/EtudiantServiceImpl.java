package tn.esprit.foyer4twin6.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer4twin6.entities.Etudiant;
import tn.esprit.foyer4twin6.repositories.EtudiantRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService {

    private final EtudiantRepository etudiantRepository;

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public List<Etudiant> listEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant getEtudiantById(Long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).orElse(null);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public void deleteEtudiant(Long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }
}
