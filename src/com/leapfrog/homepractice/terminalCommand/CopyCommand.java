/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.homepractice.terminalCommand;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author AM3ET
 */
public class CopyCommand extends DosCommands {

    @Override
    public void execute(String[] token) {

        if (token.length > 2) {
            try {
                FileInputStream iS = new FileInputStream(token[1]);
                FileOutputStream oS = new FileOutputStream(token[2]);
                
                byte[] data = new byte[1024];
                int i =0;
                while((i=iS.read(data))!=-1){
                   oS.write(data, 0, i);
                }
                oS.close();
                iS.close();
            } catch (IOException ioe) {
                System.out.println(ioe);
            }
        } else {
            System.out.println("Invalid command");
        }
    }
}
