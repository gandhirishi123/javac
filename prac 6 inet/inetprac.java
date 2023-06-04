import java.net.*;
public class inetprac {
	public static void main(String[] args)throws UnknownHostException
	    {
	        InetAddress address1 = InetAddress.getLocalHost();
	        System.out.println("InetAddress of Local Host : "+ address1);
	        
	        InetAddress ip=InetAddress.getByName("www.oracle.com");  
	        System.out.println("Host Name: "+ip.getHostName());  
	        System.out.println("IP Address: "+ip.getHostAddress());  
	       
	        InetAddress address2= InetAddress.getByName("www.google.com");
	        System.out.println("InetAddress of Named Host : "+ address2);
	        
	        InetAddress address3[]= InetAddress.getAllByName("www.amazon.in");
	        for (int i = 0; i < address3.length; i++) {
	            System.out.println(
	                "ALL InetAddresses of Named Host : "+ address3[i]);
	        }
	        
	        byte IPAddress[] = { 125, 0, 0, 1 };
	        InetAddress address4
	            = InetAddress.getByAddress(IPAddress);
	        System.out.println(
	            "InetAddresses of Host with specified IP Address : "
	            + address4);  
	       
	        byte[] IPAddress2
	            = { 105, 22, (byte)223, (byte)186 };
	        InetAddress address5 = InetAddress.getByAddress(
	            "gfg.com", IPAddress2);
	        System.out.println(
	            "InetAddresses of Host with specified IP Address and hostname : "
	            + address5);
	    }

}