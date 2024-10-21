package tn.esprit.foyer4twin6.entities;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString

@Table(name="FOYER")

public class Foyer  implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long IdFoyer;
    private String nomFoyer;
    private long capaciteFoyer;

    @OneToMany(mappedBy = "F")
    List<Bloc> B ;

    @OneToOne(mappedBy = "F")
    Universite U;
}
