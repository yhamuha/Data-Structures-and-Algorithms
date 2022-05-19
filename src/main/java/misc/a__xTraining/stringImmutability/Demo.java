package misc.a__xTraining.stringImmutability;

/**
 *
 */
public class Demo {
    public static void main(String[] args) {


//        String s="Sachin";
//        s.concat(" Tendulkar");//concat() method appends the string at the end
//        System.out.println(s);//will print Sachin because strings are immutable objects


//        String s="Sachin";
//        s=s.concat(" Tendulkar");
//        System.out.println(s);

//        String str = "one";
//        String s = str;
//        str = str.concat(" two");
//        System.out.println(str);


//        String s1 = "java";
//        // But if we explicitly assign it to the reference variable,
//        // it will refer to "java rules"
//
//        // we are explicitly assign s1 to "String constant pool" where is "java rules"
//        s1 = s1.concat(" rules");
//
//        System.out.println("s1 refers to " + s1);

        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = new String("Cat").intern();
        System.out.println("s1 == s2 :"+(s1==s2));
        System.out.println("s1 == s3 :"+(s1==s3));

    }


}
