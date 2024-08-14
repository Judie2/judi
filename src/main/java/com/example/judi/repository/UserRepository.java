package com.example.judi.repository;

import com.example.judi.entity.User;
import com.example.judi.enums.SexeEnum;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;






@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findByNom(String nom);
    List<User> findByAge(int age);
    boolean findByEmail(String email);
    List<User> findBySexe(SexeEnum feminin);
    


}
