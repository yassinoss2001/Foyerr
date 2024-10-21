package tn.esprit.foyer4twin6.services;

import tn.esprit.foyer4twin6.entities.Bloc;

import java.util.List;

public interface IBlocService {
    public Bloc addBloc(Bloc bloc);           // Create a new Bloc
    public List<Bloc> listBlocs();            // List all Blocs
    public Bloc getBlocById(Long idBloc);     // Get a Bloc by its ID
    public Bloc updateBloc(Bloc bloc);        // Update an existing Bloc
     void deleteBloc(Long idBloc);      // Delete a Bloc by its ID
}
