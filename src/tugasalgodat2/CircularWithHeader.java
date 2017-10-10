/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasalgodat2;

/**
 *
 * @author zakkizuboys
 */
public class CircularWithHeader {
    protected ChainNode headerNode;

    public CircularWithHeader() {
        headerNode = new ChainNode();
        headerNode.next = headerNode;
    }
    
    public int indexOf(Object theElement){
        headerNode.elemet = theElement;
        ChainNode currentNode = headerNode.next;
        int index = 0;
        while(!currentNode.elemet.equals(theElement)){
            currentNode = currentNode.next;
            index++;
        }
        
        if(currentNode == headerNode){
            return -1;
        }else{
            return index;
        }
    }
    
    
}
