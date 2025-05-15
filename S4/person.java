public class person{
private String name;

//getter
public String getName(){
	return name;
}

//Setter
public void setName(String newName){
	this.name=newName;
}
}
public class Main 
{
	public static void main(String args [])
	{
		person p1=new person();
		p1.setName("hh");
		System.out.println(p1.getName());
	}
}