
public class Chat
{

    boolean flag = false;

    public synchronized void Question(String msg)
    {
        if (flag)
        {
            try
            {
                wait();

            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println(msg);
        flag = true;
        notifyAll();
    }

    public synchronized void Answer(String msg)
    {
        if (!flag)
        {
            try
            {
                wait();
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println(msg);
        flag = false;
        notifyAll();
    }
}

class T1 implements Runnable
{

    Chat m;
    String[] s1 =
    {
        "1Hi", "1Asho", "1Jao"
    };

    public T1(Chat m1)
    {
        this.m = m1;
        new Thread(this, "Question").start();
    }

    public void run()
    {
        for (int i = 0; i < s1.length; i++)
        {
            m.Question(s1[i]);
        }
    }
}

class T2 implements Runnable
{

    Chat m;
    String[] s2 =
    {
        "2Hello", "2Ashlam", "2gelam"
    };

    public T2(Chat m2)
    {
        this.m = m2;
        new Thread(this, "Answer").start();
    }

    public void run()
    {
        for (int i = 0; i < s2.length; i++)
        {
            m.Question(s2[i]);
        }
    }
}

class TestThread
{

    public static void main(String[] args)
    {
        Chat m = new Chat();
        new T1(m);
        new T2(m);
    }

}
