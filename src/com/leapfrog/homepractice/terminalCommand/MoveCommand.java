/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.homepractice.terminalCommand;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author AM3ET
 */
public class MoveCommand extends DosCommands {

    @Override
    public void execute(String[] token) {

        if (token.length > 2) {
            try {
                File source = new File(token[1]);
                File target = new File(token[2]);
                Files.move(source.toPath(), target.toPath(), StandardCopyOption.REPLACE_EXISTING);
                
            } catch (IOException ioe) {
                System.out.println(ioe);
            }
        } else {
            System.out.println("Invalid command");
        }
    }
}
