package Controllers;

import Models.House;
import Models.Room;
import Models.Villa;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.Writer;
import java.util.List;

public class FuncWriteFileCSV {
    //    private static final char DEFAULT_SEPARATOR = ',';
//    private static final char DEFAULT_QUOTE = '"';
    private static final String pathVILLA = "src/Data/Villa.csv";
    private static String[] headerRecordVilla = new String[]{"nameService", "useArea", "rentPay"
            , "fullPeople", "typeRent", "id", "roomStandard", "otherFacilities", "poolArea", "floorNumber"};

    public static void writeFileVilla(List<Villa> arrayList) {
        try (Writer writer = new FileWriter(pathVILLA);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.DEFAULT_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordVilla);
            for (Villa villa : arrayList) {
                csvWriter.writeNext(new String[]{
                        villa.getNameService(),
                        String.valueOf(villa.getUseArea()), String.valueOf(villa.getRentPay()),
                        String.valueOf(villa.getFullPeople()), villa.getTypeRent(), villa.getId(),
                        villa.getRoomStandard(), villa.getOtherFacilities(),
                        String.valueOf(villa.getPoolArea()), String.valueOf(villa.getFloorNumber())

                });
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    private static final String pathHOUSE = "src/Data/House.csv";
    private static String[] headerRecordHouse = new String[]{"nameService",  "useArea",  "rentPay"
            ,  "fullPeople",  "typeRent",  "id",  "roomStandard",  "otherFacilities",  "floorNumber"};
    public static void writeHouse(List<House> houseList){
        try (Writer writer = new FileWriter(pathHOUSE);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.DEFAULT_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordVilla);
            for (House house : houseList) {
                csvWriter.writeNext(new String[]{
                       house.getNameService(),
                        String.valueOf(house.getUseArea()), String.valueOf(house.getRentPay()),
                        String.valueOf(house.getFullPeople()), house.getTypeRent(),house.getId(),
                        house.getRoomStandard(),
                        house.getOtherFacilities(), String.valueOf(house.getFloorNumber())

                });
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
    private static final String pathROOM = "src/Data/Room.csv";
    private static String[] headerRecordRoom = new String[]{ "nameService",  "useArea",
     "rentPay",  "fullPeople",  "typeRent",  "id",  "freeService"};
    public static void writeFileRoom(List<Room> room){
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
}
