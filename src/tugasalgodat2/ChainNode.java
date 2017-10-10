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
public class ChainNode {
    Object elemet;
    ChainNode next;

    public ChainNode(Object elemet, ChainNode next) {
        this.elemet = elemet;
        this.next = next;
    }

    public ChainNode(Object elemet) {
        this.elemet = elemet;
    }

    public ChainNode() {
    }
}
