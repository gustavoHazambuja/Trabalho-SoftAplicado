package julioapm.demosecurity3.domain.dtos;

import julioapm.demosecurity3.domain.entities.UserRole;

public record AuthenticationDTO(String nome, String email, String senha, UserRole role) {
    
}
