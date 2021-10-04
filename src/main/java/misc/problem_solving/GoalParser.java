package misc.problem_solving;

/**
 *
 */
public class GoalParser {
    public static void main(String[] args) {
        String command = "G()(al)";
        System.out.println(interpret3(command));
    }

    // without complexity info
    static String interpret(String command) {
        return command.replace("()", "").replace("(al)", "al");
    }

    // String replace solution
    static String interpret2(String command) {

        String s = command.replace("()","o");
        return s.replace("(al)","al");
    }

    // String Builder solution
    static String interpret3(String command) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G'){
                str.append("G");
            }else if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                str.append("o");
                i++;
            }else if(command.charAt(i)=='(' && command.charAt(i+1) !=')'){
                str.append("al");
                i +=3;
            }
        }
        return str.toString();
    }
}
