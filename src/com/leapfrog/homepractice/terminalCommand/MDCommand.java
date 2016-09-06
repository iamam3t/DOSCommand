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
public class MDCommand extends DosCommands {

    @Override
    public void execute(String[] params) {

        if (params.length > 1) {
            File file = new File(params[1]);
            file.mkdir();
        } else {
            System.out.println("Invalid command");
        }
    }
}
