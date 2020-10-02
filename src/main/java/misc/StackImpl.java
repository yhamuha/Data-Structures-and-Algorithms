package misc;

public class StackImpl {
   // top of the stack pointer
   int STACK_TOP = -1;
   // stack size
   int STACK_SIZE = 3;
   int[] STACK = new int[STACK_SIZE];

   // push
   void push(int value) throws Exception {
       if (STACK_TOP == STACK_SIZE - 1)
           throw new Exception("Stack overflow");
       STACK_TOP += 1;
       STACK[STACK_TOP] = value;
   }
}
