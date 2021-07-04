/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanconnection;

import frames.LanConnectionFrame;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author george
 */
public class LanConnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LanConnectionFrame.main(args);
//        Scanner keyboard=new Scanner(System.in);
//        try(ServerSocket server = new ServerSocket(7777);){
//            while(true){
//                    Socket client=server.accept();
//                    System.out.println("client connected");
//                    ConnectionHandler c=new ConnectionHandler(client);
//                    Thread t=new Thread(c);
//                    t.start();
//            }   
//    
//}
//        catch (IOException ex) {
//            Logger.getLogger(LanConnection.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
}

