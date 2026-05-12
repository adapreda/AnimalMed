import java.util.Scanner;
import model.Clinic;

public class Main {
    public static void main(String[] args){

        Clinic clinic = Clinic.getInstance();

        while(true){
            System.out.println();
            System.out.println("===================== Welcome to " + clinic.getClinicName() + " ! ==========================");
            System.out.println(clinic);
            System.out.println("1. Add/modify a client");
            System.out.println("2. Add/modift an employee");
            System.out.println("3. Add/modify an animal for an existing client");
            System.out.println("4. Register a medical service for an employee");
            System.out.println("     + the client will be given a prescription ");
            System.out.println("     + a receipt will be generated for the service");
            System.out.println("5. Display medical history of a animal");
            System.out.println("6. Display the animals with high medical risk");
            System.out.println("7. Search for an animal after its owner's name");
            System.out.println("8. Display the animals expected to come for a check-up");
            System.out.println("=== ROOT ONLY ===");
            System.out.println("9. Clinic revenue over a time period");
            System.out.println("10. Most in-demand employee");
            System.out.println("11. Generate a complete report for the configuration.clinic");
            System.out.println("12. Delete a client/animal/employee");
            System.out.println("13. Exit");
            System.out.println();

            Scanner sc = new Scanner(System.in);
            System.out.println("Please introduce your action: ");
            int choice = sc.nextInt();

            switch (choice){
                case 1: {
                    System.out.println("pasul 1");
                    break;
                }
                case 2: {
                    System.out.println("pasul 2");
                    break;
                }
                case 3: {
                    System.out.println("pasul 3");
                    break;
                }
                case 4: {
                    System.out.println("pasul 4");
                    break;
                }
                case 5: {
                    System.out.println("pasul 5");
                    break;
                }
                case 6: {
                    System.out.println("pasul 6");
                    break;
                }
                case 7: {
                    System.out.println("pasul 7");
                    break;
                }
                case 8: {
                    System.out.println("pasul 8");
                    break;
                }
                case 9: {
                    System.out.println("pasul 9");
                    break;
                }
                case 10: {
                    System.out.println("pasul 10");
                    break;
                }
                case 11: {
                    System.out.println("pasul 11");
                    break;
                }
                case 12: {
                    System.out.println("pasul 12");
                    break;
                }case 13: {
                    System.out.println("pasul 13");
                    return;
                }
                default:{
                    System.out.println("Invalid choice");
                    return;
                }

            }
        }
    }
}
