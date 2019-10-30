package abc;

import java.io.*;
import java.io.Serializable;

public class Person implements Serializable{
    private static final long serialVersionUID = 1L;
    private   int id;


    public Person() {
    }

    public Person(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person(1);
        File file = new File("demo.txt");
        if(!file.exists()){
            file.createNewFile();
        }
//        FileOutputStream fileOutputStream = new FileOutputStream(file);
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        objectOutputStream.writeObject(person);
//        fileOutputStream.close();
//        objectOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person person1 = (Person) objectInputStream.readObject();
        System.out.println(person1.getId());


    }
}
