package Controllers;

import Models.Service;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class ManageService {
    List<Service> list;

    public ManageService() {
        this.list = new ArrayList<>();
    }

    public void inputInforService(Service service) {
        list.add(service);
    }

    public void showInformation() {
        for (Service a : list) {
            a.showInfor();
        }
    }
}
