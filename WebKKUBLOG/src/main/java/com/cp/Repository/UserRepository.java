package com.cp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cp.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    User findByUsername(String username);
    List<User> findAllByUsername(String username);
    User findById(int userid);
}
