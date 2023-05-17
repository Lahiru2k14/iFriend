import java.util.Scanner;

public class iFRIEND {

    public static int[] idArray = new int[0];
    public static int[] nameArray = new int[0];
    public static int[] phoneNumberArray = new int[0];
    public static int[] companyArray = new int[0];
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
        int[] tempidArray=new int[idArray.length+1];
        for (int i = 0; i < idArray.length; i++){
            tempidArray[i]=idArray[i];
        }
        idArray=tempidArray;
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
        addcontactTitle();

        int num=idArray.length+1;
        int temp=num;
        int count = 0;

        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        if (count == 1) {
            System.out.println(" C00" + num);
        } else if (count == 2) {
            System.out.println(" C0" + num);
        } else {
            System.out.println(" C" + num);
        }
        extendArray();

        idArray[idArray.length-1]=num;

        System.out.println(idArray[0]);


    }





}







