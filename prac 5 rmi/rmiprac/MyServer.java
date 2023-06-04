import java.rmi.*;  
import java.rmi.registry.*;  
public class MyServer
{  
	public static void main(String args[])
	{  
		try
		{  
			Concat stub=new ConcatRemote();  
			Naming.rebind("localhost",stub);  
		}
		catch(Exception e)
		{
			System.out.println(e);
		}  
    	}  
}  
