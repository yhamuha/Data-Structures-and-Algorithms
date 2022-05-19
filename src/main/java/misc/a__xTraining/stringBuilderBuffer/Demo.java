package misc.a__xTraining.stringBuilderBuffer;

/**
 *
 */
public class Demo {
    public static void main(String[] args) {
        StringBuffer sbuf = new StringBuffer();

        String str = "String";
        StringBuilder sb = new StringBuilder(str);

//        sb.replace(2,3,"*");


        // replace with similar values doing as insert
        // put to n-st position to string from 0
        sb.replace(2,3,"*");
//        sb.append("#");


        // insert to 1th position from 0
//        sb.insert(1,"1");

        System.out.println(sb);

    }
}
