/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextArea;


//Implement saving from file menu and saving from 


/**
 *
 * @author Jeremiah
 */
public class Session {
    
   // private String currentDate = new SimpleDateFormat("'Session-'MMdd-hhmm").format(new Date());
    private File parentDir = new File(System.getProperty("user.dir")); 
    private File codeDir = new File(parentDir + "\\Programs");
    private String currentFilePath = "";
    private String currentFile = codeDir.getPath() + "\\Session";
    
    public void saveSession(JTextArea textArea){
        if(!codeDir.exists()){
            codeDir.mkdir();
        }
        File newFile = new File(currentFile + ".java");   
        BufferedWriter outFile = null;
        try {
            outFile = new BufferedWriter(new FileWriter(newFile));
            textArea.write(outFile);
            setCurrentFilePath(newFile);
        } 
        catch (IOException ex) {
            ex.printStackTrace();
        }
        finally {
            if (outFile != null) {
                try {
                    outFile.close();
                } catch (IOException e) {
                    // leaving blank for now
                }
            }
    
        }
    }
    public String getCurrentFilePath(){
        return currentFilePath;
    }
    
    public File getCodeDir() {
        return codeDir;
    }

    public String getCurrentFile() {
        return currentFile;
    }

    //public String getCurrentDate() {
    //    return currentDate;
    //}
    
    
    private void setCurrentFilePath(File file){
        this.currentFilePath = file.getPath();
    }
}
