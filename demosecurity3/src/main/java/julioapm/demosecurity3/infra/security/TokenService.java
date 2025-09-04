package julioapm.demosecurity3.infra.security;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.springframework.beans.factory.annotation.Value;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;

import julioapm.demosecurity3.domain.entities.User;

public class TokenService {
    
    @Value("${trabalho.soft.aplicado}")
    private String secret;

    public String gerarToken(User user) {
        try{
            Algorithm algorithm = Algorithm.HMAC256(secret);
            String token = JWT.create()
                .withIssuer("demosecurity3")
                .withSubject(user.getEmail())
                .withExpiresAt(genExpirationDate())
                .sign(algorithm);
            return token;
        }catch(JWTCreationException exception){
            throw new RuntimeException("Erro ao gerar token.");
        }
    }

    public String validarToken(String token){
        try{
            Algorithm algorithm = Algorithm.HMAC256(secret);
            return JWT.require(algorithm)
                .withIssuer("demosecurity3")
                .build()
                .verify(token)
                .getSubject();
        }catch(JWTVerificationException exception){
            return null;
        }
    }

    private Instant genExpirationDate(){
        return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-03:00"));
    }
}
