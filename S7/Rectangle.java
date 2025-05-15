class Rectangle{
	int width;
	int height;
	
	Rectangle(int height, int width){
		
		this.height=height;
		this.width=width;
		System.out.println("Create a Rectangle "+height+"*"+width);
		
		print(width,height);
	}
	
	void print(int width , int height){
	
	for (int i=0; i<height; i++){
			for(int j=0; j<width; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class Main{
	public static void main(String[] args){
		/* for(int i=0; i<10; i++){
		System.out.println("Value of i is = "+i);
		
		}
		//return 0; */
		Rectangle r1=new Rectangle(5,12);
		Rectangle r2=new Rectangle(15,12);
		Rectangle r3=r1;
		//Rectangle r3=new Rectangle(4,3);
		System.out.println("Height "+r1.height+" , width"+r1.width);
		System.out.println("Height "+r2.height+" , width"+r2.width);
		System.out.println("Height "+r3.height+" , width"+r3.width);
		
		r1.print(10,8);
		
		
	
	}
		
	}
