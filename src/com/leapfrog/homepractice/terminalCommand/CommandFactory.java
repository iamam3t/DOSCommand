package com.leapfrog.homepractice.terminalCommand;

public class CommandFactory {
   public static DosCommands get(String cmd){
       if(cmd.equalsIgnoreCase("md")){
           return new MDCommand();
       }else if(cmd.equalsIgnoreCase("rd")){
           return new RDCommand();
       }else if(cmd.equalsIgnoreCase("copy")){
           return new CopyCommand();
       }else if(cmd.equalsIgnoreCase("download")){
           return new DownloadCommand();
       }else if(cmd.equalsIgnoreCase("dir")){
           return new ListCommand();
       }else if(cmd.equalsIgnoreCase("ren")){
           return new RenCommand();
       }else if(cmd.equalsIgnoreCase("move")){
           return new MoveCommand();
       }else if(cmd.equalsIgnoreCase("date")){
           return new DateCommand();
       }else if(cmd.equalsIgnoreCase("cd")){
           return new CDCommand();
       }else if(cmd.equalsIgnoreCase("cd..")){
           return new CDBackCommand();
       }else if(cmd.equalsIgnoreCase("cd\\")){
           return new CDRootCommand();
       }
       return null;
   } 
}
