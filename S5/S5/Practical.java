class Paper{
	int length,width;
	String text;
}

class Document{

	String name;
	Paper p;
	public static void main(String[] args){
		Document d1=new Document();
		System.out.println("qwerty");
		d1.name="My First";
		System.out.println("this is = "+d1.name);
		Document d2=new Document();
		d2.name="My Second";
		System.out.println("this is = "+d2.name);
	}
}