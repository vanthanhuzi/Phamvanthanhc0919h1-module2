package service;

import entity.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class PersonServiceIPM implements  PersonService {
    private static Map<Integer, Person> map = new HashMap<>();
    static {
        map.put(1, new Person(1, "thanh", " quang nam"));
        map.put(2, new Person(2, "thanh", " quang nam"));
        map.put(3, new Person(3, "thanh", " quang nam"));
    }

    @Override
    public List<Person> findAll() {
        return new ArrayList<>(map.values());
    }
}
