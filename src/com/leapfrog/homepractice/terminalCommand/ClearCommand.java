/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.homepractice.terminalCommand;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AM3ET
 */
public class ClearCommand extends DosCommands {

    @Override
    public void execute(String[] token) {
        try {
            Runtime.getRuntime().exec("clear");
        } catch (IOException ex) {
            Logger.getLogger(ClearCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
