package com.leapfrog.homepractice;

import com.leapfrog.homepractice.terminalCommand.CommandFactory;
import com.leapfrog.homepractice.terminalCommand.DosCommands;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//CD,COPY,MD,DIR,DATE,DOWNLOAD,RD,REN,MOVE
public class Program {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line="";
                System.out.print(">");            
            while (!(line = reader.readLine()).equalsIgnoreCase("Exit")) {
                System.out.print(">");
                String[] token = line.split(" ");
                DosCommands cmd = CommandFactory.get(token[0]);
                if(cmd!=null){
                    cmd.execute(token);
                }else{
                    System.out.println("Command not found");
                }
            }
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

}
