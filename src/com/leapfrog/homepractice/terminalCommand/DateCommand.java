/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.homepractice.terminalCommand;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author AM3ET
 */
public class DateCommand extends DosCommands {

    @Override
    public void execute(String[] token) {

        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy/MM/dd 'at' hh:mm:ss a zzz");
        System.out.println("Current Date: " + ft.format(date));
    }
}
