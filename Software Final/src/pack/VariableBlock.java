/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

/**
 *
 * @author Arin
 */
public class VariableBlock extends Block {
    
    protected String blockValueString;
    
    public VariableBlock()
    {
        super();
        blockType = "variable";
        blockValueString = "empty";
    }
    
    public void setValueString(String val)
    {
        blockValueString = val;
    }
    
    public String getValueString()
    {
        return blockValueString;
    }
    
}
