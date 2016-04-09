

import java.net.*;
import java.io.*;

public class EncodingServer extends Thread
{
	private ServerSocket serverSocket;

	//Constructor to initialize serverSocket and socket timeout period
	public EncodingServer(int port) throws IOException
	{
		serverSocket = new ServerSocket(port);
		serverSocket.setSoTimeout(100000);
	}

	public void run()
	{
		while(true)
		{
			try
			{	
				System.out.println(); 
				System.out.println("Waiting for client on port "+ serverSocket.getLocalPort());
				System.out.println();

				//Called when Client requests a connection
				Socket server = serverSocket.accept();
				System.out.println("Connected to "+ server.getRemoteSocketAddress());
				System.out.println();
				DataInputStream in = new DataInputStream(server.getInputStream());
				String inputData = in.readUTF();

				//Retrieving data input
				char[] charArray = inputData.toCharArray();

				//Retrieving flag that is last character
				char flag= charArray[charArray.length-1];
				System.out.println("Requested Encoding Flag :" +flag);

				if(flag=='E'){
					//Encoding Logic
					System.out.println("Encoding Input");
					for(int i=0; i<charArray.length -1; i++){
						charArray[i]=(char) ((charArray[i]+1)%256);
					}

				}
				else{
					//Decoding Logic
					System.out.println("Decoding Input");
					for(int i=0; i<charArray.length -1; i++){
						if (charArray[i]-1>=0)
							charArray[i]=(char) (charArray[i]-1);
						else
							charArray[i]=(char) 256;
					}
				}

				System.out.println();

				//Sending Output
				String serveroutput = new String(charArray);
				System.out.println("Sending Output String : "+serveroutput.substring(0, serveroutput.length()-1));
				DataOutputStream out = new DataOutputStream(server.getOutputStream());
				out.writeUTF(serveroutput);
				//Closing Connection
				server.close();
			}catch(SocketTimeoutException s)
			{
				System.out.println("Socket timed out - Shutting Down Server");
				break;
			}catch(IOException e)
			{
				System.out.println("IO Error Occured, Please try again!!!");
				break;
			}
		}
	}
	public static void main(String [] args)
	{
		System.out.println("Server Started.");
		int port =8089;
		//Starting New Thread
		try
		{
			Thread t = new EncodingServer(port);
			t.start();
		}catch(IOException e)
		{
			System.out.println("IO Error Occured, Please try again!!!");
		}
	}
}