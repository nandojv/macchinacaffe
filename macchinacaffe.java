package corsoiniziodacapo;



import java.util.Scanner;

public class macchinacaffe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		item kimbo=new item("kimbo",2,"si");
		item the=new item("inglese",4,"si");
		item kimbo1=new item("kimbo",2,"no");
		item the1=new item("inglese",4,"no");
		
		int item=0;
		
		System.out.println("-------------------------"); 
		System.out.println("|                        |");
	    System.out.println("|      Macchina Pronta   |");
		System.out.println("-------------------------|");
		
		System.out.println("|------------------------|");
		System.out.println("| Selezionare prodotto   | ");
		System.out.println("|------------------------|");
		
		
		do {
		
		
		
      Scanner s=new Scanner(System.in);
		
		System.out.println("|1|caffe|,|2| latte|,|3|the|");
		
		item=s.nextInt();
		
     Scanner z=new Scanner(System.in);
		
		System.out.println("quantita zucchero:1 |+| , 2 |-|");
		
		int Prodotto=z.nextInt();
		
		
			if(item==1 && Prodotto==1){
			System.out.println(kimbo);
		}
			
			
			else if (item==1 && Prodotto==2){
			
				 System.out.println(kimbo1 );
			
		}
		
			else if(item==2 && Prodotto==1){
			System.out.println(the);
			
		}
			else if(item==2 && Prodotto==2){
				System.out.println(the1);
		}
		}
			while(item !=0);
		}
	}
	
		
		
	


