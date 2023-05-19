import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class iFRIEND {

    public static String[] idArray ={"C0001"};
    public static String[] nameArray ={"lahiru"};
    public static String[] phoneNumberArray ={"0717751284"};
    public static String[] companyNameArray = {"ICET"};
    public static int[] salaryArray = {25000};
    public static String[] birthdayArray = {"1994-02-14"};


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
        System.out.print("\t\tEnter an Option to continue ->: ");

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

    public static void addcontact() {
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
                                    System.out.println("   The date you entered is in the future.");
                                    System.out.print(" Do you want to add birthday again (Y/N) :");

                                    String exitoption = input2.nextLine();

                                    if (exitoption.equalsIgnoreCase("Y")) {
                                        clearConsole();
                                        addcontactTitle();
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
                                    System.out.println("  The date you entered is today");
                                    System.out.print(" Do you want to add birthday again (Y/N) :");

                                    String exitoption = input2.nextLine();

                                    if (exitoption.equalsIgnoreCase("Y")) {
                                        clearConsole();
                                        addcontactTitle();
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
                        Scanner input2 = new Scanner(System.in);
                        System.out.println(" Invalid input....");

                        System.out.print(" Do you want to add salary again (Y/N) :");

                        String exitoption2 = input2.nextLine();

                        if (exitoption2.equalsIgnoreCase("Y")) {
                            clearConsole();
                            addcontactTitle();
                            continue;

                        } else {
                            exitoption2.equalsIgnoreCase("N");
                            clearConsole();
                            loadHomepage();
                        }

                    }
                }

            } else {
                System.out.println("     Invalid phone Number ...");

                System.out.print(" Do you want to add phone number again (Y/N) :");

                String exitoption = input.nextLine();

                if (exitoption.equalsIgnoreCase("Y")) {
                    clearConsole();
                    addcontactTitle();
                    continue;

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

                System.out.println("   Contact ID       :" + idArray[max]);
                System.out.println("   Name             :" + nameArray[max]);
                System.out.println("   Phone Number     :" + phoneNumberArray[max]);
                System.out.println("   Company Name     :" + companyNameArray[max]);
                System.out.println("   Salary           :" + salaryArray[max]);
                System.out.println("   B'Day(YYYY-MM-DD):" + birthdayArray[max]);


            }

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
            System.out.print("\033[6A");
            // Clear the lines
            System.out.print("\033[0J");


            while (true) {

                if (num == 1) {
                    System.out.println("\n");
                    System.out.println(" Update Name");
                    System.out.println(" ===================");
                    System.out.print(" Input new Name -");

                    Scanner input2 = new Scanner(System.in);

                    String newName = input2.nextLine();

                    nameArray[max] = newName;

                    System.out.println(Arrays.toString(nameArray));

                    System.out.println(" Contact has been update successfully..");

                    System.out.print(" Do you want to update another contact (Y/N) :");

                    String exitoption1 = input2.nextLine();

                    if (exitoption1.equalsIgnoreCase("Y")) {
                        clearConsole();
                        updateContactTitle();
                        continue;
                    } else {
                        exitoption1.equalsIgnoreCase("N");
                        clearConsole();
                        loadHomepage();
                    }
                } else if (num == 2) {

                    System.out.println("\n");
                    System.out.println(" Update Phone Number");
                    System.out.println(" =====================");
                    System.out.print(" Input new Phone Number -");

                    Scanner input2= new Scanner(System.in);

                    String newPhoneNumber = input2.nextLine();

                    phoneNumberArray[max] = newPhoneNumber;

                    System.out.println(Arrays.toString(phoneNumberArray));

                    System.out.println(" Contact has been update successfully..");

                    System.out.print(" Do you want to update another contact (Y/N) :");

                    String exitoption1 = input2.nextLine();

                    if (exitoption1.equalsIgnoreCase("Y")) {
                        clearConsole();
                        updateContactTitle();
                        continue;
                    } else {
                        exitoption1.equalsIgnoreCase("N");
                        clearConsole();
                        loadHomepage();
                    }
                } else if (num == 3) {

                    System.out.println("\n");
                    System.out.println(" Update Company name");
                    System.out.println(" =====================");
                    System.out.print(" Input new Company Name -");

                    Scanner input2 = new Scanner(System.in);

                    String newCompanyName = input2.nextLine();

                    companyNameArray[max] = newCompanyName;

                    System.out.println(Arrays.toString(companyNameArray));

                    System.out.println(" Contact has been update successfully..");

                    System.out.print(" Do you want to update another contact (Y/N) :");

                    String exitoption1 = input2.nextLine();

                    if (exitoption1.equalsIgnoreCase("Y")) {
                        clearConsole();
                        updateContactTitle();
                        continue;
                    } else {
                        exitoption1.equalsIgnoreCase("N");
                        clearConsole();
                        loadHomepage();
                    }
                } else if (num == 4) {

                    System.out.println("\n");
                    System.out.println(" Update Salary");
                    System.out.println(" =====================");
                    System.out.print(" Input New Salary -");

                    Scanner input2 = new Scanner(System.in);

                    int newSalary = input2.nextInt();

                    salaryArray[max] = newSalary;

                    System.out.println(Arrays.toString(salaryArray));

                    System.out.println(" Contact has been update successfully..");

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

                System.out.println("   Contact ID       :" + idArray[max]);
                System.out.println("   Name             :" + nameArray[max]);
                System.out.println("   Phone Number     :" + phoneNumberArray[max]);
                System.out.println("   Company Name     :" + companyNameArray[max]);
                System.out.println("   Salary           :" + salaryArray[max]);
                System.out.println("   B'Day(YYYY-MM-DD):" + birthdayArray[max]);


            }

            System.out.println(" What do you want to delete this contact (Y/N) :");

            String exitoption1 = input.nextLine();

            if (exitoption1.equalsIgnoreCase("Y")) {













            } else {
                exitoption1.equalsIgnoreCase("N");
                clearConsole();
                loadHomepage();
            }
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















