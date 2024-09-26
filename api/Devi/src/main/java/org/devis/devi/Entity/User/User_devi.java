package org.devis.devi.Entity.User;

import jakarta.persistence.*;
import org.devis.devi.Entity.devi.Devi;

import java.util.List;

@Entity
public class User_devi {
    @Id
    Long id;
    String email ;
    String password ;

    @ManyToMany
    @JoinTable(
            name = "user_devi",
            joinColumns = @JoinColumn(name = "use_id"),
            inverseJoinColumns = @JoinColumn(name = "devi_id")
    )
    List<Devi> devi;

}
