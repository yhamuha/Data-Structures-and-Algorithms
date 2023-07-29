package cs.dynamic;

public class FrogSteps {

    // using global variable
    int pathCount = 0;

    void getPathCount (int n) {
        if (n<0) return;
        if (n == 0) {
            pathCount++;
            return;
        }
        getPathCount(n-2);
        getPathCount(n-1);
    }
}
