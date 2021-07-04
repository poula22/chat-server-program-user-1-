/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanconnection;

import frames.LanConnectionFrame;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author george
 */
public class ConnectionHandler implements Runnable{
    private Socket client;
    //----------
    private JTextField j1;
    private JTextArea a1;
    private boolean write=false;
    //-----------
    public ConnectionHandler(Socket client1){
        client=client1;
//        //------
//        j1=j;
//        a1=a;
//        //-------
    }
    //--------

    public void setWrite(boolean write) {
        this.write = write;
    }

    public void setClient(Socket client) {
        this.client = client;
    }  

    public void setJ1(JTextField j1) {
        this.j1 = j1;
    }

    public void setA1(JTextArea a1) {
        this.a1 = a1;
    }
    
    //---------

    @Override
    public void run() {
        //Scanner keyboard=new Scanner(System.in);
//        try(InputStream clientInput=client.getInputStream();
//                            OutputStream clientOutput=client.getOutputStream();
//                            Reader r=new InputStreamReader(clientInput);
//                            BufferedReader i=new BufferedReader(r);
//                            PrintStream o=new PrintStream(clientOutput);
//                            ){
        if(j1.isEnabled()==false){
            a1.setText("");
            j1.setEnabled(true);
        }
        
        try{
            InputStream clientInput=client.getInputStream();
                            Reader r=new InputStreamReader(clientInput);
                            BufferedReader i=new BufferedReader(r);
                            
                       
                        while(true){
                            String s=i.readLine();
                           // System.out.println(s);
                            //-------
                            a1.append(s+"\n");
                            //-------
                            if(s.toLowerCase().trim().contains("bye")){
                                //System.out.println("server: bye");
                                //-------
                            a1.append(s+"\n");
                            //-------
                                break;
                            }
                            //System.out.print("server: ");
                            //-------
                            
                            
                            
                           
                            //-------
                            /*if(keyboard.hasNext()){
                            String out=keyboard.nextLine();
                            o.println(out);
                            }
                            else{
                                o.println("no responde");
                            }*/
                        }
                    } catch (IOException ex) {
            Logger.getLogger(ConnectionHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void writes(){
        OutputStream clientOutput;
        try {
            clientOutput = client.getOutputStream();
            PrintStream o=new PrintStream(clientOutput);
            String out=j1.getText();
            a1.append("server: "+out+"\n");
            o.println(out);
            j1.setText("");
        } catch (IOException ex) {
            Logger.getLogger(ConnectionHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
