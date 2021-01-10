/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package seller;

import java.util.ArrayList;

/**
 *
 * @author JrBcrypted
*  Md. Jafar Sadik
*  ID: 1620660042
 */
public class BusModify 
{
      private ArrayList<Bus> busList = new ArrayList<>();
      
      BusModify(ArrayList<Bus> busList)
      {
          this.busList = busList;
      }
      
      public void addBus(Bus bus)
      {
          busList.add(bus);
      }
      public void removeBus(Bus bus)
      {
          busList.remove(bus);
      }
      
}
