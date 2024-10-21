package tn.esprit.foyer4twin6.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer4twin6.entities.Bloc;
import tn.esprit.foyer4twin6.repositories.BlocRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class BlocServiceImpl implements IBlocService {

    private final BlocRepository blocRepository;

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public List<Bloc> listBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc getBlocById(Long idBloc) {
        return blocRepository.findById(idBloc).orElse(null);
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public void deleteBloc(Long idBloc) {
        blocRepository.deleteById(idBloc);
    }
}
