package cs.hash;

public class Hash {


    int hashCode (String str) {
        int hash = 0;
        int letterCode = 97;
        for (int i =0; i<str.length(); i++) {
            hash = 31 * hash + letterCode;
        }
        return hash;
    }
}
