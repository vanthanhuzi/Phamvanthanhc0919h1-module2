package opp;

import java.util.ArrayList;
import java.util.List;

public class QuanLy {
    List<CanBo> canBos;
    public QuanLy(){
        canBos = new ArrayList<>();
    }
    public void addCanBo(CanBo canBo){
        canBos.add(canBo);
    }
    public void display(){
        for (CanBo a :canBos) {
            System.out.println(a.toString());
        }
    }
}
