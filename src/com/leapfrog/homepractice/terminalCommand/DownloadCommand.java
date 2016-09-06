/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.homepractice.terminalCommand;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author AM3ET
 */
public class DownloadCommand extends DosCommands {

    @Override
    public void execute(String[] token) {

        if (token.length > 1) {
            try {
                String link = token[1];
                URL url = new URL(link);
                URLConnection conn = url.openConnection();
                InputStream iS = conn.getInputStream();
                
                String[] fileToken = link.split("/");
                FileOutputStream oS = new FileOutputStream(fileToken[fileToken.length-1]);
                
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
