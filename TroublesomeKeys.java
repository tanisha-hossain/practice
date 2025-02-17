import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char sillyKey = 0;
        char sillyLetter = 0;
        char quiet = 0;

        String input = scan.nextLine();
        String displayed = scan.nextLine();

        char[] arr1 = input.toCharArray();
        char[] arr2 = displayed.toCharArray();


        if (arr1.length==arr2.length) {
            quiet = '-';
        } else {
            boolean found = false;
            for (int i = 0; i < arr2.length;i++) {
                if (arr1[i]!=arr2[i] && arr1[i+1]==arr2[i]) {
                    quiet = arr1[i];
                    found = true;
                    break;
                }
            }
            if (!found) {
                quiet = arr1[arr1.length - 1]; //last letter is quiet key
            }
        }

        int arr1_indx = 0;
        for (int i = 0; i < arr2.length; i++) {
            while (quiet == arr1[arr1_indx] ) {
                arr1_indx++;
            }

            if (arr1[arr1_indx]!=arr2[i]){
                sillyKey = arr1[arr1_indx];
                sillyLetter = arr2[i];
                break;
            }
            arr1_indx++;
        }


        System.out.println(sillyKey + " " + sillyLetter);
        System.out.print(quiet);

    }
}
