/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.homepractice.terminalCommand;

import java.io.File;

/**
 *
 * @author AM3ET
 */
public class CDBackCommand extends DosCommands {

    @Override
    public void execute(String[] token) {
        String workingDir = System.getProperty("user.dir");
        if (token.length == 1) {
            String replace = workingDir.replace('\\', '/');
            String[] tokens = replace.split("/");
            String path = tokens[0];
            for (int i = 1; i < tokens.length - 1; i++) {
                path = path + "\\" + tokens[i];
            }
            File file = new File(path);
            System.out.println(file);
            System.setProperty("user.dir", file.toString());
        }
    }
}
