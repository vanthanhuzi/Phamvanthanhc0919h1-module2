package instanceoF;

import test.main;

import java.util.*;

public class hahaa {
  int a;

  public void setA(int a) {
    this.a = a;
  }

  public int getA() {
    return a;
  }

  public hahaa(int a) {
    super();
    this.a = a;
  }




  public static void main(String[] args) {
    hahaa a = new hahaa(1);
    hahaa b = new hahaa(2);
    hahaa c = new hahaa(4);
    List<hahaa> list = new ArrayList<>();
    list.add(a);
    list.add(b);
    list.add(c);
    list.add(a);
    Collections.sort(list, new Comparator<hahaa>() {
      @Override
      public int compare(hahaa o1, hahaa o2) {
        if (o1.getA() > o2.getA())
          return 1;
        else if (o1.getA() < o2.getA())
          return -1;
        else return 0;
      }
    });

    for (hahaa i : list) {
      System.out.println(i.getA());
    }
  }
  }

