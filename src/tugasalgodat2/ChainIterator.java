/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasalgodat2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author zakkizuboys
 */
public class ChainIterator implements Iterator {

    private ChainNode nextNode;
    private ChainNode firstNode;

    public ChainIterator() {
        nextNode = firstNode;
    }

    public boolean hasNext() {
        return nextNode != null;
    }

    public Object next() {
        if (nextNode != null) {
            Object elementToReturn = nextNode.elemet;
            nextNode = nextNode.next;
            return elementToReturn;
        } else {
            throw new NoSuchElementException("No next element");
        }

    }

    public void remove() {
        throw new UnsupportedOperationException("remove not supported");
    }

}
