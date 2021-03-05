import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.net.Socket;


public class Client  {
     public static void main(String[] args)  {
         try {
             Socket client = new Socket("192.168.0.18", 5002);
             BufferedReader keyboard=new BufferedReader(new InputStreamReader(System.in));

                 while (true) {
                     System.out.print("> ");
                     Communication.send(keyboard, client);
                     Communication.recieve(client);
                 }
         }catch (Exception e){
             System.out.println(e.getMessage());
         }

    }


}
