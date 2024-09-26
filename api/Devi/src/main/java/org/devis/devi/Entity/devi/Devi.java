package org.devis.devi.Entity.devi;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Devi {
    @Id
    private Long id;
    String name;
    @ManyToMany
    @JoinTable(
            name = "devi_member",
            joinColumns = @JoinColumn(name = "devi_id"),
            inverseJoinColumns = @JoinColumn(name = "use_id")

            List<User_devi> use


}
