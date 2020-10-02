package misc;

public class StackImpl {
   // top of the stack pointer
   int STACK_TOP = -1;
   // stack size
   int STACK_SIZE = 3;
   int[] STACK = new int[STACK_SIZE];
   int stackSize = 0;

   // push
   void push(int value) throws Exception {
       if (STACK_TOP == STACK_SIZE - 1)
           throw new Exception("Stack overflow");
       // increase STACK_TOP pointer
       STACK_TOP += 1;
       // add value to current STACK_TOP
       STACK[STACK_TOP] = value;
       stackSize += 1;
   }

   // pop
   int pop() throws Exception {
       if (STACK_TOP == -1)
           throw new Exception("Stack is empty");
       // grab value from STACK_TOP
       int value = STACK[STACK_TOP];
       // decrease STACK_TOP pointer
       STACK_TOP -= 1;
       stackSize -= 1;
       return value;
   }

   // peek
   int peek() throws Exception {
       if (STACK_TOP == -1)
           throw new Exception("Stack is empty");
       return STACK[STACK_TOP];
   }

   // isEmpty
   boolean isEmpty() {
       return STACK_TOP == -1;
   }

   // get size of stack
   int getSize() {
       return stackSize;
   }
}
