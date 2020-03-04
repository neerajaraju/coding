
 class E {
		int x;
		int y;
		int get(int p,int q)
		{
			x=p;
			y=q;
			return(0);
		}
	void show()
	{
	System.out.println(x);
	}
	}
	class D extends E
	{
		public static void main(String args[])
		{
			E aa;
			aa=new E();
			//B a=new B();
			//a.get(5,6);
			aa.get(5, 6);
			aa.show();
			aa=new D();
			aa.show();
			//a.display();
			
		}
		
	void show()
	{
		//super.show();
		System.out.println(y);
	}
	}


