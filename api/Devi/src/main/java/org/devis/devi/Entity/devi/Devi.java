package org.devis.devi.Entity.devi;

import jakarta.persistence.*;
import lombok.Data;
import org.devis.devi.Entity.User.User_devi;

import java.sql.Date;
import java.util.List;

@Data
@Entity
public class Devi {
    @Id
    private Long id;
    String name;

    @ManyToMany
    @JoinTable(
            name = "devi_user",
            joinColumns = @JoinColumn(name = "devi_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    List<User_devi> userDevis;

    Date date; 






}
