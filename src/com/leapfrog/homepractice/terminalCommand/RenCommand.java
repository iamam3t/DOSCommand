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
public class RenCommand extends DosCommands {

    @Override
    public void execute(String[] token) {

        if (token.length > 2) {
            File f1 = new File(token[1]);
            File f2 = new File(token[2]);
            f1.renameTo(f2);
        } else {
            System.out.println("Invalid command");
        }
    }
}
