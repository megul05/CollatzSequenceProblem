package CollatzSequenceProblem;
import java.util.*;
public class CollatzSequenceProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		if(n==1)
		{
			System.out.print(n + " " + (n-1));
		}
		else {
		while(n!=1) 
		{
			System.out.print(n+" ");
			if(n%2==0)
			{
				n=n/2;
			}
			else 
			{
				n=3*n+1;
			}
		}
		System.out.print(n);

	}
}

}
