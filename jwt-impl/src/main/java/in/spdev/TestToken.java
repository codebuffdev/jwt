package in.spdev;

import io.jsonwebtoken.Claims;

public class TestToken {
    public static void main(String[] args) {
        JwtUtils utils = new JwtUtils();
        //String generateToken = utils.generateToken("AASCW3", "jwt", "code");
        String generatedToken = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJBQVNDVzMiLCJzdWIiOiJqd3QiLCJpc3MiOiJzcERldiIsImlhdCI6MTY5NzA5MjE0MiwiZXhwIjoxNjk3MDkyNzQyfQ.HJ44TdeXytjf7-ZeSpBoWx3kepf9HXqBxcjF5Uy693k";
        System.out.println(generatedToken);
        Claims claims = utils.getClaims("code", generatedToken);
        System.out.println(claims.getId());
        System.out.println(claims.getSubject());
        System.out.println(claims.getExpiration());
    }
}
