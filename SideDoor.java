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
public class SideDoor implements DoorInt{

    @Override
    public void makeHole() {
          System.out.println("Side door hole is done.");
    }

    @Override
    public void makeDoor() {
          System.out.println("Side door is built.");
    }


    
}
