/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author arash
 */
public class Hood implements DoorInt{


    @Override
    public void makeHole() {
         System.out.println("Hood hole is done.");
    }

    @Override
    public void makeDoor() {
         System.out.println("Hood door is built.");
    }
  
}
