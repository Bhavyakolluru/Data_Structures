class Box
{
		double width;
		double height;
		double depth;
		

	}
	class BoxDemo
	{
		public static void main(String args[])
		{
			Box mybox=new Box();
			double vol;
			mybox.width=15;
			mybox.height=20;
			mybox.depth=10;
			vol=mybox.width*mybox.height*mybox.depth;
			System.out.println("Volume is"+vol);
			
		
	}

}