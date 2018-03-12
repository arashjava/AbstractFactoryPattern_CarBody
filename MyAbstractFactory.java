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
public class MyAbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      CarBodyFactory doorFactory = Factory.getFactory("Door");

      DoorInt door1 = doorFactory.getDoor("SideDoor");
      door1.makeDoor();
      door1.makeHole();

      DoorInt door2 = doorFactory.getDoor("Hood");
      door2.makeDoor();
      door2.makeHole();
      
      DoorInt door3 = doorFactory.getDoor("Trunk");
      door3.makeDoor();
      door3.makeHole();
      
      CarBodyFactory windowFactory = Factory.getFactory("Window");
      
      WindowInt window1 = windowFactory.getWindow("FrontWindow");
      window1.makeFrame();
      window1.makeGlass();
      
      WindowInt window2 = windowFactory.getWindow("SideWindow");
      window2.makeFrame();
      window2.makeGlass();
      
      WindowInt window3 = windowFactory.getWindow("BackWindow");
      window3.makeFrame();
      window3.makeGlass();
      
      CarBodyFactory frameFactory = Factory.getFactory("Frame");
      
      FrameInt frame1 = frameFactory.getFrame("Front");
      frame1.makeFrame();
      frame1.makeHole();
      
      FrameInt frame2 = frameFactory.getFrame("Rest");
      frame2.makeFrame();
      frame2.makeHole();
      
      FrameInt frame3 = frameFactory.getFrame("Back");
      frame3.makeFrame();
      frame3.makeHole();
    }
    
}
