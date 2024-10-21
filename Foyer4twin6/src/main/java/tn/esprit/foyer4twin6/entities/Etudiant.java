package tn.esprit.foyer4twin6.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString

@Table(name="ETUDIANT")
public class Etudiant  implements Serializable {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long idEtudiant;

    private String nomEt;
    private String prenomEt;
    private long cin;
    private String ecole;
    private Date dateNaissance;


    @ManyToMany(mappedBy="E")
    List<Reservation> R;

}



