package julioapm.demosecurity3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import julioapm.demosecurity3.domain.entities.User;

public interface UserRepository extends JpaRepository<User, String> {
    
    User findUserByEmail(String email);
}
