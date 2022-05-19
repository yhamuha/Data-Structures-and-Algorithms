package misc.a__xTraining.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 */
public class Main {
    public static void main(String[] args) throws Exception {

        User user = new User();
        user.lifeLevel = 65;

        FileOutputStream fileOutputStream = new FileOutputStream("temp");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("temp");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        User newUser = (User) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(newUser.lifeLevel);

    }
}

// static fields won't serializing
// if class do not implement serializable - NotSerializableException
// transient; transient fields won't use in hashCode
// Object isn't serializable because java has Runtime objects