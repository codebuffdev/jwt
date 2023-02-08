package in.spdev;

public class TestToken {
    public static void main(String[] args) {
        JwtUtils utils = new JwtUtils();
        String generateToken = utils.generateToken("AASCW3", "jwt", "code");
        System.out.println(generateToken);
    }
}
