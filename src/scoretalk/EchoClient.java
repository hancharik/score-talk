/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoretalk;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
    
    
    
    
    
    
    
    
  public EchoClient(String host, int port) throws IOException {
       
 
      
      
   // if (args.length != 2) {
   //   System.err.println("Usage: java EchoClient <host name> <port number>");
   //   System.exit(1);
  //  }
    
    scoretalk.TestTTS.frank.sayWords("computer started. hello captain." );
    
    // we use a string here to allow for urls, slashes, etc
    String hostName = host;//"127.0.0.1" ;
    // a port will always be an int 1-65
    int portNumber = port;//8008;
    
   
    
    
    try (Socket echoSocket = new Socket(hostName, portNumber);
      PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
      BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
      BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in))) {
      String userInput;
      while ((userInput = stdIn.readLine()) != null) {
        out.println(userInput);
        String response = in.readLine();
	System.out.println( response);
         scoretalk.TestTTS.frank.sayWords(response );
        //frank.sayWords(in.readLine());
       //  jill.sayWords(in.readLine());
      }
    }catch (UnknownHostException e) {
       System.err.println("Don't know about host " + hostName);
       System.exit(1);
    }catch (IOException e) {
       System.err.println("Couldn't get I/O for the connection to " + hostName);
       System.exit(1);
      } 
    
    
 
    
    
  }  // end main
} // end class


