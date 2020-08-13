package misc;

// implements Cloneable works as Prototype

public class PrototypeDesignPattern  {

    public static void main(String[] args) throws CloneNotSupportedException {
        Cache cache = new Cache();
        cache.setStudent(new Student());
        Student student = cache.getStudent();
    }
}

class Student implements Cloneable{

    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student)super.clone();
    }

}

class Cache {
    private Student student;

    public Student getStudent() throws CloneNotSupportedException {
        return student.clone();
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
