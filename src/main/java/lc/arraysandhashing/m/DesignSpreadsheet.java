package lc.arraysandhashing.m;

import java.util.HashMap;
import java.util.Map;

public class DesignSpreadsheet {
    // Overall: O(n) O(m)
    private Map<String, Integer> spreadsheet = new HashMap<>();
    public DesignSpreadsheet(int rows) {
        spreadsheet = new HashMap<>();
    }
    // O(1)
    public void setCell(String cell, int value) {
        spreadsheet.put(cell, value);
    }
    // O(1)
    public void resetCell(String cell) {
        spreadsheet.put(cell, 0);
    }
    // O(n)
    public int getValue(String formula) {
        int sum = 0;
        for (String s : formula.substring(1).split("\\+"))
            sum += mapToValue(s);
        return sum;
    }
    private int mapToValue(String s) {
        return Character.isLetter(s.charAt(0)) ? spreadsheet.getOrDefault(s, 0) : Integer.parseInt(s);
    }

    public static void main(String[] args) {
        DesignSpreadsheet spreadsheet = new DesignSpreadsheet(3);
        System.out.println(spreadsheet.getValue("=5+7"));
        spreadsheet.setCell("A1", 10);
        System.out.println(spreadsheet.getValue("=A1+6"));
        spreadsheet.setCell("B2", 15);
        System.out.println(spreadsheet.getValue("=A1+B2"));
        spreadsheet.resetCell("A1");
        System.out.println(spreadsheet.getValue("=A1+B2"));
    }
}
