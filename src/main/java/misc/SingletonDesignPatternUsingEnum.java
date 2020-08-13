package misc;

// two approaches for build Singleton:
// 1) public variable or
// 2) public method

// anti pattern - bad for testing.
// We wouldn't mock singleton class!

// bad by implements Serializable!
// solving:
// private Object readResolve() {
// return singleton;
// }

// java.lang.Runtime is singleton

// multithreading : double check trouble!

// We can call private constructor using Reflection!
// Unreal hole!

// -> General solving this issue with Singletone:
// using Enums

public class SingletonDesignPatternUsingEnum {

    public enum SingletonEnum {
        INSTANCE;
        int value;
        public int getValue() {
            return value;
        }
        public void setValue(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.INSTANCE;
        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());
    }

}
