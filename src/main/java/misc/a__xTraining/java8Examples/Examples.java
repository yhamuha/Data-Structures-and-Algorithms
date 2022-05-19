package misc.a__xTraining.java8Examples;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 */

class Staff {
    private String name;
    private int age;
    private BigDecimal salary;

    public Staff(String name, int age, BigDecimal salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}

class StaffPublic {
    private String name;
    private int age;
    private String extra;

    public StaffPublic() {
    }

    public StaffPublic(String name, int age, String extra) {
        this.name = name;
        this.age = age;
        this.extra = extra;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        return "StaffPublic{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", extra='" + extra + '\'' +
                '}';
    }
}

public class Examples {

    public static void main(String[] args) {
        List<Staff> staff = Arrays.asList (
                new Staff("alex", 20, new BigDecimal(10_000)),
                new Staff("john", 25, new BigDecimal(20_000)),
                new Staff("peter", 20, new BigDecimal(30_000))
        );

//        List<String> result = new ArrayList<>();
//        for (Staff x : staff) {
//            result.add(x.getName());
//        }
//        System.out.println(result);

        // convert StaffPublic to Staff

        List<StaffPublic> result = staff
                .stream()
                .map(temp -> {
                   StaffPublic obj = new StaffPublic();
                   obj.setName(temp.getName());
                   obj.setAge(temp.getAge());
                   if ("alex".equals(temp.getName())) {
                       obj.setExtra("field for alex only!");
                   }
                   return obj;
                }).collect(Collectors.toList());
        System.out.println(result);
    }

}
