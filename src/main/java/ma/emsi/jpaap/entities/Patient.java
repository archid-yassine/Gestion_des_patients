package ma.emsi.jpaap.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // crée entity jpa
    private Long id;
    @Column(length=50)// changer la taille du nom de 225 à 50
    private String nom;
    @Temporal(TemporalType.DATE)// format jours mois année
    private Date dateNaissance;
    private boolean malade;
    private int score;


}
