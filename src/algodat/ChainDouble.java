
package algodat;

import tugasalgodat2.LinearList;

public class ChainDouble implements LinearList{
    
    protected ChainNodeDouble firstNode;
    protected int size;
    
    public ChainDouble(int initialcapacity){
        
    }
    public ChainDouble(){
        this(0);
    }
    
    
    public boolean isEmpty() {
        return size == 0;
    }

    
    public int size() {
        return size;
    }

    public void checkIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException(
            "index = "+ index + " size = "+size);
        }
    }
    
    public Object get(int index) {
        checkIndex(index);
        
        ChainNodeDouble currentNode = firstNode;
        for(int i = 0; i < index; i++){
            currentNode = currentNode.next;
        }
        return currentNode.element;
    }

    
    public int indexOf(Object theElement) {
        ChainNodeDouble currentNode = firstNode;
        int index = 0;
        while(currentNode != null && !currentNode.element.equals(theElement)){
            currentNode = currentNode.next;
            index++;
        }
        if(currentNode == null){
            return -1;
        }
        else{
            return index;
        }
    }

    
    public Object remove(int index) {
        checkIndex(index);
        Object removedElement;
        if(index == 0){
            removedElement = firstNode.element;
            firstNode = firstNode.next;
        }
        else{
            ChainNodeDouble q = firstNode;
            for(int i = 0; i<index-1; i++){
                q = q.next;
            }
            removedElement = q.next.element;
            q.next = q.next.next;
        }
        size--;
        return removedElement;
    }
    
    public void add(int index, Object theElement) {
        if (index < 0 ||index > size){
            throw new IndexOutOfBoundsException("index = "+ index+" size = "+size);
        }
        if(index == 0){
            firstNode = new ChainNodeDouble(theElement, firstNode);
        }
        else{
            ChainNodeDouble p = firstNode;
            for(int i = 0; i < index - 1; i++){
                p = p.next;
            }
            p.next = new ChainNodeDouble(theElement, p.next);
        }
        size++;
    }
    
    
    public String toString(){
        StringBuffer s = new StringBuffer("[");
        
        ChainNodeDouble currentNode = firstNode;
        while(currentNode != null){
            if(currentNode.element == null){
                s.append("null, ");
            }
            else{
                s.append(currentNode.element.toString()+", ");
            }
            currentNode = currentNode.next;
        }
        if(size>0){
            s.delete(s.length() - 2, s.length());
        }
        s.append("]");
        
        return new String(s);
    }

}
