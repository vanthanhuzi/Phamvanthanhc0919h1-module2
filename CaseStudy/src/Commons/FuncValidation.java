package Commons;

import java.util.Scanner;

public class FuncValidation {
    private static Scanner scanner;
    private static String regex = "";

    public static boolean checkValidationFullName(String str) {
        regex = "^[A-Z]{1}[a-z]*(\\s[A-Z]{1}[a-z]*)*";
        return str.matches(regex);
    }

    /*
    nếu a lớn hơn 30 nếu
     */
    public static float checkValidateAreaUseAndPool(String content, String errMes) {
        float area;
        boolean check = true;
        while (check) {
            try {
                System.out.println(content);
                scanner = new Scanner(System.in);
                area = scanner.nextFloat();
                if (area >= 30) {
                    return area;
                } else {
                    System.out.println(errMes);
                    check = true;
                }
            } catch (Exception e) {
                System.out.println(errMes);
                check = true;
            }

        }
        return 0;
    }

    public static float checkValidateRentPay(String content, String errMes) {
        float rentPay;
        boolean check = true;
        while (check) {
            try {
                System.out.println(content);
                scanner = new Scanner(System.in);
                rentPay = scanner.nextFloat();
                if (rentPay > 0) {
                    return rentPay;
                } else {
                    System.out.println(errMes);
                    check = true;
                }
            } catch (Exception e) {
                System.out.println(errMes);
                check = true;
            }

        }
        return 0;

    }

    public static int checkValidateFullPeople(String content, String errMes) {
        int fullPeople;
        boolean check = true;
        while (check) {
            try {
                System.out.println(content);
                scanner = new Scanner(System.in);
                fullPeople = scanner.nextInt();
                if (fullPeople > 0 && fullPeople < 20) {
                    return fullPeople;
                } else {
                    System.out.println(errMes);
                    check = true;
                }
            } catch (Exception e) {
                System.out.println(errMes);
                check = true;
            }

        }
        return 0;

    }

    public static boolean checkValidateFreeService(String freeService) {
        if (freeService.equals("massage") || freeService.equals("karaoke")
                || freeService.equals("food") || freeService.equals("drink") || freeService.equals("car")) {
            return true;
        } else return false;
    }

    public static int checkValidateFloorNumber(String content, String errMes) {
        int floorNumber;
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check) {
            try {
                System.out.println(content);
                floorNumber = scanner.nextInt();
                if (floorNumber > 0) {
                    return floorNumber;
                } else {
                    System.out.println(errMes);
                    check = true;
                }
            } catch (Exception e) {
                System.out.println(errMes);
                check = true;
            }

        }
        return 0;

    }

    public static boolean checkValidateNameCustomer(String name) {

        regex = "^[\\p{Lu}]{1}[\\p{Ll}]*(\\s[\\p{Lu}]{1}[\\p{Ll}]*)*";
        return name.matches(regex);

    }

    public static boolean checkValidationEmail(String email) {
        regex = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
        return email.matches(regex);
    }

    //male Male female unknow
    public static boolean checkValidationGender(String gender) {
        regex = "^[mM][aA][lL][eE]|[fF][eE][mM][aA][lL][eE]|[uU][nN][kK][nN][oO][Ww]$";
        return gender.matches(regex);
    }

    public static String ChuanHoa(String gender) {
        gender = gender.toLowerCase();
        String b = gender.substring(0, 1).toUpperCase() + gender.substring(1, gender.length());
        return b;
    }

    public static boolean checkValidationIdCard(String idCard) {
        regex = "^[100000000-999999999]{9}$";
        return idCard.matches(regex);
    }

    public static boolean checkValidationBirthDay(String birthday) {
        regex = "^([3][0-1]|[0][1-9]|[12][0-9])/([0][1-9]|[1][0-2])/[0-9]{4}";
        return birthday.matches(regex);
    }

    public static int checkNumberPhone() {
        scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter Number Phone");
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Number Phone is invalid ( It's Integer)");
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(checkValidationGender("haha"));
        System.out.println(ChuanHoa("male"));
        System.out.println(checkValidationIdCard("210111111"));

    }
}



