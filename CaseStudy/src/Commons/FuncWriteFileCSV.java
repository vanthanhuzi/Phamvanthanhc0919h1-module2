package Commons;

import Models.*;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FuncWriteFileCSV {
    private static final char DEFAULT_SEPARATOR = ',';
    private static final char DEFAULT_QUOTE = '"';
    private static final String pathVILLA = "src/Data/Villa.csv";
    private static final int NUM_OF_LINE_SKIP = 1;
    private static final String pathHOUSE = "src/Data/House.csv";
    private static final String pathROOM = "src/Data/Room.csv";
    private static final String pathCustomer = "src/Data/Customer.csv";
    private static final String pathBookingCustomer = "src/Data/Booking.csv";
    /*
   String nameService, float useArea, float rentPay, int fullPeople,
                 String typeRent, String id, String roomStandard, String otherFacilities, float poolArea, int floorNumber
     */
    private static String[] headerRecordVilla = new String[]{"nameService", "useArea", "rentPay", "fullPeople"
            , "typeRent", "id", "roomStandard", "otherFacilities", "poolArea", "floorNumber"};
    private static String[] headerRecordHouse = new String[]{"nameService", "useArea", "rentPay"
            , "fullPeople", "typeRent", "id", "roomStandard", "otherFacilities", "floorNumber"};
    private static String[] headerRecordRoom = new String[]{"nameService", "useArea",
            "rentPay", "fullPeople", "typeRent", "id", "freeService"};
    private static String[] headerCustomer = new String[]{"id", "fullName", "birthDay", "genDer",
            "idCard", "numberPhone", "eMail", "customerType", "address"};
    private static String[] headerBookingService = new String[]{" id ", "fullName",
            " birthDay", "genDer", " idCard", "numberPhone", "eMail", "customerType", "address", "service"};


    /*
     String nameService, float useArea, float rentPay, int fullPeople,
                     String typeRent, String id, String roomStandard, String otherFacilities, float poolArea, int floorNumber
                     */
    public static void writeFileVilla(List<Villa> villaList) {
        try (Writer writer = new FileWriter(pathVILLA);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.DEFAULT_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordHouse);
            for (Villa villa : villaList) {
                csvWriter.writeNext(new String[]{
                        villa.getNameService(), String.valueOf(villa.getUseArea()), String.valueOf(villa.getRentPay()),
                        String.valueOf(villa.getFullPeople()), villa.getTypeRent(),
                        villa.getId(), villa.getRoomStandard(), villa.getOtherFacilities(),
                        String.valueOf(villa.getPoolArea()), String.valueOf(villa.getFloorNumber())

                });
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }


    public static void writeHouse(List<House> houseList) {
        try (Writer writer = new FileWriter(pathHOUSE);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.DEFAULT_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordHouse);
            for (House house : houseList) {
                csvWriter.writeNext(new String[]{
                        house.getNameService(),
                        String.valueOf(house.getUseArea()), String.valueOf(house.getRentPay()),
                        String.valueOf(house.getFullPeople()), house.getTypeRent(), house.getId(),
                        house.getRoomStandard(),
                        house.getOtherFacilities(), String.valueOf(house.getFloorNumber())

                });
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void writeFileRoom(List<Room> room) {
        try (Writer writer = new FileWriter(pathROOM);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.DEFAULT_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordRoom);
            for (Room room1 : room) {
                csvWriter.writeNext(new String[]{
                        room1.getNameService(), String.valueOf(room1.getUseArea()),
                        String.valueOf(room1.getRentPay()), String.valueOf(room1.getFullPeople()),
                        room1.getTypeRent(), room1.getId(), room1.getFreeService()

                });
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static ArrayList<Villa> getVilla() {
        Path path = Paths.get(pathVILLA);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathVILLA);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Villa> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Villa.class);
        strategy.setColumnMapping(headerRecordVilla);
        CsvToBean<Villa> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Villa>(new FileReader(pathVILLA))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return (ArrayList<Villa>) csvToBean.parse();

    }


    public static ArrayList<House> getHouse() {
        Path path = Paths.get(pathHOUSE);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathHOUSE);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        ColumnPositionMappingStrategy<House> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(House.class);
        strategy.setColumnMapping(headerRecordHouse);
        CsvToBean<House> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<House>(new FileReader(pathHOUSE))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return (ArrayList<House>) csvToBean.parse();

    }

    public static ArrayList<Room> getRoom() {
        Path path = Paths.get(pathROOM);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathROOM);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Room> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Room.class);
        strategy.setColumnMapping(headerRecordRoom);
        CsvToBean<Room> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Room>(new FileReader(pathROOM))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return (ArrayList<Room>) csvToBean.parse();

    }

    public static void writeFileCustomer(ArrayList<Customer> customerArrayList) {
        try (Writer writer = new FileWriter(pathCustomer);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.DEFAULT_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerCustomer);
            for (Customer customer : customerArrayList) {
                csvWriter.writeNext(new String[]{
                        customer.getId(),
                        customer.getFullName(), customer.getBirthDay(), customer.getGenDer(), String.valueOf(customer.getIdCard()),
                        String.valueOf(customer.getNumberPhone()),
                        customer.geteMail(), customer.getCustomerType(),
                        customer.getAddress()
                });
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static ArrayList<Customer> getCustomer() {
        Path path = Paths.get(pathCustomer);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathCustomer);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Customer> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Customer.class);
        strategy.setColumnMapping(headerCustomer);
        CsvToBean<Customer> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Customer>(new FileReader(pathCustomer))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return (ArrayList<Customer>) csvToBean.parse();
    }

    public static void writeFileCustomerService(ArrayList<Customer> customerArrayList) {

        try (Writer writer = new FileWriter(pathBookingCustomer);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.DEFAULT_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerBookingService);
            for (Customer customer : customerArrayList) {
                csvWriter.writeNext(new String[]{
                        customer.getId(),
                        customer.getFullName(), customer.getBirthDay(), customer.getGenDer(), String.valueOf(customer.getIdCard()),
                        String.valueOf(customer.getNumberPhone()),
                        customer.geteMail(), customer.getCustomerType(),
                        customer.getAddress(), String.valueOf(customer.getService())
                });
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static ArrayList<Customer> getFileVillaBooking() {
        Path path = Paths.get(pathBookingCustomer);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathBookingCustomer);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Customer> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Customer.class);
        strategy.setColumnMapping(headerBookingService);
        CsvToBean<Customer> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Customer>(new FileReader(pathBookingCustomer))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return (ArrayList<Customer>) csvToBean.parse();
    }

    public static ArrayList<Customer> getFileHouseBooking() {
        Path path = Paths.get(pathBookingCustomer);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathBookingCustomer);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Customer> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Customer.class);
        strategy.setColumnMapping(headerBookingService);
        CsvToBean<Customer> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Customer>(new FileReader(pathBookingCustomer))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return (ArrayList<Customer>) csvToBean.parse();
    }

    public static ArrayList<Customer> getFileRoomBooking() {
        Path path = Paths.get(pathBookingCustomer);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathBookingCustomer);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Customer> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Customer.class);
        strategy.setColumnMapping(headerBookingService);
        CsvToBean<Customer> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Customer>(new FileReader(pathBookingCustomer))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return (ArrayList<Customer>) csvToBean.parse();
    }


}

