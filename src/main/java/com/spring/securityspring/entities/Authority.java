package com.spring.securityspring.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "authorities")
@Getter
@Setter
//@Data
@NoArgsConstructor
@AllArgsConstructor
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "authorities")
    private Set<User> users;

//don't use @Data if you are using Set instead use @Getter and @Setter or else implement your own equals and hashcode
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Authority authority = (Authority) o;
//        return Objects.equals(id+1000, authority.id) && Objects.equals(name, authority.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id+1000, name);
//    }
}
