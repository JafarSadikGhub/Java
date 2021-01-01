/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JrBcrypted
*  Md. Jafar Sadik
*  ID: 1620660042
 */
public class RGB 
{
  private int red, green, blue;
  RGB(int red, int green, int blue)
  {
      this.red = red;
      this.green = green;
      this.blue = blue;
  }
  @Override
  public String toString()
  {
      return "R = <" + this.red + ">, G = <" + this.green + ">, B = <" + this.blue + ">";
  }
}
