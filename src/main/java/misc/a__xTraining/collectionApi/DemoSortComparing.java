package misc.a__xTraining.collectionApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 */
public class DemoSortComparing {
    public static void main(String[] args) {
        // list + Collection.sort
        /*ArrayList<String> al=new ArrayList<String>();
        al.add("Viru");
        al.add("Saurav");
        al.add("Mukesh");
        al.add("Tahir");

        Collections.sort(al);

        Collections.sort(al,Collections.reverseOrder());
        System.out.println(al);*/

        // class + comparator
        /*ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student("Viru"));
        al.add(new Student("Saurav"));
        al.add(new Student("Mukesh"));
        al.add(new Student("Tahir"));

        Collections.sort(al);
        System.out.println(al);*/

        // class + comparator by ASC
        /*ArrayList<Student2> ar = new ArrayList<Student2>();
        ar.add(new Student2(111, "bbbb", "london"));
        ar.add(new Student2(131, "aaaa", "nyc"));
        ar.add(new Student2(121, "cccc", "jaipur"));

        System.out.println("Unsorted");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new Sortbyroll());

        System.out.println("\nSorted by rollno");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));*/

        //

    }
}

class Student implements Comparable<Student> {
    public String name;
    public Student(String name) {
        this.name = name;
    }
    public int compareTo(Student person) {
        return name.compareTo(person.name);

    }

    @Override
    public String toString() {
        return name;
    }
}

class Student2
{
    int rollno;
    String name, address;

    // Constructor
    public Student2(int rollno, String name,
                   String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Used to print student details in main()
    public String toString()
    {
        return this.rollno + " " + this.name +
                " " + this.address;
    }
}

class Sortbyroll implements Comparator<Student2>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(Student2 a, Student2 b)
    {
        return a.rollno - b.rollno;
    }
}
