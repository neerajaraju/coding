interface School
{
	void teach();
}
class teacher implements School
{
	public void teach()
	{
		System.out.println("To teach");
	}
}
class stunt implements School
{
	public void teach()
	{
		System.out.println("Teaching");
	}
}
public class instance {
	public static void main(String args[])
	{
		School s[]=new School[2];
		s[0]=new teacher();
		s[1]=new stunt();
		for(int i=0;i<1;i++)
		{
			if (s[i] instanceof teacher)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}
	}

}
