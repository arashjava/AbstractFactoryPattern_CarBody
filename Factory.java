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
public class Factory {
   public static CarBodyFactory getFactory(String item){
   
      if(item.equalsIgnoreCase("Door")){
         return new DoorFactory();
         
      }
      else if(item.equalsIgnoreCase("Window")){
         return new WindowFactory();
      }
      else if(item.equalsIgnoreCase("Frame")){
         return new FrameFactory();
      }   
      return null;
   }
}
