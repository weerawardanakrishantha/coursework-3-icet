
import java.util.Scanner;

class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		String date, name;
		System.out.println("\r\n		 \r\n		   _____                      _     ______        _     _             \r\n		  / ____|                    | |   |  ____|      | |   (_)            \r\n		 | (___  _ __ ___   __ _ _ __| |_  | |__ __ _ ___| |__  _  ___  _ __  \r\n		  \\___ \\| \'_ ` _ \\ / _` | \'__| __| |  __/ _` / __| \'_ \\| |/ _ \\| \'_ \\ \r\n		  ____) | | | | | | (_| | |  | |_  | | | (_| \\__ \\ | | | | (_) | | | |\r\n		 |_____/|_| |_| |_|\\__,_|_|   \\__| |_|  \\__,_|___/_| |_|_|\\___/|_| |_|\r\n		                                                                      \r\n		                                                                      \r\n		");
		
		System.out.print("\t\t"+"Date : ");
		date=input.nextLine();
		System.out.println();	
		
		
		System.out.print("\t\t"+"Customer name : ");
		name=input.nextLine();
		System.out.println();
		System.out.println("\t\t"+"_______________________________________________________________________");
		System.out.println("\n");
		
		System.out.print("\r\n				  _______     _____ _     _      _       \r\n				 |__   __|   / ____| |   (_)    | |      \r\n				    | |_____| (___ | |__  _ _ __| |_ ___ \r\n				    | |______\\___ \\| \'_ \\| | \'__| __/ __|\r\n				    | |      ____) | | | | | |  | |_\\__ \\\r\n				    |_|     |_____/|_| |_|_|_|   \\__|___/\r\n		                                       \r\n				                                         \r\n\r\n\r\n\r\n\r\n");	
		
		int tnumber;
		double tprice, drate;
		System.out.print("\t\t"+"Number of T-Shirts : ");
		tnumber=input.nextInt();
		System.out.println();
		
		System.out.print("\t\t"+"Unit price of T-Shirt : ");
		tprice=input.nextDouble();
		System.out.println();
		
		System.out.print("\t\t"+"Discount Rate (%) : ");
		drate=input.nextDouble();	
		System.out.println();
		
		double amount=tnumber*tprice-(tnumber*tprice*drate/100);
		
		System.out.printf("\t\t"+"+---------------------------+------------------+----------------------------+------------------+%n");
		System.out.printf("\t\t"+"|"+"\t"+"%-20s|"+"\t"+"%-15s|"+"\t"+"%-20s|"+"\t"+"%-15s|%n", "Description","QTY","Unit Price","Amount");
		System.out.printf("\t\t"+"+---------------------------+------------------+----------------------------+------------------+%n");
		System.out.printf("\t\t"+"|"+"\t"+"%-20s|"+"\t"+"%-15s|"+"\t"+"%-20s|"+"\t"+"%-15s|%n", "T-Shirt",tnumber,tprice,amount);
		System.out.printf("\t\t"+"+---------------------------+------------------+----------------------------+------------------+%n");
		System.out.println();
		System.out.println("\t\t"+"________________________________________________________________________________________________");
		
		System.out.println("\n");
		
		System.out.print("\r\n				  _______                                \r\n				 |__   __|                               \r\n				    | |_ __ ___  _   _ ___  ___ _ __ ___ \r\n				    | | \'__/ _ \\| | | / __|/ _ \\ \'__/ __|\r\n				    | | | | (_) | |_| \\__ \\  __/ |  \\__ \\\r\n				    |_|_|  \\___/ \\__,_|___/\\___|_|  |___/\r\n                                         \r\n                                         \r\n");
		
		int trnumber;
		double trprice, dtrate;
		System.out.print("\t\t"+"Number of Trousers : ");
		trnumber=input.nextInt();
		System.out.println();
		
		System.out.print("\t\t"+"Unit price of Trouser : ");
		trprice=input.nextDouble();
		System.out.println();
		
		System.out.print("\t\t"+"Discount Rate (%) : ");
		dtrate=input.nextDouble();	
		System.out.println();
		
		double tamount=trnumber*trprice-(trnumber*trprice*dtrate/100);
		
		System.out.printf("\t\t"+"+---------------------------+------------------+----------------------------+------------------+%n");
		System.out.printf("\t\t"+"|"+"\t"+"%-20s|"+"\t"+"%-15s|"+"\t"+"%-20s|"+"\t"+"%-15s|%n", "Description","QTY","Unit Price","Amount");
		System.out.printf("\t\t"+"+---------------------------+------------------+----------------------------+------------------+%n");
		System.out.printf("\t\t"+"|"+"\t"+"%-20s|"+"\t"+"%-15s|"+"\t"+"%-20s|"+"\t"+"%-15s|%n", "Trouser",trnumber,trprice,tamount);
		System.out.printf("\t\t"+"+---------------------------+------------------+----------------------------+------------------+%n");
		System.out.println();
		System.out.println("\t\t"+"________________________________________________________________________________________________");
		
		System.out.println("\n");
		
		System.out.print("\r\n					 \r\n					   _____ _     _      _       \r\n					  / ____| |   (_)    | |      \r\n					 | (___ | |__  _ _ __| |_ ___ \r\n					  \\___ \\| \'_ \\| | \'__| __/ __|\r\n					  ____) | | | | | |  | |_\\__ \\\r\n					 |_____/|_| |_|_|_|   \\__|___/\r\n	                              \r\n                              \r\n");
		
		int snumber;
		double sprice, dsrate;
		System.out.print("\t\t"+"Number of Shirts : ");
		snumber=input.nextInt();
		System.out.println();
		
		System.out.print("\t\t"+"Unit price of Shirt : ");
		sprice=input.nextDouble();
		System.out.println();
		
		System.out.print("\t\t"+"Discount Rate (%) : ");
		dsrate=input.nextDouble();	
		System.out.println();
		
		double samount=snumber*sprice-(snumber*sprice*dsrate/100);
		
		System.out.printf("\t\t"+"+---------------------------+------------------+----------------------------+------------------+%n");
		System.out.printf("\t\t"+"|"+"\t"+"%-20s|"+"\t"+"%-15s|"+"\t"+"%-20s|"+"\t"+"%-15s|%n", "Description","QTY","Unit Price","Amount");
		System.out.printf("\t\t"+"+---------------------------+------------------+----------------------------+------------------+%n");
		System.out.printf("\t\t"+"|"+"\t"+"%-20s|"+"\t"+"%-15s|"+"\t"+"%-20s|"+"\t"+"%-15s|%n", "Shirt",snumber,sprice,samount);
		System.out.printf("\t\t"+"+---------------------------+------------------+----------------------------+------------------+%n");
		System.out.println();
		System.out.println("\t\t"+"________________________________________________________________________________________________");
		
		System.out.println("\n");
		
		System.out.print("\r\n					   _____ _                _       \r\n					  / ____| |              | |      \r\n					 | (___ | |__   ___  _ __| |_ ___ \r\n					  \\___ \\| \'_ \\ / _ \\| \'__| __/ __|\r\n					  ____) | | | | (_) | |  | |_\\__ \\\r\n					 |_____/|_| |_|\\___/|_|   \\__|___/\r\n                                  \r\n                                  \r\n");
		
		int pnumber;
		double pprice, dprate;
		System.out.print("\t\t"+"Number of Shorts : ");
		pnumber=input.nextInt();
		System.out.println();
		
		System.out.print("\t\t"+"Unit price of Short : ");
		pprice=input.nextDouble();
		System.out.println();
		
		System.out.print("\t\t"+"Discount Rate (%) : ");
		dprate=input.nextDouble();	
		System.out.println();
		
		double pamount=pnumber*pprice-(pnumber*pprice*dprate/100);
		
		System.out.printf("\t\t"+"+---------------------------+------------------+----------------------------+------------------+%n");
		System.out.printf("\t\t"+"|"+"\t"+"%-20s|"+"\t"+"%-15s|"+"\t"+"%-20s|"+"\t"+"%-15s|%n", "Description","QTY","Unit Price","Amount");
		System.out.printf("\t\t"+"+---------------------------+------------------+----------------------------+------------------+%n");
		System.out.printf("\t\t"+"|"+"\t"+"%-20s|"+"\t"+"%-15s|"+"\t"+"%-20s|"+"\t"+"%-15s|%n", "Short",pnumber,pprice,pamount);
		System.out.printf("\t\t"+"+---------------------------+------------------+----------------------------+------------------+%n");
		System.out.println();
		System.out.println("\t\t"+"________________________________________________________________________________________________");
		
		System.out.println("\n\n\n\n\n");
		double tlamount=amount+tamount+samount+pamount; 
		
		System.out.println("\t\t\t"+"+-------------------------------------------------------------------------------+");
		System.out.print("\t\t\t"+"|                                                                               |");
		System.out.print("\r\n			|	  									|\r\n			|	  ____  _ _ _    _____                                            	|\r\n 			|	 |  _ \\(_) | |  / ____|                                           	|\r\n			|	 | |_) |_| | | | (___  _   _ _ __ ___  _ __ ___   __ _ _ __ _   _	| \r\n			|	 |  _ <| | | |  \\___ \\| | | | \'_ ` _ \\| \'_ ` _ \\ / _` | \'__| | | |	|\r\n			|	 | |_) | | | |  ____) | |_| | | | | | | | | | | | (_| | |  | |_| |	|\r\n			|	 |____/|_|_|_| |_____/ \\__,_|_| |_| |_|_| |_| |_|\\__,_|_|   \\__, |	|\r\n			|	                                                             __/ |	|\r\n			|	                                                            |___/	| \r\n");
		System.out.println("\t\t\t"+"|                                                                               |");	
		System.out.println("\t\t\t"+"|                                                                               |");	
		System.out.println("\t\t\t"+"| "+" Customer : "+name+"\t\t\t\t"+" Date : "+date+"      |");
		System.out.println("\t\t\t"+"|                                                                               |");
		System.out.printf("\t\t\t"+"+---------------------+-----------------+---------------------+-----------------+%n");
		System.out.printf("\t\t\t"+"|"+"  "+"%-19s|"+"  "+"%-15s|"+"  "+"%-19s|"+"  "+"%-15s|%n", "Description","QTY","Unit Price","Amount");
		System.out.printf("\t\t\t"+"+---------------------+-----------------+---------------------+-----------------+%n");
		System.out.printf("\t\t\t"+"|"+"  "+"%-19s|"+"  "+"%-15s|"+"  "+"%-19s|"+"  "+"%-15s|%n", "T-Shirt",tnumber,tprice,amount);
		                                                                           
		System.out.printf("\t\t\t"+"|"+"  "+"%-19s|"+"  "+"%-15s|"+"  "+"%-19s|"+"  "+"%-15s|%n", "Trouser",trnumber,trprice,tamount);
		                                                                             
		System.out.printf("\t\t\t"+"|"+"  "+"%-19s|"+"  "+"%-15s|"+"  "+"%-19s|"+"  "+"%-15s|%n", "Shirt",snumber,sprice,samount);
		                                                                         
		System.out.printf("\t\t\t"+"|"+"  "+"%-19s|"+"  "+"%-15s|"+"  "+"%-19s|"+"  "+"%-15s|%n", "Short",pnumber,pprice,pamount);
		System.out.printf("\t\t\t"+"+---------------------+-----------------+---------------------+-----------------+%n");
		System.out.printf("\t\t\t"+"|"+"  "+"%-59s|"+"  "+"%-15s|%n","Total",tlamount);
		System.out.printf("\t\t\t"+"+-------------------------------------------------------------+-----------------+%n");
		                                                                             
	}
}
		
		
