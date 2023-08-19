package misc.is.java.iterationAssignment2;

public class HeadsLegs {

    public static void main(String args[])
    {
      int legs = 500;
      int heads = 150;
      int rabbit = 0;
      int chicken = 0;

      if ((legs %2 !=0) || (heads==0) || (heads > legs)) {
          System.out.println("No solution");
      } else {
          rabbit = ((legs - (2 * heads)) / 2);
          chicken = heads - rabbit;
      }
        System.out.println( "Rabbit:" + rabbit + "\n" +
                            "Chicken:" + chicken + "\n");


    }
}
