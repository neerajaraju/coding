import java.io.*;
public class CharecterStream1 {
public static void main(String args[])
{
	try {
		File f=new File("pw4.java");
		FileReader f1=new FileReader(new File("pw3.txt"));
		FileWriter fout=new FileWriter(f);
		int i=0;
		while((i=f1.read())!=-1)
		{
			fout.write(i);
		}
		fout.close();
	}
	catch(Exception e) {
	}
}
}
