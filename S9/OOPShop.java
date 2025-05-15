class Item{
	String description;
	int unitprice;
	Item(String desc, int unitprice){
	description= desc;
	}
}

class Bascket{
	Item itm[5];
	void addItem(Item i){
	}
	void calculateprice(){
	
	};
}

class ShopDEMO{
	public static void main(String[] arg){
	Bascket bascket1=new Bascket();
	char input='Y';
	int i=0;
	do{
		String desc=sc.nextLine();
		int up=sc.nextInt();
		itemList[i]=new Item(desc,up);
		i++;
	}
	while();
 
 }
}