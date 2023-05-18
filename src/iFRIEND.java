import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class iFRIEND {

    public static String[] idArray = new String[0];
    public static String[] nameArray = new String[0];
    public static String[] phoneNumberArray = new String[0];
    public static String[] companyNameArray = new String[0];
    public static int[] salaryArray = new int[0];
    public static String[] birthdayArray = new String[0];


    public static void main(String[] args) {
        loadHomepage();
    }

    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();
            // Handle any exceptions.
        }
    }

    public static void extendArray() {
        String[] tempidArray = new String[idArray.length + 1];
        String[] tempnameArray = new String[nameArray.length + 1];
        String[] tempphoneNumberArray = new String[phoneNumberArray.length + 1];
        String[] tempcompanyNameArray = new String[companyNameArray.length + 1];
        int[] tempsalaryArray = new int[salaryArray.length + 1];
        String[] tempbirthdayArray = new String[birthdayArray.length + 1];

        for (int i = 0; i < idArray.length; i++) {

            tempidArray[i] = idArray[i];
            tempnameArray[i] = nameArray[i];
            tempphoneNumberArray[i] = phoneNumberArray[i];
            tempcompanyNameArray[i] = companyNameArray[i];
            tempsalaryArray[i] = salaryArray[i];
            tempbirthdayArray[i] = birthdayArray[i];

        }
        idArray = tempidArray;
        nameArray = tempnameArray;
        phoneNumberArray = tempphoneNumberArray;
        companyNameArray = tempcompanyNameArray;
        salaryArray = tempsalaryArray;
        birthdayArray = tempbirthdayArray;
    }

    public static int searchid(String id) {
        for (int i = 0; i < idArray.length; i++) {
            if (idArray[i] == id) {
                return (i);
            }
        }
        return -1;
    }


    public static void loadHomepage() {
        System.out.println("\n");

        System.out.println("           /$$ /$$$$$$$$/$$$$$$$  /$$$$$$ /$$$$$$$$ /$$   /$$ /$$$$$$$         ");
        System.out.println("            |__/| $$____/| $$__  $$|_  $$_/| $$_____/| $$$ | $$| $$__  $$       ");
        System.out.println("             /$$| $$     | $$  \\ $$  | $$  | $$      | $$$$| $$| $$  \\ $$     ");
        System.out.println("            | $$| $$$$$  | $$$$$$$/  | $$  | $$$$$$  | $$ $$ $$| $$  | $$       ");
        System.out.println("            | $$| $$__/  | $$__  $$  | $$  | $$___/  | $$  $$$$| $$  | $$       ");
        System.out.println("            | $$| $$     | $$  \\ $$  | $$  | $$      | $$\\  $$$| $$  | $$     ");
        System.out.println("            | $$| $$     | $$  | $$ /$$$$$$| $$$$$$$$| $$ \\  $$| $$$$$$$/      ");
        System.out.println("            |__/|__/     |__/  |__/|______/|________/|__/  \\__/|_______/       ");
        System.out.println("\n");
        System.out.println("   _____            _             _          ____                       _                                ");
        System.out.println("  / ____|          | |           | |       /  __  \\                    (_)                                       ");
        System.out.println(" | |     ___  _ _  | |_ __ _   __| |_ ___  | |  | |_ _ _  _  __ _ _ _   _ _______ _ __                                                     ");
        System.out.println(" | |    / _ \\| '_ \\| __/ _' |/ __| __/ __| | |  | | '_/'_| |/ _' | '_ \\| |_  / _ \\ ' _|                                                     ");
        System.out.println(" | |___| (_) | | | | || |_| | |__| |_\\__ \\ | |__| | | | |_ | |_| | | | | |/ /  __/ |                                                        ");
        System.out.println("  \\_____\\___/|_| |_|\\__\\__,_|\\___|/__|___/  \\____/|_|  \\_, |\\__,_|_| |_|_/___\\___\\_|                                                                        ");
        System.out.println("                                                        _/ |                                              ");
        System.out.println("                                                       |__/                                                    ");


        System.out.println("============================================================================================");

        System.out.println("\n");
        System.out.println("        [01] ADD Contact");
        System.out.println();
        System.out.println("        [02] UPDATE Contact");
        System.out.println();
        System.out.println("        [03] DELETE Contact");
        System.out.println();
        System.out.println("        [04] SEARCH Contact");
        System.out.println();
        System.out.println("        [05] LIST Contact");
        System.out.println();
        System.out.println("        [06] Exit ");
        System.out.println("\n");
        System.out.print("\t\tEnter an Option to continue ->: ");

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        switch (num) {
            case 1:
                clearConsole();
                addcontact();
                break;
//            case 2:
//                clearConsole();
//                payableTax();
//                break;
//            case 3:
//                clearConsole();
//                incomeTax();
//                break;
//            case 4:
//                clearConsole();
//                ssclTax();
//                break;
//            case 5:
//                clearConsole();
//                leasingPayment();
//                break;
            case 6:
                clearConsole();


        }
    }


    public static void addcontactTitle() {

        System.out.println("+------------------------------------------------------------------------------------------+");
        System.out.println("|                             ADD Contact to the List                                      |");
        System.out.println("+------------------------------------------------------------------------------------------+");
    }

    private static void addcontact() {
        Scanner input = new Scanner(System.in);
        addcontactTitle();

        String name = "";
        String companyName = "";
        int salary = 0;
        String birthday = "";
        String phoneNumber = "";


        String id = "";
        for (int i = idArray.length+1; i < idArray.length+2; i++) {
            id = String.format("C%04d", i);
            System.out.println(" "+id);
        }
        System.out.println(" =======");


        if (searchid(String.valueOf(id)) >= 0) {

            System.out.println(id + " The id already exists");
        } else {
            System.out.print(" Name                :");
            name = input.nextLine();
        }
        while (true) {

            System.out.print(" PhoneNumber         :");
            phoneNumber = input.nextLine();

            if (phoneNumber.startsWith("0") & phoneNumber.length() == 10) {
                System.out.print(" Company Name        :");
                companyName = input.nextLine();
                L1:
                while (true) {
                    System.out.print(" Salary              :");
                    salary = input.nextInt();


                    if (salary > 0) {
                        Scanner input2 = new Scanner(System.in);

                        while (true) {

                            System.out.print(" B'Day(YYYY-MM-DD)'  :");
                            SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-DD");
                            LocalDate currentDate = LocalDate.now();

                            birthday = input2.nextLine();

                            try {
                                LocalDate userDate = LocalDate.parse(birthday);

                                if (userDate.compareTo(currentDate) > 0) {
                                    System.out.println("The date you entered is in the future.");
                                    System.out.print("Do you want to add birthday again (Y/N) :");

                                    String exitoption = input2.nextLine();

                                    if (exitoption.equalsIgnoreCase("Y")) {
                                        clearConsole();
                                        continue;
                                    } else {
                                        exitoption.equalsIgnoreCase("N");
                                        clearConsole();
                                        loadHomepage();
                                    }


                                } else if (userDate.compareTo(currentDate) < 0) {
                                    System.out.println("        Contact has been added successfully...");

                                    extendArray();

                                    idArray[idArray.length - 1] = String.valueOf(id);
                                    System.out.println("id index"+Arrays.toString(idArray));
                                    nameArray[nameArray.length-1]=name;
                                    System.out.println("name index"+Arrays.toString(nameArray));
                                    phoneNumberArray[phoneNumberArray.length-1]=phoneNumber;
                                    System.out.println("ph num index"+Arrays.toString(phoneNumberArray));
                                    companyNameArray[companyNameArray.length-1]=companyName;
                                    System.out.println("c name index"+Arrays.toString(companyNameArray));
                                    salaryArray[salaryArray.length-1]=salary;
                                    System.out.println("salary index"+Arrays.toString(salaryArray));
                                    birthdayArray[birthdayArray.length-1]=birthday;
                                    System.out.println("birthday index"+Arrays.toString(birthdayArray));





                                    System.out.print(" Do you want to add another contact (Y/N) :");

                                    String exitoption = input2.nextLine();

                                    if (exitoption.equalsIgnoreCase("Y")) {
                                        clearConsole();
                                        addcontact();
                                    } else {
                                        exitoption.equalsIgnoreCase("N");
                                        clearConsole();
                                        loadHomepage();
                                    }


                                } else {
                                    System.out.println("  The date you entered is today!");
                                    System.out.print(" Do you want to add birthday again (Y/N) :");

                                    String exitoption = input2.nextLine();

                                    if (exitoption.equalsIgnoreCase("Y")) {
                                        clearConsole();
                                        continue;
                                    } else {
                                        exitoption.equalsIgnoreCase("N");
                                        clearConsole();
                                        loadHomepage();
                                    }
                                }

                            } catch (Exception e) {
                                System.out.println(" Invalid date format. Please try again.");

                            }
                        }


                    } else {
                        System.out.println(" Invalid input....");


                    }

                }


            } else {
                System.out.println(" Invalid phone Number ...");

                System.out.print(" Do you want to add phone number again (Y/N) :");

                String exitoption = input.nextLine();

                if (exitoption.equalsIgnoreCase("Y")) {
                    clearConsole();
                    continue;


                } else {
                    exitoption.equalsIgnoreCase("N");
                    clearConsole();
                    loadHomepage();

                }


            }



        }


    }

}















