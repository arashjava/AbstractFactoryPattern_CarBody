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
public class WindowFactory extends CarBodyFactory{

    @Override
    WindowInt getWindow(String item) {
      if(item.equalsIgnoreCase("FrontWindow")){
         return new FrontWindow();
         
      }else if(item.equalsIgnoreCase("SideWindow")){
         return new SideWindow();
         
      }else if(item.equalsIgnoreCase("BackWindow")){
         return new BackWindow();
      }
      return null;
    }

    @Override
    DoorInt getDoor(String item) {
        return null;
    }

    @Override
    FrameInt getFrame(String irem) {
        return null;
    }


  
}
