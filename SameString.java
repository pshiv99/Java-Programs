import java.util.Scanner;

class SameString {
    public static void main(String[] args) {
        String  firstString, secondString;
        Boolean[] first = new Boolean[26], second = new Boolean[26];
        int index;
        Boolean flag = true;

        Scanner sc = new Scanner(System.in);
        firstString = sc.nextLine();
        secondString = sc.nextLine();

        for(int i=0; i<26; i++) {
            first[i] = second[i] = false;
        }

        for(char c: firstString.toCharArray()) {
            index = (int)c - 97;
            first[index] = true;   
        }
        for(char c: secondString.toCharArray()) {
            index = (int)c - 97;
            second[index] = true;   
        }

        for(int i=0; i<26; i++) {
            if(first[i] != second[i]) {
                flag = false;
                break;
            }
        }

        if(flag)
            System.out.print("Same");
        else
            System.out.print("Different");

        sc.close();
    }
}