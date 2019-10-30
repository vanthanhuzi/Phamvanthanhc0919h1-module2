package Iterator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Animal> animalList = new ArrayList<Animal>();
        System.out.println("nhập vào số động vật muốn thêm");
        int n = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n; i++) {
            Animal animal1 = new Animal();
            System.out.println("động vật thứ"+ (i+1));
            animal1.addAnimal();
            animalList.add(animal1);
        }
//        for (Animal animal : animalList) {
//            animal.showAnimal();
//        }
        Collections.sort(animalList, new myComparator() );
        for (Animal a :animalList) {
            a.showAnimal();
        }
       Iterator<Animal> animalIterator = animalList.iterator();
       while (animalIterator.hasNext()){
           Animal s = animalIterator.next();
           if(s.getColor().equals("red")) {
              animalIterator.remove();
           }
       }
        for (Animal b :animalList) {
            b.showAnimal();
        }
    }
}
class myComparator implements Comparator<Animal>{

    @Override
    public int compare(Animal o1,Animal o2) {
        return o1.getColor().compareTo(o2.getColor());
    }
}

