package tn.esprit.foyer4twin6.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyer4twin6.entities.Foyer;


@Repository

public interface FoyerRepository extends JpaRepository<Foyer,Long> {
}
