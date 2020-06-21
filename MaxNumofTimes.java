import java.util.Scanner;

class MaxNumofTimes {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        int[] arr = new int[num];

        for(int i=0; i<num; i++) {
            arr[i] = sc.nextInt();
        }

        int maxValue = arr[0];
        int maxValueCount = 0;

        for(int i=0;  i<num; i++) {
            int temp = 0;
            for(int j=i; j<num; j++) {
                if(arr[j] == arr[i]) {
                    temp = temp + 1;
                }
            }
            if(temp > maxValueCount) {
                maxValue = arr[i];
                maxValueCount = temp;
            }
            else if(temp == maxValueCount) {
                if(arr[i] > maxValue) {
                    maxValue = arr[i];
                }
            }
        }
        System.out.print(maxValue);
        sc.close();
    }
}