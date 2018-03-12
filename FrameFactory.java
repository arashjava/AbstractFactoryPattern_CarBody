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
public class FrameFactory extends CarBodyFactory{

    @Override
    FrameInt getFrame(String item) {
      if(item.equalsIgnoreCase("Front")){
         return new Front();
         
      }else if(item.equalsIgnoreCase("Rest")){
         return new Rest();
         
      }else if(item.equalsIgnoreCase("Back")){
         return new Back();
      }
      return null;
    }

    @Override
    DoorInt getDoor(String item) {
        return null;
    }

    @Override
    WindowInt getWindow(String irem) {
        return null;
    }

  
}
