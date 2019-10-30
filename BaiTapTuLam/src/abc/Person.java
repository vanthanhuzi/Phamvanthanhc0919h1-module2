package Serializable;

import java.io.*;

public class Person implements Serializable{
    private int id;

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
        if(!file.exists() ){
            file.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(person);
        fileOutputStream.close();
        objectOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person person1 = (Person) objectInputStream.readObject();


    }
}
