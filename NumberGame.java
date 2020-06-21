import java.util.Scanner;

class NumberGame {
    public static void main(String[] args) {
        int start = 1, finish, whichBus = 0;
        String[] busType = {"Bus", "bUs", "buS"};
        Scanner s = new Scanner(System.in);
        finish = s.nextInt();

        for(int i = start; i<=finish; i++) {
            if((i%5) == 0) {
                if(i == finish) {
                    System.out.print(busType[whichBus]);
                    break;
                }
                else
                    System.out.print(busType[whichBus] + " ");
                whichBus++;
                whichBus %= 3;
            }
            else {
                if(i == finish) {
                    System.out.print(i);
                    break;
                }
                else
                    System.out.print(i + " ");
            }
        }
        s.close();
    }
}