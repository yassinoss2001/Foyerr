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

@Table(name="CHAMBRE")
public class Chambre implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long idChambre;

    @Column(name="num")
    private long numChambre;

    @Enumerated(value = EnumType.STRING)
    private TypeChambre typeC;

    @OneToMany
    List<Reservation> R;

    @ManyToOne
    Bloc B;

}
