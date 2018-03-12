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
public class DoorFactory extends CarBodyFactory{

    @Override
    DoorInt getDoor(String item) {
      if(item.equalsIgnoreCase("SideDoor")){
         return new SideDoor();
         
      }else if(item.equalsIgnoreCase("Hood")){
         return new Hood();
         
      }else if(item.equalsIgnoreCase("Trunk")){
         return new Trunk();
      }
      return null;
    }

    @Override
    WindowInt getWindow(String irem) {
        return null;
    }

    @Override
    FrameInt getFrame(String irem) {
        return null;
    }
  
}
