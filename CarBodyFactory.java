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
public abstract class CarBodyFactory {

   abstract DoorInt getDoor(String item);
   abstract WindowInt getWindow(String irem);
   abstract FrameInt getFrame(String irem);
    
}
