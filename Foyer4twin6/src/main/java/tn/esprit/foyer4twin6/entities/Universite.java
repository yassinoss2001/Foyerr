package tn.esprit.foyer4twin6.entities;


import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString

@Table(name="UNI")
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long idUniversite;
    private String nomUniversite;
    private String adresse;

    @OneToOne
    Foyer F;
}
