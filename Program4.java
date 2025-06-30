import java.util.*;
public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers separated by space: ");
        String inputLine = sc.nextLine();

        String[] tokens = inputLine.split("\\s+");
        int[] inputNumbers = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            inputNumbers[i] = Integer.parseInt(tokens[i]);
        }

        Map<Integer, Integer> countMap = new LinkedHashMap<>();
        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }

        for (int divisor = 1; divisor <= 9; divisor++) {
            int count = 0;
            for (int num : inputNumbers) {
                if (num % divisor == 0) {
                    count++;
                }
            }
            countMap.put(divisor, count);
        }

        System.out.println(countMap);
        sc.close();
	}

}
