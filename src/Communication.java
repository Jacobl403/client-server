import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public interface Communication {
    static void send(BufferedReader data, Socket dest) throws IOException {

        //print data to the socket
        PrintWriter input=new PrintWriter(dest.getOutputStream(),true);
        while(true){
            String message= data.readLine();
//            if (message.isBlank()){
//                break;
//            }
            input.println(message);

        }

    }

    static void recieve(Socket inc) throws  IOException{
        //read data from socket
        BufferedReader responde = new BufferedReader(new InputStreamReader(inc.getInputStream()));
        String message=responde.readLine();
        while (true){
//            if (message.isBlank()){
//                break;
//            }
            System.out.println("client : "+message);
            message=responde.readLine();

        }



    };
}
