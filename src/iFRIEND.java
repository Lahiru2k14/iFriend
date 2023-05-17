import java.util.Scanner;

public class iFRIEND {

    public static int[] idArray = new int[0];
    public static int[] nameArray = new int[0];
    public static int[] phoneNumberArray = new int[0];
    public static int[] companyNameArray = new int[0];
    public static int[] salaryArray = new int[0];
    public static int[] birthdayArray = new int[0];


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
        int[] tempidArray = new int[idArray.length + 1];
        int[] tempnameArray = new int[nameArray.length + 1];
        int[] tempphoneNumberArray = new int[phoneNumberArray.length + 1];
        int[] tempcompanyNameArray = new int[companyNameArray.length + 1];

        for (int i = 0; i < idArray.length; i++) {

            tempidArray[i] = idArray[i];
            tempnameArray[i]=nameArray[i];
            tempphoneNumberArray[i]=phoneNumberArray[i];
            tempcompanyNameArray[i]=companyNameArray[i];

        }
        idArray = tempidArray;
        nameArray=tempnameArray;
        phoneNumberArray=tempphoneNumberArray;
        companyNameArray=tempcompanyNameArray;
    }


    public static void loadHomepage() {

        System.out.println("iFried");
        System.out.println("Contact Organizer");
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
        System.out.println(" |                             ADD Contact to the List                                      |");
        System.out.println(" +------------------------------------------------------------------------------------------+");
    }

    private static void addcontact() {
        Scanner input = new Scanner(System.in);
        addcontactTitle();


        int id = idArray.length + 1;
        int temp = id;
        int count = 0;
        String name = "";
        String companyName="";
        int salary=0;

        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        if (count == 1) {
            System.out.println(" C00" + id);
        } else if (count == 2) {
            System.out.println(" C0" + id);
        } else {
            System.out.println(" C" + id);
        }




            if (searchid(id) >= 0) {

                System.out.println(id + " The id already exists");
            } else {
                System.out.print("Name       :");
                name = input.nextLine();
            }
        while (true) {
            System.out.print("PhoneNumber  :");
            String phoneNumber = input.nextLine();

            if (phoneNumber.startsWith("0") & phoneNumber.length()==10){
                System.out.println("Company Name  :");
                companyName = input.nextLine();

               L1: while (true){
                System.out.println("Salary  :");
                salary = input.nextInt();

                    if (salary>0){
                        System.out.println("Birthday   :");



                    }else {
                        continue L1;

                    }

                }



            } else {
                System.out.println("Invalid phone Number ...");

                System.out.print("Do you want to add phone number again (Y/N) :");

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





            extendArray();

            idArray[idArray.length - 1] = id;


            loadHomepage();


        }
    }



    public static int searchid(int id) {
        for (int i = 0; i < idArray.length; i++) {
            if (idArray[i] == id) {
                return (i);
            }
        }
        return -1;
    }
}





