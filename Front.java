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
public class Front implements FrameInt{

    @Override
    public void makeFrame() {
          System.out.println("Front frame is done.");
    }

    @Override
    public void makeHole() {
          System.out.println("Front frame hole is done.");
    }


    
}
