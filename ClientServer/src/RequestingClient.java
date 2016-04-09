

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class RequestingClient
{
   public static void main(String [] args)
   {
      String serverName = "localhost";
      int port = 8089;
      try
      {
    	 //Input String
    	 System.out.println("Enter String to be Encoded/Decoded : ");    	 
    	 BufferedReader dataReader = new BufferedReader(new InputStreamReader(System.in));
    	 String inputData = dataReader.readLine();
    	 
    	 // Repeat in case of Invalid String
    	 while (inputData==null||inputData.length()==0){
    		 System.out.println("Please enter a valid String ");    	 
        	 dataReader = new BufferedReader(new InputStreamReader(System.in));
        	 inputData = dataReader.readLine();
    		 
    	 }
    	 
    	 //Flag Input
    	 System.out.println("Press E to Encode or D to Decode the String : (E/D)");
    	 Scanner optionScanner= new Scanner(System.in);
    	 char encodingFlag = optionScanner.next().charAt(0);
    	 // Repeat in case of Invalid flag
    	 while (encodingFlag!='E' && encodingFlag!='D'){
    		 System.out.println("Please enter a valid Flag - E to Encode or D to Decode the String : (E/D) ");    	 
    		optionScanner= new Scanner(System.in);
        	 encodingFlag = optionScanner.next().charAt(0);
    	}
    	 //Prepare String To send
    	 String toSend = inputData + encodingFlag; 	 
    	 
    	 System.out.println();    	 
    	 System.out.println("Connecting to Server :" + serverName);
         System.out.println("Connecting on port " + port);
         
         //Creating new Socket
         Socket client = new Socket(serverName, port);
         System.out.println("Connected to " + client.getRemoteSocketAddress());
         System.out.println();    
         OutputStream outToServer = client.getOutputStream();
         DataOutputStream out = new DataOutputStream(outToServer);
         
         //Writing Data to output Stream
         System.out.println("Sending Data...");
         out.writeUTF(toSend);
         
         //Collecting input
         InputStream inFromServer = client.getInputStream();
         DataInputStream in = new DataInputStream(inFromServer);
         String serverOutput= in.readUTF();
         
         if(encodingFlag=='E'){
         System.out.println("Encoded String Received From Server : " + serverOutput.substring(0, serverOutput.length()-1));
         }
         else{
         System.out.println("Decoded String Received From Server : " + serverOutput.substring(0, serverOutput.length()-1)); 
         }
         //Closing Connection
         client.close();
         
      }catch(IOException e)
      {
         System.out.println("IO Error Occured, Please try again!!!");
      }
   }
}