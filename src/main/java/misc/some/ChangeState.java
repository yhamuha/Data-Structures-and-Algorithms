package misc.some;

/**
 *
 */
public class ChangeState {

    public static class Claim {
        public String name;
    }

    public static void main(String[] args) {
        Claim claim = new Claim();
        claim.name = "bug";
        processClaim(claim);
        System.out.println(claim.name);
    }

    // put the value by reference
    private static void processClaim (Claim value) {
        value.name = "task";
    }
}
