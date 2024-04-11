package ch.noseryoung.loimb.domains.roles;

import ch.noseryoung.loimb.domains.authority.Authorities;
import ch.noseryoung.loimb.domains.user.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.JoinColumn;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "roles")
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "roles_id")
    private Long id;

    @Column(name = "roles_name")
    private String name;

    @JoinTable(name = "roles_authorities", joinColumns = @JoinColumn(name = "roles_id"), inverseJoinColumns = @JoinColumn(name = "authorities_id"))
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Authorities> authorities;

    @OneToMany(mappedBy = "role")
    private Set<User> users;
}