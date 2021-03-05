
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Server {
    public static void main(String[] args)  {
        try{
            ServerSocket server= new ServerSocket(5002);
            Socket client=server.accept();
            BufferedReader keyboard=new BufferedReader(new InputStreamReader(System.in));

                while (true) {
                    System.out.print("> ");
                    Communication.recieve(client);
                    Communication.send(keyboard, client);

                }


        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }



}
