
class Box{
	double width;
	double height;
	
	
	double volume()
	{
		
		return width*height;
	}
}
class BoxDemo2{
	public static void main(String args[])
	{
		Box mybox1=new Box();
		Box mybox2=new Box();
		double vol;
		mybox1.width=10;
		mybox1.height=15;
		
		
		mybox2.width=40;
		mybox2.height=21;
		
		vol = mybox1.volume();
		System.out.println(vol);
		vol = mybox2.volume();
		System.out.println(vol);
		
		
	}
}
