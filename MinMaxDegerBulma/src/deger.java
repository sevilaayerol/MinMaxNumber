import java.util.Scanner;

public class deger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Kac tane sayi girmek istiyorsunuz ? ");
		int n=input.nextInt();
		int i, a, min=1, max=1;
		
		for(i=1; i<=n; i++) {
			
		System.out.print(i+ ". Sayýyý giriniz: ");
		a=input.nextInt();
		
		if (i == 1){
            max = a;
            min = a;
        }

        if (a > max){
            max = a;
        }

        if (a < min){
            min = a;
        }
		 
      }
		System.out.println("En buyuk sayi: " + max);
        System.out.println("En kucuk sayi: " + min);
     
	}
}


