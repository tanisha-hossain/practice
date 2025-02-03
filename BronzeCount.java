import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int s =0;
		int p = 0;
		List<Integer> scores = new ArrayList<Integer>();
		
		for (int i = 0; i <n; i++){
		    scores.add(scan.nextInt());
		}
		
		int count = 0;
		while(count<=2){
		   s = 0;
		   for(int k = 0; k < scores.size(); k++){
		       if (scores.get(k)> s){
		           s = scores.get(k);
		       }
		   }
		   for(int i = 0; i < scores.size();i++){
		       if(count == 2 && scores.get(i)==s){
		           p++;
		       }
		       else if(scores.get(i)==s){
		           scores.remove(i);
		           i--;
		       }
		   }
		   
		   count++;
		}
		
		System.out.print(s + " " +p);
	}

    
}
