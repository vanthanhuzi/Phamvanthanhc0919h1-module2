package Controllers;

import Commons.FuncValidation;
import Commons.FuncWriteFileCSV;
import Models.*;

import java.util.*;

public class MainController {

    public static void main(String[] args) {


        public static void DisplayMainMenu () {
            System.out.println("Main Menu: ");
            System.out.println("1. Add New Services");
            System.out.println("2. Show Services");
            System.out.println("3. Add New Customer");
            System.out.println("4. Show Information Customer");
            System.out.println("5. Add New Booking Resort");
            System.out.println("6. Show Booking Resort");
            System.out.println("7. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Selected :");
            switch (scanner.nextInt()) {
                case 1:
                    addNewService();
                    break;
                case 2:
                    showService();
                    break;
                case 3:
                    addNewCustomer();
                    DisplayMainMenu();
                    break;
                case 4:
                    showInformationCustomer();
                    DisplayMainMenu();
                    break;
                case 5:
                    addNewBookingResort();
                    DisplayMainMenu();
                    break;
                case 6:
                    showBookingResort();
                    break;
                case 7:
                    System.exit(0);
                    break;

                default:
                    System.out.println("You selected again!!");
                    DisplayMainMenu();
            }


        }
    }
    public static void addNewService() {
        System.out.println("1.Add New Villa" + "\n" + "2. Add New House" + "\n" +
                "3.Add New Room" + "\n" +
                "4. Back to menu" + "\n" + "5. Exit");
        System.out.println("--------------------\n");
        System.out.println("Enter selected add: ");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                addNewVilla();
                addNewService();
                break;
            case 2:
                addNewHouse();
                addNewService();
                break;
            case 3:
                addNewRoom();
                addNewService();
                break;
            case 4:
                DisplayMainMenu();
                break;

            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Your selected is not right!");
                addNewService();
        }

    }

    private static void addNewCustomer() {
        ArrayList<Customer> customerArrayList = FuncWriteFileCSV.getCustomer();
        Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Id: ");
        customer.setId(UUID.randomUUID().toString().replace("-", ""));
        //Full name customer:
        do {
            System.out.println("Enter Full Name ");
            customer.setFullName(scanner.nextLine());
        } while (!FuncValidation.checkValidateNameCustomer(customer.getFullName()));
        //Birthday customer:
        do {
            System.out.println("Enter Birthday (dd/MM/yy) : ");
            customer.setBirthDay(scanner.nextLine());
        } while (!FuncValidation.checkValidationBirthDay(customer.getBirthDay()));
//        Gender customer:
        do {
            System.out.println("Enter gender: ");
            customer.setGenDer(scanner.nextLine());
        } while (!FuncValidation.checkValidationGender(customer.getGenDer()));
        customer.setGenDer(FuncValidation.ChuanHoa(customer.getGenDer()));
        //Id Card
        do {
            System.out.println("Enter Id Card:");
            customer.setIdCard(scanner.nextLine());
        } while (!FuncValidation.checkValidationIdCard(customer.getIdCard()));

        //Number Phone:
        customer.setNumberPhone(FuncValidation.checkNumberPhone());

        //Email customer :
        do {
            System.out.println("Enter email ");
            customer.seteMail(scanner.nextLine());
        } while (!FuncValidation.checkValidationEmail(customer.geteMail()));
        //Customer Type:
        System.out.println("Enter Customer Type");
        customer.setCustomerType(scanner.nextLine());
        //Address customer:
        System.out.println("Enter address customer: ");
        customer.setAddress(scanner.nextLine());
        customerArrayList.add(customer);
        FuncWriteFileCSV.writeFileCustomer(customerArrayList);

    }

    private static void showInformationCustomer() {
        ArrayList<Customer> customerArrayList = FuncWriteFileCSV.getCustomer();
        Collections.sort(customerArrayList, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getFullName().compareTo(o2.getFullName());
            }
        });
        for (Customer customer : customerArrayList) {
            customer.showInformation();
        }

    }

    private static void addService(Service service) {
        Scanner scanner = new Scanner(System.in);
        String content = "";
        String errMes = "";
        System.out.println("1.Name Service: ");
        do {
            service.setNameService(scanner.nextLine());
        } while (!FuncValidation.checkValidationFullName(service.getNameService()));
        //set validate for Use Area:
        System.out.println("2. Use Area");
        content = "Enter Use Area: ";
        errMes = "Use Area is invalid (Use Area is float >=30) You try enter again, please!! ";
        service.setUseArea(FuncValidation.checkValidateAreaUseAndPool(content, errMes));
        System.out.println("3. Rent Pay");
        // set validate for rent pay
        content = "Enter Rent Pay ";
        errMes = "Rent Pay is invalid (Rent Pay is float > 0) You try enter again, please!!";
        service.setRentPay(FuncValidation.checkValidateRentPay(content, errMes));
        //set validate for full people:
        System.out.println("4. Full People");
        content = "Enter Full People: ";
        errMes = "Full people is invalid ( full people is Integer and >0 && < 20) You try enter again, please!!";
        service.setFullPeople(FuncValidation.checkValidateFullPeople(content, errMes));
        //set validate for Type Rent
        System.out.println("5. Type Rent");
        do {
            service.setTypeRent(scanner.nextLine());
        } while (!FuncValidation.checkValidationFullName(service.getTypeRent()));
        System.out.println("6. Id");
        service.setId(UUID.randomUUID().toString().replace("-", ""));
    }

    private static void addNewVilla() {
        Service villa = new Villa();
        ArrayList<Villa> arrayList = FuncWriteFileCSV.getVilla();
        addService(villa);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Room Standard: ");
        do {
            ((Villa) villa).setRoomStandard(scanner.nextLine());
        } while (!FuncValidation.checkValidationFullName(((Villa) villa).getRoomStandard()));
        System.out.println("Other Facilities: ");
        ((Villa) villa).setOtherFacilities(scanner.nextLine());
        System.out.println("Pool Area");
        ((Villa) villa).setPoolArea(Integer.parseInt(scanner.nextLine()));
        //set validate for Floor number
        System.out.println("Floor Number");
        String content = "Enter Floor Number: ";
        String errMes = "Floor Number is invalid(Floor Number is Integer > 0) You try enter again, please!!";
        ((Villa) villa).setFloorNumber(FuncValidation.checkValidateFloorNumber(content, errMes));
        arrayList.add((Villa) villa);
        FuncWriteFileCSV.writeFileVilla((arrayList));

    }

    private static void addNewHouse() {
        Service house = new House();
        ArrayList<House> houseArrayList = FuncWriteFileCSV.getHouse();
        addService(house);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Room Standard: ");
        do {
            ((House) house).setRoomStandard(scanner.nextLine());
        } while (!FuncValidation.checkValidationFullName(((House) house).getRoomStandard()));
        System.out.println("Other Facilities: ");
        ((House) house).setOtherFacilities(scanner.nextLine());
        System.out.println("Floor Number");
        ((House) house).setFloorNumber(Integer.parseInt(scanner.nextLine()));
        houseArrayList.add((House) house);
        FuncWriteFileCSV.writeHouse(houseArrayList);
    }

    private static void addNewRoom() {
        Service room = new Room();
        ArrayList<Room> roomArrayList = FuncWriteFileCSV.getRoom();
        addService(room);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Free Service");
        do {
            ((Room) room).setFreeService(scanner.nextLine());
        } while (!FuncValidation.checkValidateFreeService(((Room) room).getFreeService()));
        roomArrayList.add((Room) room);
        FuncWriteFileCSV.writeFileRoom(roomArrayList);
    }


    private static void showService() {
        System.out.println("1. Show service Villa " + "\n" + "2. Show service House "
                + "\n" + "3. Show service Room" + "\n" + "4. Back Menu" + "\n" + "5. Exit" + "\n-----------------");
        System.out.println("Enter selected : ");
        Scanner scanner = new Scanner(System.in);

        switch (scanner.nextInt()) {
            case 1:
                showVilla();
                showService();
                break;
            case 2:
                showHouse();
                showService();
                break;
            case 3:
                showRoom();
                showService();
                break;

            case 4:
                DisplayMainMenu();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Your selected not right!!");
                showService();
        }
    }

    private static void showVilla() {
        ArrayList<Villa> arrayList = FuncWriteFileCSV.getVilla();
        for (Villa villa : arrayList) {
            villa.showInfor();
            System.out.println("--------------");
        }
    }

    private static void showHouse() {
        ArrayList<House> arrayList = FuncWriteFileCSV.getHouse();
        for (House house : arrayList) {
            house.showInfor();
            System.out.println("--------------");
        }
    }

    private static void showRoom() {
        ArrayList<Room> arrayList = FuncWriteFileCSV.getRoom();
        for (Room room : arrayList) {
            room.showInfor();
            System.out.println("--------------");
        }
    }

    private static void addNewBookingResort() {
        ArrayList<Customer> customerArrayList = FuncWriteFileCSV.getCustomer();
        Collections.sort(customerArrayList, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getFullName().compareTo(o2.getFullName());
            }
        });

        for (int i = 0; i < customerArrayList.size(); i++) {
            System.out.println("No" + (i + 1) + "\n" + "---------------------");
            customerArrayList.get(i).showInformation();
        }

        System.out.println("Choose customer you want booking! ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        Customer customer = customerArrayList.get(i - 1);

        System.out.println("1. Booking Villa\n" + "2. Booking House\n" + "3. Booking Room\n" + "4. Back Menu");
        int chooseService = scanner.nextInt();
        switch (chooseService) {
            case 1:
                ArrayList<Villa> villas = FuncWriteFileCSV.getVilla();
                for (Villa villa : villas) {
                    villa.showInfor();
                }
                System.out.println("Enter Villa You Want Booking");
                int typeVilla = scanner.nextInt();
                customer.setService(villas.get(typeVilla - 1));
                ArrayList<Customer> customerArrayList1 = FuncWriteFileCSV.getFileVillaBooking();
                customerArrayList1.add(customer);
                FuncWriteFileCSV.writeFileCustomerService(customerArrayList1);
                break;
            case 2:
                ArrayList<House> houses = FuncWriteFileCSV.getHouse();
                for (House house : houses) {
                    house.showInfor();
                }
                System.out.println("Enter House You Want Booking");
                int typeHouse = scanner.nextInt();
                customer.setService(houses.get(typeHouse - 1));
                ArrayList<Customer> customerArrayList2 = FuncWriteFileCSV.getFileHouseBooking();
                customerArrayList2.add(customer);
                FuncWriteFileCSV.writeFileCustomerService(customerArrayList2);
                break;

            case 3:
                ArrayList<Room> rooms = FuncWriteFileCSV.getRoom();
                for (Room room : rooms) {
                    room.showInfor();
                }
                System.out.println("Enter Room You Want Booking");
                int typeRoom = scanner.nextInt();
                customer.setService(rooms.get(typeRoom - 1));
                ArrayList<Customer> customerArrayList3 = FuncWriteFileCSV.getFileRoomBooking();
                customerArrayList3.add(customer);
                FuncWriteFileCSV.writeFileCustomerService(customerArrayList3);
                break;
            case 4:
                DisplayMainMenu();
                break;
            default:
                System.out.println("Your selection not right, Try again please!!");
                addNewBookingResort();

        }


    }

    private static void showBookingResort() {
        System.out.println("1. Show Booking Villa\n" + "2. Show Booking House\n" + "Show Booking Room\n" + "4. Back Menu");
        System.out.println("Enter select");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                ArrayList<Customer> customerArrayList = FuncWriteFileCSV.getFileVillaBooking();
                for (Customer customer : customerArrayList) {
                    customer.showInforFull();
                }
                break;
            default:


        }
    }


}



