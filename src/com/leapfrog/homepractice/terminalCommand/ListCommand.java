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
public class ListCommand extends DosCommands {

    @Override
    public void execute(String[] token) {
        
        String workingDir = System.getProperty("user.dir");
        File dir = new File(workingDir);
        System.out.println("Directory of "+workingDir);
        System.out.println("");
        int count_D = 0, count_f = 0;
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            File filename = files[i];
            if (filename.isDirectory()) {
                count_D++;
            } else if (filename.isFile()) {
                count_f++;
            }
            System.out.println(filename);
        }
        System.out.println("");
        System.out.println(count_f+ " File(s)");
        System.out.println(count_D+" Dir(s)"+ dir.getFreeSpace()+" bytes free");

    }
}
