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

@Table(name="BLOC")

public class Bloc implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long IdBloc;
    private String nomBloc;
    private long capaciteBloc;

    @OneToMany(mappedBy = "B")
    List<Chambre> C;

@ManyToOne
    Foyer F;
}
