package com.learning._22springauth.infra.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.learning._22springauth.entities.UserEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

@Service
public class TokenService {

    @Value("${application.security.secretKey}")
    private String secretKey;

    public String generateToken(UserEntity user) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(this.secretKey);
            String token = JWT.create()
                    .withIssuer("SPRING-TOKEN-SERVICE")
                    .withSubject(user.toString())
                    .withExpiresAt(generateExpirationTime())
                    .sign(algorithm);
            return token;
        }catch (JWTCreationException ex){
            return null;
        }
    }

    public String validateToken(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(this.secretKey);
            return JWT.require(algorithm)
                    .withIssuer("SPRING-TOKEN-SERVICE")
                    .build()
                    .verify(token)
                    .getSubject();
        }catch (JWTCreationException ex){
            return null;
        }
    }

    private Instant generateExpirationTime (){
        return LocalDateTime.now().plusDays(30).toInstant(ZoneOffset.of("-03:00"));
    }
}
