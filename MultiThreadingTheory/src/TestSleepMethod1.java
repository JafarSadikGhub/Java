
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JrBcrypted Md. Jafar Sadik ID: 1620660042
 */
public class TestSleepMethod1 extends Thread
{

    @Override
    public void run()
    {
        for (int i = 1; i < 5; i++)
        {

            try
            {
                Thread.sleep(500);
                System.out.println(i);

            } catch (InterruptedException ex)
            {
                Logger.getLogger(TestSleepMethod1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[] args)
    {
        TestSleepMethod1 t1 = new TestSleepMethod1();
        TestSleepMethod1 t2 = new TestSleepMethod1();
        t1.start();
        t2.start();
    }
}
