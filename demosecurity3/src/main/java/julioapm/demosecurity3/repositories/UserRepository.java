package julioapm.demosecurity3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import julioapm.demosecurity3.domain.entities.User;

public interface UserRepository extends JpaRepository<User, String> {
    
    UserDetails findUserByEmail(String email);
}
