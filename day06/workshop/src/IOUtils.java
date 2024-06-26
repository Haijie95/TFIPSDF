package workshop.src;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class IOUtils {
    public static void write(Socket socket,String payload) throws Exception {
        
        //get the output stream
        OutputStream os =socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(os);
        DataOutputStream dos = new DataOutputStream(bos);

        dos.writeUTF(payload);
        dos.flush();

        // dos.close();
        // bos.close();
        // os.close();
    }

    public static String read(Socket socket) throws Exception {
        //get the input stream
        InputStream is=socket.getInputStream();
        BufferedInputStream bis= new BufferedInputStream(is);
        DataInputStream dis = new DataInputStream(bis);

        String payload =dis.readUTF();
        System.out.printf("%s\n",payload);
        
        // dis.close();
        // bis.close();
        // is.close();

        return payload;

    }
    
}
