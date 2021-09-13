package misc.some;

import java.util.HashSet;

/**
 *
 */
public class HashSetCharacterBoolean {
    public static void main(String[] args) {
        HashSet<Character> hashSet = new HashSet<>();
        hashSet.add('c');
        System.out.println(hashSet.contains('c'));
    }
}
