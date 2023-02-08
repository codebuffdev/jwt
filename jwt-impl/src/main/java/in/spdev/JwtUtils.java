package in.spdev;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

import static java.util.concurrent.TimeUnit.MINUTES;

public class JwtUtils {
    //create token
    public String generateToken(String id, String subject, String key) {
        return Jwts.builder().setId(id).setSubject(subject).setIssuer("spDev").setIssuedAt(new Date(System.currentTimeMillis())).setExpiration(new Date(System.currentTimeMillis() + MINUTES.toMillis(10))).signWith(SignatureAlgorithm.HS256, Base64.encode(key.getBytes())).compact();
    }

    //read token
    public Claims getClaims(String key, String token) {
        return Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody();

    }

    //validate token

}
