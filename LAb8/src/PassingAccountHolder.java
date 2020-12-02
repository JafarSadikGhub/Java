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
public class PassingAccountHolder 
{
     int Acc_num;
     int balance =0;
     PassingAccountHolder(int accNum, int accBal)
     {
         Acc_num = accNum;
         balance = accBal;
     }
     boolean isEqual(PassingAccountHolder o)
     {
         if(o.Acc_num == Acc_num && o.balance == balance)
         {
             return true;
         }
         else 
             return false;
     }
     PassingAccountHolder returningObject(int accNum, int accBal)
     {
         accBal = accBal -200;
         PassingAccountHolder dekhi = new PassingAccountHolder(accNum, accBal);
         return dekhi;
     }
     public String toString()
     {
         return Acc_num + " " + balance;
     }
}
