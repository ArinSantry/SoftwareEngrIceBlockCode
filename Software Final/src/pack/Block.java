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
public class Block {
    
    protected String blockName;
    protected String blockType;
    
    public Block()
    {
        blockName = "block";
        blockType = "generic";
    }
    
    public String getBlockName()
    {
        return blockName;
    }
    
    public String getBlockType()
    {
        return blockType;
    }
    
}
