import java.util.Scanner;
class ShopDemo{
	
	static String description[]={"Bread","Milk Powder","Tooth Paste"};
	static int unitprice[]={160,1060,260};
	static Scanner sc=new Scanner(System.in);
	static byte[] itemBacketIndex=new byte[3];
	static int[] itemBacketQuantity=new int[3];
	static int BascketIndex=0;
	static void getItems() {
		System.out.println("Welcome to demo shop");
		System.out.println("Please select your item by entering the number");
		char userOption='Y';
		
		
		do {for(int i=0; i<description.length; i++){
			System.out.println("Enter "+i+" For "+description[i]);
		}
		int itemIndex=sc.nextInt();
		System.out.println("You have choosen "+description[itemIndex]);
		/*int itemIndex=sc.nextInt();*/
		System.out.println("Item Price "+description[itemIndex]+" is "+unitprice[itemIndex]);
		
		int numberofunits=sc.nextInt();
		itemBacketIndex[BascketIndex]=(byte)itemIndex;
		itemBacketQuantity[BascketIndex]=numberofunits;
		BascketIndex++;
		
		System.out.println("Enter Y to continue, press any character to Exit");
		Scanner scl=new Scanner(System.in);
		userOption=scl.nextLine().charAt(0);
		
		}
		while(userOption=='Y' && BascketIndex<3);
	}
	static void showBascket(){
		System.out.println("No \t Item \t Unit \t Price \t Quantity \t Price");
		for(int i=0; i < BascketIndex; i++){
			System.out.println((i+1)+"\t"+description[itemBacketIndex[i]]+"\t"+unitprice[itemBacketIndex[i]]+"\t"+
			itemBacketQuantity[i]+"\t"+unitprice[itemBacketIndex[i]]*itemBacketQuantity[i]);
		}
	}
	
	public static void main(String[] args){
		ShopDemo shop=new ShopDemo();
		shop.getItems();
		showBascket();
	}
}