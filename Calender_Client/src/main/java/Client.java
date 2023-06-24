/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.net.*;
import java.util.Scanner;
/**
 *
 * @author x21119210_Zhongjie Xie
 */
public class Client{
    public static void main(String[] args) throws IOException{
        String hostName = "localhost";
        int portNumber = 9190;
        
        try(
            Socket clientSocket = new Socket(hostName, portNumber);
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                new InputStreamReader(clientSocket.getInputStream()));
            Scanner scanner = new Scanner(System.in);
        ){
            System.out.println("Connected to server.");
            String userInput;
            
            while(true){
                System.out.println("> ");
                userInput = scanner.nextLine();
                out.println(userInput);
                
                String serverResponse = in.readLine();
                System.out.println(serverResponse);
            
            if(serverResponse.equals("TERMINATE")){
                System.out.println("Connection terminated.");
                break;
            }
            
            if(userInput.startsWith("remove")){
                String[] parts = userInput.substring(6).split(",");
                if(parts.length != 3){
                    System.out.println("Incorrect event description!");
                }
                else{
                    System.out.println("Event removed: " + parts[0].trim() + ", " + parts[1].trim() + ", " + parts[2].trim());
                }
            }
        }
    }catch(UnknownHostException e){
        System.err.println("Don't know about host " + hostName);
        System.exit(1);
    }catch(IOException e){
        System.err.println("Couldn't get I/O for the connection to " +
            hostName);
        System.exit(1);
        }
    }
}
