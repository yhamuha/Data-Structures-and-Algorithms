package misc.problem_solving;

/**
 *
 */
public class DefangingIPAddress {
    public static void main(String[] args) {
        String address = "192.168.0.5";
        System.out.println(defandingIpAddress(address));
    }

    // O(n), O(n):StringBuffer
    static String defandingIpAddress(String address){
        StringBuffer strBuf = new StringBuffer();
        String defandingStr = "[.]";
        for (char ch: address.toCharArray()) {
            strBuf.append(ch);
            if (ch == '.') {
                strBuf = strBuf.deleteCharAt(strBuf.length()-1);
                strBuf.append(defandingStr);
            }
        }
        return strBuf.toString();
    }
}
