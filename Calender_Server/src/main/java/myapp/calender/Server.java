/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp.calender;
import java.io.*;
import java.net.*;
import java.util.*;
import java.text.*;
/**
 *
 * @author x21119210-Zhongjie Xie
 */
public class Server{
    private static ArrayList<Event> events = new ArrayList<>();
    private static boolean shouldRun = true;
    
    public static void main(String[] args) throws IOException{
        int portNumber = 9190;
        
        try(ServerSocket serverSocket = new ServerSocket(portNumber)){
            System.out.println("Server is running!");
            
            while(shouldRun){
                Socket clientSocket = serverSocket.accept();
                Thread thread = new Thread(new ClientHandler(clientSocket));
                thread.start();
            }
            serverSocket.close();
        }catch(IOException e){
            System.err.println("Couldn't listen on port " + portNumber);
            System.exit(-1);
        }
    }
    
    private static class ClientHandler implements Runnable{
        private Socket clientSocket;
        
        public ClientHandler(Socket socket){
            this.clientSocket = socket;
        }
        
        public void run(){
            try(
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));
            ){
                String inputLine;
                
                while((inputLine = in.readLine()) != null){
                    if(inputLine.equals("STOP")){
                        out.println("TERMINATE");
                        shouldRun = false;
                        break;
                    }
                    if(inputLine.startsWith("add")){
                        try{
                            Event event = parseEvent(inputLine.substring(3));
                            events.add(event);
                            out.println(getUpcomingEvents());
                        }catch(IncorrectActionException e){
                            out.println(e.getMessage());
                        }
                    }else if(inputLine.startsWith("remove")){
                        try{
                            int eventId = Integer.parseInt(inputLine.substring(7));
                            events.removeIf(event -> event.getId() == eventId);
                            out.println(getUpcomingEvents());
                        }catch(NumberFormatException e){
                            out.println(e.getMessage());
                        }
                    }else{
                        out.println("Invaild operation!");
                    }
                }
                
                clientSocket.close();
                System.out.println("Client is disconnected.");
                System.exit(0);
            }catch(IOException e){
                System.err.println("Couldn't handle the client request.");
            }
        }
        
        private String getUpcomingEvents(){
            StringBuilder builder = new StringBuilder();
            
            for(Event event : events){
                if(event.isUpcoming()){
                    builder.append(event.toString()).append("; ");
                }
            }
            
            return builder.toString();
        }
        
        private Event parseEvent(String input) throws IncorrectActionException{
            String[] parts = input.split(",");
            
            if(parts.length != 3){
                throw new IncorrectActionException("Incorrect event description!");
            }
            
            String date = parts[0].trim();
            String time = parts[1].trim();
            String description = parts[2].trim();
            
            return new Event(date, time, description);
        }
    }
    
    private static class Event{
        private int id;
        private Date date;
        private String description;
        private static int lastId = 0;
        
        public Event(String date, String time, String description) throws IncorrectActionException{
            try{
                SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd hh:mm a", Locale.ENGLISH);
                this.date = format.parse(date + " " + time);
                this.description = description;
                lastId += 1;
                this.id = lastId;
            }catch(ParseException e){
                throw new IncorrectActionException("Incorrect format!");
            }
        }
        
        public boolean isUpcoming(){
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            calendar.add(Calendar.HOUR_OF_DAY, 24);
            Date tomorrow = calendar.getTime();
            
            return date.before(tomorrow);
        }
        
        public int getId(){
            return id;
        }
        
        public String toString(){
            SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd hh:mm a", Locale.ENGLISH);
            return id + ": " + format.format(date) + ", " + description;
        }
    }
    
    private static class IncorrectActionException extends Exception{
        public IncorrectActionException(String message){
            super(message);
        }
    }
}

