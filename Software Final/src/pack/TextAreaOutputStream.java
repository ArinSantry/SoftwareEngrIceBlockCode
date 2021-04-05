/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Jeremiah
 */
public class TextAreaOutputStream extends OutputStream {
    private JTextArea textControl;

    public TextAreaOutputStream( JTextArea control ) {
        textControl = control;
    }

    public void write( int b ) throws IOException {
        // append the data as characters to the JTextArea control
        textControl.append( String.valueOf( ( char )b ) );
    }  
}
/**
public class TextFieldInputStream extends InputStream {
    private JTextField textControl;

    public TextFieldInputStream( JTextField control ) {
        textControl = control;
    }

    public int read() throws IOException {
        // append the data as characters to the JTextArea control
        String input = textControl.getText();
    }  
}
* **/