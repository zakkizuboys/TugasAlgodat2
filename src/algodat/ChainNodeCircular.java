
package algodat;

public class ChainNodeCircular {
    Object element;
    ChainNodeCircular next;
    ChainNodeCircular last;
    
    ChainNodeCircular(){
        
    }
    ChainNodeCircular(Object Element){
        this.element = element;
    }

    public ChainNodeCircular(Object element, ChainNodeCircular next) {
        this.element = element;
        this.next = next;
    }

    public void setLast(ChainNodeCircular last) {
        this.last = last;
    }
}
