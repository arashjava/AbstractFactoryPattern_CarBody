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
public class FrontWindow implements WindowInt{

    @Override
    public void makeFrame() {
        System.out.println("Front window frame is built.");
    }

    @Override
    public void makeGlass() {
        System.out.println("Front window glass is made.");
    }


    
}
