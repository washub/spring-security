package com.spring.securityspring.repositories;

import com.spring.securityspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("select u from User u where u.userName= :userName")
//    @Query(value = "select users.uid, user_name, password, a.id, a.name from users inner join user_authorities auth on users.id=auth.user_id inner join authorities a on auth.authority_id=a.id where users.user_name=?1", nativeQuery = true)
    Optional<User> findByUserName(String userName);
}
