package in.spdev;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Base64;
import java.util.Date;

import static java.util.concurrent.TimeUnit.MINUTES;

public class JwtUtils {

    //create token
    public String generateToken(String id, String subject, String key) {
        return Jwts.builder()
                .setId(id)
                .setSubject(subject)
                .setIssuer("spDev")
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + MINUTES.toMillis(10)))
                .signWith(SignatureAlgorithm.HS256, Base64.getEncoder().encode(key.getBytes()))
                .compact(); // return jwt in string format
    }

    //read token
    public Claims getClaims(String key, String token) {
        return Jwts.parser()
                .setSigningKey(Base64.getEncoder().encode(key.getBytes()))
                .parseClaimsJws(token)
                .getBody();
    }

    //validate token
}
