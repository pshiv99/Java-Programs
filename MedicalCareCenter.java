import java.util.Scanner;

class MedicalCareCenter {
    public static void main(String[] args) {
        String name;
        int age;
        char gender;
        float weight;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name:");
        name = sc.nextLine();
        System.out.println("Enter age:");
        age = sc.nextInt();
        System.out.println("Enter Gender('M' or 'F'):");
        gender = sc.next().charAt(0);
        System.out.println("Enter Weight:");
        weight = sc.nextFloat();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.printf("Weight: %.2f", weight);

        sc.close();


    }
}