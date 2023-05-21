
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

import static java.lang.System.exit;

public class iFRIEND {


    public static String[] idArray =new String[0];
    public static String[] nameArray =new String[0];
    public static String[] phoneNumberArray =new String[0];
    public static String[] companyNameArray =new String[0];
    public static double[] salaryArray =new double[0];
    public static String[] birthdayArray =new String[0];


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

        }
    }

    public static void extendArray() {
        String[] tempidArray = new String[idArray.length + 1];
        String[] tempnameArray = new String[nameArray.length + 1];
        String[] tempphoneNumberArray = new String[phoneNumberArray.length + 1];
        String[] tempcompanyNameArray = new String[companyNameArray.length + 1];
        double[] tempsalaryArray = new double [salaryArray.length + 1];
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
            if (idArray[i].equals(id)) {
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
        System.out.println("   _____            _             _          ____                       _                       ");
        System.out.println("  / ____|          | |           | |       /  __  \\                    (_)                     ");
        System.out.println(" | |     ___  _ _  | |_ __ _   __| |_ ___  | |  | |_ _ _  _  __ _ _ _   _ _______ _ __          ");
        System.out.println(" | |    / _ \\| '_ \\| __/ _' |/ __| __/ __| | |  | | '_/'_| |/ _' | '_ \\| |_  / _ \\ ' _|     ");
        System.out.println(" | |___| (_) | | | | || |_| | |__| |_\\__ \\ | |__| | | | |_ | |_| | | | | |/ /  __/ |          ");
        System.out.println("  \\_____\\___/|_| |_|\\__\\__,_|\\___|/__|___/  \\____/|_|  \\_, |\\__,_|_| |_|_/___\\___\\_|  ");
        System.out.println("                                                        _/ |                                    ");
        System.out.println("                                                       |__/                                     ");


        System.out.println("==============================================================================================");

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
        System.out.print(" Enter an Option to continue ->: ");

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        switch (num) {
            case 1:
                clearConsole();
                addcontact();
                break;
            case 2:
                clearConsole();
                updateContact();
                break;
            case 3:
                clearConsole();
                deleteContact();
                break;
            case 4:
                clearConsole();
                searchContact();
                break;
            case 5:
                clearConsole();
                sortContact();
                break;
            case 6:
                exit(0);
            default:
                System.out.println("invalid Input , input valid option ");
                loadHomepage();


        }
    }

    public static void addcontactTitle() {

        System.out.println("+------------------------------------------------------------------------------------------+");
        System.out.println("|                             ADD Contact to the List                                      |");
        System.out.println("+------------------------------------------------------------------------------------------+");
    }

    public static void addcontact() {
        Scanner input = new Scanner(System.in);
        addcontactTitle();

        System.out.println();

        String name = "";
        String companyName = "";
        double salary = 0;
        String birthday = "";
        String phoneNumber = "";

        String id = "";
        for (int i = idArray.length+1; i < idArray.length+2; i++) {
            id = String.format("C%04d", i);
            System.out.println(" "+id);
        }
        System.out.println(" =======");
        System.out.println();

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
                    salary = input.nextDouble();

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
                                    System.out.println();
                                    System.out.println("         Invalid Birthday....");
                                    System.out.println();
                                    System.out.print(" Do you want to add birthday again (Y/N) :");

                                    String exitoption = input2.nextLine();

                                    if (exitoption.equalsIgnoreCase("Y")) {
                                        // Move the cursor up five lines
                                        System.out.print("\033[5A");
                                        // Clear the lines
                                        System.out.print("\033[0J");
                                    } else {
                                        exitoption.equalsIgnoreCase("N");
                                        clearConsole();
                                        loadHomepage();
                                    }

                                } else if (userDate.compareTo(currentDate) < 0) {
                                    System.out.println();
                                    System.out.println("        Contact has been added successfully...");

                                    extendArray();

                                    idArray[idArray.length - 1] = String.valueOf(id);
                                    nameArray[nameArray.length-1]=name;
                                    phoneNumberArray[phoneNumberArray.length-1]=phoneNumber;
                                    companyNameArray[companyNameArray.length-1]=companyName;
                                    salaryArray[salaryArray.length-1]=salary;
                                    birthdayArray[birthdayArray.length-1]=birthday;


                                    System.out.println();

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
                                    System.out.println();
                                    System.out.println("         Invalid Birthday....");
                                    System.out.println();
                                    System.out.print(" Do you want to add birthday again (Y/N) :");

                                    String exitoption = input2.nextLine();

                                    if (exitoption.equalsIgnoreCase("Y")) {
                                        // Move the cursor up five lines
                                        System.out.print("\033[5A");
                                        // Clear the lines
                                        System.out.print("\033[0J");
                                    } else {
                                        exitoption.equalsIgnoreCase("N");
                                        clearConsole();
                                        loadHomepage();
                                    }
                                }

                            } catch (Exception e) {
                                System.out.println();
                                System.out.println("     Invalid date format....");
                                System.out.println();
                                System.out.print(" Do you want to add birthday again (Y/N) :");

                                String exitoption = input2.nextLine();

                                if (exitoption.equalsIgnoreCase("Y")) {
                                    // Move the cursor up five lines
                                    System.out.print("\033[5A");
                                    // Clear the lines
                                    System.out.print("\033[0J");
                                } else {
                                    exitoption.equalsIgnoreCase("N");
                                    clearConsole();
                                    loadHomepage();
                                }

                            }
                        }

                    } else {
                        Scanner input2 = new Scanner(System.in);
                        System.out.println();
                        System.out.println("         Invalid input....");
                        System.out.println();

                        System.out.print(" Do you want to add salary again (Y/N) :");

                        String exitoption2 = input2.nextLine();

                        if (exitoption2.equalsIgnoreCase("Y")) {
                            // Move the cursor up five lines
                              System.out.print("\033[5A");
                            // Clear the lines
                            System.out.print("\033[0J");

                        } else {
                            exitoption2.equalsIgnoreCase("N");
                            clearConsole();
                            loadHomepage();
                        }

                    }
                }

            } else {
                System.out.println();
                System.out.println("       Invalid phone Number ...");
                System.out.println();

                System.out.print(" Do you want to add phone number again (Y/N) :");

                String exitoption = input.nextLine();

                if (exitoption.equalsIgnoreCase("Y")) {
                    // Move the cursor up five lines
                    System.out.print("\033[5A");
                    // Clear the lines
                    System.out.print("\033[0J");

                } else {
                    exitoption.equalsIgnoreCase("N");
                    clearConsole();
                    loadHomepage();
                }

            }

        }

    }

    public static void updateContactTitle() {
        System.out.println("+------------------------------------------------------------------------------------------+");
        System.out.println("|                                   Update Contact                                         |");
        System.out.println("+------------------------------------------------------------------------------------------+");

    }

    public static void updateContact() {

        updateContactTitle();

        while (true){
            System.out.println();
            System.out.print(" Search Contact by Name or Phone Number -");

            Scanner input = new Scanner(System.in);
            String searchContact = input.nextLine();
            System.out.println();

            int index1 = searchName(searchContact);

            int index2 = searchPhoneNumber(searchContact);


            int max = 0;


            if (index1 >= 0 || index2 >= 0) {

                if (index1 > max) {
                    max = index1;
                }
                if (index2 > max) {
                    max = index2;
                }

                System.out.println("   Contact ID       :" + idArray[max]);
                System.out.println("   Name             :" + nameArray[max]);
                System.out.println("   Phone Number     :" + phoneNumberArray[max]);
                System.out.println("   Company Name     :" + companyNameArray[max]);
                System.out.printf("   Salary           :" +"%.2f", salaryArray[max]);
                System.out.println();
                System.out.println("   B'Day(YYYY-MM-DD):" + birthdayArray[max]);

            System.out.println("\n");

            System.out.println(" What do you want to update ....");
            System.out.println();
            System.out.println("           [01] Name        ");
            System.out.println("           [02] Phone Number");
            System.out.println("           [03] Company Name");
            System.out.println("           [04] Salary");
            System.out.println();
            System.out.print("Enter an option to continue ->");

            int num = input.nextInt();

            // Move the cursor up five lines
            System.out.print("\033[8A");
            // Clear the lines
            System.out.print("\033[0J");

            while (true) {

                if (num == 1) {
                    System.out.println("\n");
                    System.out.println(" Update Name");
                    System.out.println(" ===================");
                    System.out.println();
                    System.out.print(" Input new Name -");

                    Scanner input2 = new Scanner(System.in);

                    String newName = input2.nextLine();

                    nameArray[max] = newName;

                    System.out.println();

                    System.out.println("      Contact has been update successfully..");
                    System.out.println();

                    System.out.print(" Do you want to update another contact (Y/N) :");

                    String exitoption1 = input2.nextLine();

                    if (exitoption1.equalsIgnoreCase("Y")) {
                        clearConsole();
                        updateContact();
                    } else {
                        exitoption1.equalsIgnoreCase("N");
                        clearConsole();
                        loadHomepage();
                    }
                } else if (num == 2) {

                    System.out.println("\n");
                    System.out.println(" Update Phone Number");
                    System.out.println(" =====================");
                    System.out.println();
                    System.out.print(" Input new Phone Number -");

                    Scanner input2 = new Scanner(System.in);

                    String newPhoneNumber = input2.nextLine();

                    phoneNumberArray[max] = newPhoneNumber;

                    System.out.println();

                    System.out.println("         Contact has been update successfully..");
                    System.out.println();

                    System.out.print(" Do you want to update another contact (Y/N) :");

                    String exitoption1 = input2.nextLine();

                    if (exitoption1.equalsIgnoreCase("Y")) {
                        clearConsole();
                        updateContact();
                    } else {
                        exitoption1.equalsIgnoreCase("N");
                        clearConsole();
                        loadHomepage();
                    }
                } else if (num == 3) {

                    System.out.println("\n");
                    System.out.println(" Update Company name");
                    System.out.println(" =====================");
                    System.out.println();
                    System.out.print(" Input new Company Name -");

                    Scanner input2 = new Scanner(System.in);

                    String newCompanyName = input2.nextLine();

                    companyNameArray[max] = newCompanyName;

                    System.out.println();

                    System.out.println("      Contact has been update successfully..");
                    System.out.println();

                    System.out.print(" Do you want to update another contact (Y/N) :");

                    String exitoption1 = input2.nextLine();

                    if (exitoption1.equalsIgnoreCase("Y")) {
                        clearConsole();
                        updateContact();
                    } else {
                        exitoption1.equalsIgnoreCase("N");
                        clearConsole();
                        loadHomepage();
                    }
                } else if (num == 4) {

                    System.out.println("\n");
                    System.out.println(" Update Salary");
                    System.out.println(" =====================");
                    System.out.println();
                    System.out.print(" Input New Salary -");

                    Scanner input2 = new Scanner(System.in);

                    int newSalary = input2.nextInt();

                    salaryArray[max] = newSalary;


                    System.out.println();

                    System.out.println("     Contact has been update successfully..");

                    System.out.println();

                    System.out.print(" Do you want to update another contact (Y/N) :");

                    input2.nextLine();

                    String exitoption1 = input2.nextLine();

                    if (exitoption1.equalsIgnoreCase("Y")) {
                        clearConsole();
                        updateContact();
                    } else {
                        exitoption1.equalsIgnoreCase("N");
                        clearConsole();
                        loadHomepage();
                    }

                }
            }

            }else {
                System.out.println();
                System.out.println("       Invalid Name or Phone number...");
                System.out.println();

                System.out.print(" Do you want to Search contact again (Y/N) :");

                String exitoption = input.nextLine();

                if (exitoption.equalsIgnoreCase("Y")) {
                    // Move the cursor up five lines
                    System.out.print("\033[7A");
                    // Clear the lines
                    System.out.print("\033[0J");

                } else {
                    exitoption.equalsIgnoreCase("N");
                    clearConsole();
                    loadHomepage();
                }

            }
        }
    }

    private static void deleteContactTitle() {
        System.out.println("+------------------------------------------------------------------------------------------+");
        System.out.println("|                                   Delete Contact                                         |");
        System.out.println("+------------------------------------------------------------------------------------------+");

    }

    public static void deleteContact() {

        deleteContactTitle();

        while (true) {
            System.out.println();
            System.out.print(" Search Contact by Name or Phone Number -");
            Scanner input = new Scanner(System.in);
            String searchContact = input.nextLine();

            int index1 = searchName(searchContact);

            int index2 = searchPhoneNumber(searchContact);

            System.out.println();


            int max = 0;


            if (index1 >= 0 || index2 >= 0) {

                if (index1 > max) {
                    max = index1;
                }
                if (index2 > max) {
                    max = index2;
                }

                System.out.println("   Contact ID       :" + idArray[max]);
                System.out.println("   Name             :" + nameArray[max]);
                System.out.println("   Phone Number     :" + phoneNumberArray[max]);
                System.out.println("   Company Name     :" + companyNameArray[max]);
                System.out.printf("   Salary           :" +"%.2f", salaryArray[max]);
                System.out.println();
                System.out.println("   B'Day(YYYY-MM-DD):" + birthdayArray[max]);

                System.out.println();


                System.out.print(" Do you want to delete this contact (Y/N) :");


                String exitoption1 = input.nextLine();

                if (exitoption1.equalsIgnoreCase("Y")) {

                    int size = idArray.length;
                    for (int i = max; i < size - 1; i++) {
                        idArray[i] = idArray[i + 1];
                        nameArray[i] = nameArray[i + 1];
                        phoneNumberArray[i] = phoneNumberArray[i + 1];
                        companyNameArray[i] = companyNameArray[i + 1];
                        salaryArray[i] = salaryArray[i + 1];
                        birthdayArray[i] = birthdayArray[i + 1];

                    }
                    String[] tempidArray = new String[size - 1];
                    String[] tempnameArray = new String[size - 1];
                    String[] tempphoneNumberArray = new String[size - 1];
                    String[] tempcompanyNameArray = new String[size - 1];
                    double[] tempsalaryArray = new double[size - 1];
                    String[] tempbirthdayArray = new String[size - 1];


                    for (int i = 0; i < size - 1; i++) {
                        tempidArray[i] = idArray[i];
                        tempnameArray[i] = nameArray[i];
                        tempphoneNumberArray[i] = phoneNumberArray[i];
                        tempcompanyNameArray[i] = nameArray[i];
                        tempsalaryArray[i] = salaryArray[i];
                        tempbirthdayArray[i] = birthdayArray[i];

                    }
                    idArray = tempidArray;
                    nameArray = tempnameArray;
                    phoneNumberArray = tempphoneNumberArray;
                    companyNameArray = tempcompanyNameArray;
                    salaryArray = tempsalaryArray;
                    birthdayArray = tempbirthdayArray;

                    System.out.println();
                    System.out.print("       Customer has been deleted successfully...");
                    System.out.println("\n");
                    System.out.print(" Do you want to delete another Contact (Y/N) :");

                    Scanner input3=new Scanner(System.in);

                    String exitoption3 = input3.nextLine();

                    if (exitoption3.equalsIgnoreCase("Y")) {

                        clearConsole();
                        deleteContact();

                    } else {
                        exitoption3.equalsIgnoreCase("N");
                        clearConsole();
                        loadHomepage();
                    }

                } else {
                    exitoption1.equalsIgnoreCase("N");
                    clearConsole();
                    loadHomepage();
                }
            }else {
                System.out.print("    Invalid Name or Phone Number.... ");
                System.out.println("\n");
                System.out.print(" Do you want to delete another Contact (Y/N) :");

                String exitoption2 = input.nextLine();

                if (exitoption2.equalsIgnoreCase("Y")) {
                    // Move the cursor up five lines
                    System.out.print("\033[5A");
                    // Clear the lines
                    System.out.print("\033[0J");

                } else {
                    exitoption2.equalsIgnoreCase("N");
                    clearConsole();
                    loadHomepage();
                }

            }
        }
    }
    public static void searchContactTitle() {
        System.out.println("+------------------------------------------------------------------------------------------+");
        System.out.println("|                                   Search Contact                                         |");
        System.out.println("+------------------------------------------------------------------------------------------+");

    }
    public static void searchContact() {
        searchContactTitle();

        while (true) {
            System.out.println();
            System.out.print(" Search Contact by Name or Phone Number -");
            Scanner input = new Scanner(System.in);
            String searchContact = input.nextLine();

            int index1 = searchName(searchContact);

            int index2 = searchPhoneNumber(searchContact);

            int max = 0;

            if (index1 >= 0 || index2 >= 0) {

                if (index1 > max) {
                    max = index1;
                }
                if (index2 > max) {
                    max = index2;
                }
                System.out.println();

                System.out.println("   Contact ID       :" + idArray[max]);
                System.out.println("   Name             :" + nameArray[max]);
                System.out.println("   Phone Number     :" + phoneNumberArray[max]);
                System.out.println("   Company Name     :" + companyNameArray[max]);
                System.out.printf("   Salary           :" +"%.2f", salaryArray[max]);
                System.out.println();
                System.out.println("   B'Day(YYYY-MM-DD):" + birthdayArray[max]);

                System.out.println();

                System.out.print(" Do you want to Search another contact (Y/N) :");

                String exitoption1 = input.nextLine();

                if (exitoption1.equalsIgnoreCase("Y")) {
                    clearConsole();
                    searchContact();

                } else {
                    exitoption1.equalsIgnoreCase("N");
                    clearConsole();
                    loadHomepage();
                }
            }else {
                System.out.println();
                System.out.print("    No contact found for " +searchContact+"....");
                System.out.println("\n");
                System.out.print(" Do you want to Search another contact (Y/N) :");

                String exitoption2 = input.nextLine();

                if (exitoption2.equalsIgnoreCase("Y")) {

                    clearConsole();
                    searchContact();

                } else {
                    exitoption2.equalsIgnoreCase("N");
                    clearConsole();
                    loadHomepage();
                }

            }
        }
    }
    private static void sortContactTitle() {
        System.out.println("+------------------------------------------------------------------------------------------+");
        System.out.println("|                                     Sort Contact                                         |");
        System.out.println("+------------------------------------------------------------------------------------------+");

    }
    public static void sortContact() {

        sortContactTitle();
        System.out.println();

        System.out.println("     [01] Sorting by Name");
        System.out.println();
        System.out.println("     [02] Sorting by Salary");
        System.out.println();
        System.out.println("     [03] Sorting by Birthday");

        System.out.println("\n");

        System.out.print(" Enter an option to continue ->");
        Scanner input=new Scanner(System.in);
        int sortingNumber=input.nextInt();

        switch (sortingNumber){

            case 1:
                clearConsole();
                sortingName();
                break;
            case 2:
                clearConsole();
                sortingSalary();
                break;
            case 3:
                clearConsole();
                sortingBirthday();
                break;
            default:
                System.out.println("invalid Input , input valid option ");
                loadHomepage();
        }
    }

    public static void sortingName() {
        System.out.println();

        System.out.println("                         +------------------------------------+");
        System.out.println("                         |        List Contact by name        |");
        System.out.println("                         +------------------------------------+");

        String tempnameArray="";
        String tempidArray="";
        String tempphoneNumber="";
        String tempcompanyNameArray="";
        double tempsalaryArray=0;
        String tempbirthdayArray="";

        for (int i = 0; i < nameArray.length; i++) {
            for (int j = i + 1; j < nameArray.length; j++) {


                if (nameArray[i].compareTo(nameArray[j]) > 0) {

                    tempnameArray = nameArray[i];
                    tempidArray=idArray[i];
                    tempphoneNumber=phoneNumberArray[i];
                    tempcompanyNameArray=companyNameArray[i];
                    tempsalaryArray=salaryArray[i];
                    tempbirthdayArray=birthdayArray[i];


                    nameArray[i] = nameArray[j];
                    idArray[i]=idArray[j];
                    phoneNumberArray[i]=phoneNumberArray[j];
                    companyNameArray[i]=companyNameArray[j];
                    salaryArray[i]=salaryArray[j];
                    birthdayArray[i]=birthdayArray[j];


                    nameArray[j] = tempnameArray;
                    idArray[j]=tempidArray;
                    phoneNumberArray[j]=tempphoneNumber;
                    companyNameArray[j]=tempcompanyNameArray;
                    salaryArray[j]=tempsalaryArray;
                    birthdayArray[j]=tempbirthdayArray;

                }
            }
        }


        System.out.format("%-14s%-19s%-23s%-17s%-18s%-20s","+------------+","------------------+","----------------------+","----------------+","-----------------+","-------------------+");
        System.out.println();
        System.out.format("%-14s%-19s%-23s%-17s%-18s%-20s","| Contact ID |","       Name       |","     Phone Number     |","     Company    |","      Salary     |","      Birthday     |");
        System.out.println();
        System.out.format("%-14s%-19s%-23s%-17s%-18s%-20s","+------------+","------------------+","----------------------+","----------------+","-----------------+","-------------------+");
        System.out.println();

        for (int i = 0; i < nameArray.length; i++) {

            System.out.format("%-13s%-19s%-23s%-17s","|"+idArray[i],"|"+nameArray[i],"|"+phoneNumberArray[i],"|"+companyNameArray[i]);
            System.out.printf("|%-17.2f", salaryArray[i]);
            System.out.format("%-20s%-6s","|"+birthdayArray[i],"|");
            System.out.println();

        }
        System.out.format("%-13s%-19s%-23s%-17s%-18s%-20s","+------------+","------------------+","----------------------+","----------------+","-----------------+","-------------------+");
        System.out.println("\n");

        System.out.print(" Do you want to go to Home page  (Y/N):");

        Scanner input=new Scanner(System.in);

        String exitoption = input.nextLine();

        if (exitoption.equalsIgnoreCase("Y")) {

            clearConsole();
            loadHomepage();

        } else {
            exitoption.equalsIgnoreCase("N");
            clearConsole();
            sortContact();
        }

    }
    public static void sortingSalary() {
        System.out.println();

        System.out.println("                         +------------------------------------+");
        System.out.println("                         |      List Contact by Salary        |");
        System.out.println("                         +------------------------------------+");

        String tempnameArray="";
        String tempidArray="";
        String tempphoneNumber="";
        String tempcompanyNameArray="";
        double tempsalaryArray=0;
        String tempbirthdayArray="";


        for (int i = 0; i < salaryArray.length; i++) {
            for (int j = i + 1; j < salaryArray.length; j++) {

                // to compare one string with other strings
                if (salaryArray[i]>salaryArray[j] ) {
                    // swapping
                    tempnameArray = nameArray[i];
                    tempidArray=idArray[i];
                    tempphoneNumber=phoneNumberArray[i];
                    tempcompanyNameArray=companyNameArray[i];
                    tempsalaryArray=salaryArray[i];
                    tempbirthdayArray=birthdayArray[i];


                    nameArray[i] = nameArray[j];
                    idArray[i]=idArray[j];
                    phoneNumberArray[i]=phoneNumberArray[j];
                    companyNameArray[i]=companyNameArray[j];
                    salaryArray[i]=salaryArray[j];
                    birthdayArray[i]=birthdayArray[j];


                    nameArray[j] = tempnameArray;
                    idArray[j]=tempidArray;
                    phoneNumberArray[j]=tempphoneNumber;
                    companyNameArray[j]=tempcompanyNameArray;
                    salaryArray[j]=tempsalaryArray;
                    birthdayArray[j]=tempbirthdayArray;

                }
            }
        }

        System.out.format("%-14s%-19s%-23s%-17s%-18s%-20s","+------------+","------------------+","----------------------+","----------------+","-----------------+","-------------------+");
        System.out.println();
        System.out.format("%-14s%-19s%-23s%-17s%-18s%-20s","| Contact ID |","       Name       |","     Phone Number     |","     Company    |","      Salary     |","      Birthday     |");
        System.out.println();
        System.out.format("%-14s%-19s%-23s%-17s%-18s%-20s","+------------+","------------------+","----------------------+","----------------+","-----------------+","-------------------+");
        System.out.println();

        for (int i = 0; i < nameArray.length; i++) {

            System.out.format("%-13s%-19s%-23s%-17s","|"+idArray[i],"|"+nameArray[i],"|"+phoneNumberArray[i],"|"+companyNameArray[i]);
            System.out.printf("|%-17.2f", salaryArray[i]);
            System.out.format("%-20s%-6s","|"+birthdayArray[i],"|");
            System.out.println();

        }
        System.out.format("%-13s%-19s%-23s%-17s%-18s%-20s","+------------+","------------------+","----------------------+","----------------+","-----------------+","-------------------+");
        System.out.println("\n");

        System.out.print(" Do you want to go to Home page  (Y/N):");

        Scanner input=new Scanner(System.in);

        String exitoption = input.nextLine();

        if (exitoption.equalsIgnoreCase("Y")) {

            clearConsole();
            loadHomepage();

        } else {
            exitoption.equalsIgnoreCase("N");
            clearConsole();
            sortingSalary();
        }

    }
    public static void sortingBirthday() {
        System.out.println();

        System.out.println("                        +------------------------------------+");
        System.out.println("                        |     List Contact by Birthday       |");
        System.out.println("                        +------------------------------------+");

        String tempnameArray="";
        String tempidArray="";
        String tempphoneNumber="";
        String tempcompanyNameArray="";
        double tempsalaryArray=0;
        String tempbirthdayArray="";

        for (int i = 0; i < birthdayArray.length; i++) {
            for (int j = i + 1; j < birthdayArray.length; j++) {

                if ((birthdayArray[i].compareTo(birthdayArray[j]) > 0) ) {

                    tempnameArray = nameArray[i];
                    tempidArray=idArray[i];
                    tempphoneNumber=phoneNumberArray[i];
                    tempcompanyNameArray=companyNameArray[i];
                    tempsalaryArray=salaryArray[i];
                    tempbirthdayArray=birthdayArray[i];


                    nameArray[i] = nameArray[j];
                    idArray[i]=idArray[j];
                    phoneNumberArray[i]=phoneNumberArray[j];
                    companyNameArray[i]=companyNameArray[j];
                    salaryArray[i]=salaryArray[j];
                    birthdayArray[i]=birthdayArray[j];


                    nameArray[j] = tempnameArray;
                    idArray[j]=tempidArray;
                    phoneNumberArray[j]=tempphoneNumber;
                    companyNameArray[j]=tempcompanyNameArray;
                    salaryArray[j]=tempsalaryArray;
                    birthdayArray[j]=tempbirthdayArray;

                }
            }
        }

        System.out.format("%-14s%-19s%-23s%-17s%-18s%-20s","+------------+","------------------+","----------------------+","----------------+","-----------------+","-------------------+");
        System.out.println();
        System.out.format("%-14s%-19s%-23s%-17s%-18s%-20s","| Contact ID |","       Name       |","     Phone Number     |","     Company    |","      Salary     |","      Birthday     |");
        System.out.println();
        System.out.format("%-14s%-19s%-23s%-17s%-18s%-20s","+------------+","------------------+","----------------------+","----------------+","-----------------+","-------------------+");
        System.out.println();

        for (int i = 0; i < nameArray.length; i++) {

            System.out.format("%-13s%-19s%-23s%-17s","|"+idArray[i],"|"+nameArray[i],"|"+phoneNumberArray[i],"|"+companyNameArray[i]);
            System.out.printf("|%-17.2f", salaryArray[i]);
            System.out.format("%-20s%-6s","|"+birthdayArray[i],"|");
            System.out.println();


        }
        System.out.format("%-13s%-19s%-23s%-17s%-18s%-20s","+------------+","------------------+","----------------------+","----------------+","-----------------+","-------------------+");
        System.out.println("\n");

        System.out.print(" Do you want to go to Home page  (Y/N):");

        Scanner input=new Scanner(System.in);

        String exitoption = input.nextLine();

        if (exitoption.equalsIgnoreCase("Y")) {

            clearConsole();
            loadHomepage();

        } else {
            exitoption.equalsIgnoreCase("N");
            clearConsole();
            sortingSalary();
        }
    }

    public static int searchPhoneNumber(String searchContact) {

        for (int i = 0; i < phoneNumberArray.length; i++) {
            if (phoneNumberArray[i].equals(searchContact)) {
                return (i);
            }
        }
        return -1;
    }

    public static int searchName(String searchContact) {
        for (int i = 0; i < nameArray.length; i++) {
            if (nameArray[i].equals(searchContact)) {
                return (i);
            }
        }
        return -1;
    }


}















