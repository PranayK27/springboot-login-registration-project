package pranayk27.springbootloginregistrationproject.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pranayk27.springbootloginregistrationproject.springsecurity.model.User;

@Repository
public interface UserRepository extends JpaRepository < User, Long > {
    User findByEmail(String email);
}
