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
public class CDCommand extends DosCommands {

    @Override
    public void execute(String[] token) {

        String workingDir = System.getProperty("user.dir");
        File Dir = new File(workingDir);
        if (token.length > 1) {
            File dir = new File(Dir+ "\\" +token[1]);
            if (dir.isDirectory()) {
                System.setProperty("user.dir", dir.toString());
                System.out.println(System.getProperty("user.dir"));
            } else {
                System.out.println("Directory doesnot exist");
            }
        }
    }
}
