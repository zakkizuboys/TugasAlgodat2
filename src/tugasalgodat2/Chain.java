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
public class Chain implements LinearList {

    protected ChainNode firstNode;
    protected int size;

    public Chain(int initialCapacity) {
    }

    public Chain() {
        this(0);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index = " + index + "size = " + size);
        }
    }

    public Object get(int index) {
        checkIndex(index);
        ChainNode currentNode = firstNode;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.elemet;
    }

    @Override
    public int indexOf(Object elem) {
        ChainNode currentNode = firstNode;
        int index = 0;
        while (currentNode != null && !currentNode.elemet.equals(elem)) {
            currentNode = currentNode.next;
            index++;
        }
        if (currentNode == null) {
            return -1;
        } else {
            return index;
        }
    }

    @Override
    public Object remove(int index) {
        checkIndex(index);
        Object removeElement;
        if (index == 0) {
            removeElement = firstNode.elemet;
            firstNode = firstNode.next;
        } else {
            ChainNode q = firstNode;
            for (int i = 0; i < index - 1; i++) {
                q = q.next;
            }
            removeElement = q.next.elemet;
            q.next = q.next.next;

        }
        size--;
        return removeElement;
    }

    @Override
    public void add(int index, Object obj) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index = " + index + "size = " + size);
        }
        if (index == 0) {
            firstNode = new ChainNode(obj, firstNode);
        } else {
            ChainNode p = firstNode;
            for (int i = 0; i < index - 1; i++) {
                p = p.next;
            }
            p.next = new ChainNode(obj, p.next);
        }
        size++;
    }

    public String toString() {
        StringBuffer s = new StringBuffer("[");
        ChainNode currentNode = firstNode;
        while (currentNode != null) {
            if (currentNode.elemet == null) {
                s.append("null, ");
            } else {
                s.append(currentNode.elemet.toString() + ", ");
            }
            currentNode = currentNode.next;
        }
        if (size > 0) {
            s.delete(s.length() - 2, s.length());
        }
        s.append("]");
        return new String(s);
    }

}
