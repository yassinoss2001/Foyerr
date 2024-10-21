package tn.esprit.foyer4twin6.repositories;

import org.springframework.boot.autoconfigure.jackson.JacksonProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyer4twin6.entities.Chambre;


@Repository
public interface ChambreRepository extends JpaRepository <Chambre,Long> {


}


