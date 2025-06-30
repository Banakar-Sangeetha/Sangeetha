import java.util.Scanner;
public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            a = a - 1;
        }
        for (int i = 0; i < a; i++) {
            int oddNumber = 2 * i + 1;
            if (i < a - 1)
                System.out.print(oddNumber + ", ");
            else
                System.out.print(oddNumber); 
        }

        sc.close();
	}

}
