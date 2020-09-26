class Box{
	double width;
	double height;
	double depth;
	void volume()
	{
		System.out.println("Volume is");
		System.out.println(width*height*depth);
	}
}
class BoxDemo1{
	public static void main(String args[])
	{
		Box mybox1=new Box();
		Box mybox2=new Box();
		double vol;
		mybox1.width=10;
		mybox1.height=15;
		mybox1.depth=20;
		
		mybox2.width=40;
		mybox2.height=21;
		mybox2.depth=73;
		vol=mybox1.width*mybox1.height*mybox1.depth;
		System.out.println(vol);
		vol=mybox2.width*mybox2.height*mybox2.depth;
		System.out.println(vol);
		
		
	}
}
