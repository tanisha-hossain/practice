//DOES NOT WORK YET - UNFINISHED
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


        if(arr1.length==arr2.length){
            quiet = '-';
        }
        else{
            for(int i = 0; i < arr2.length-1;i++){
                for(int j = 0; j < arr1.length; j++){
                    if(arr1[i]!=arr2[i] && arr1[i+1]==arr2[i]){
                        quiet = arr1[i];
                        break;
                    }
                }
            }
        }

        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr1.length; j++){
                if(quiet != arr1[i] && arr1[i]!=arr2[i]){
                    sillyKey = arr1[i];
                    sillyLetter = arr2[i];
                    break;
                }
            }
        }


        System.out.println(sillyKey + " " + sillyLetter);
        System.out.print(quiet);

    }
}
