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
public class RDCommand extends DosCommands {

    @Override
    public void execute(String[] token) {

        if (token.length > 1) {
            File file = new File(token[1]);
            file.delete();
        } else {
            System.out.println("Invalid command");
        }
    }
}
