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
public class ExtendedChain extends Chain implements ExtendedLinearList {

    protected ChainNode lastNode;

    @Override
    public void clear() {
        firstNode = lastNode = null;
        size = 0;
    }
    
    public void add(Object theElement){
        ChainNode y = new ChainNode(theElement, null);
        if(firstNode == null){
            firstNode = lastNode = y;
        }else{
            lastNode.next = y;
            lastNode = y;
        }
        size++;
    }
    
    public Object remove(int index){
        return null;
}
        
    public void add(int index, Object theElement){}

    @Override
    public void append(Object theElement) {}

}
