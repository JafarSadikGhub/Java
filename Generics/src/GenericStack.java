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
import java.util.ArrayList;

public class GenericStack<E>
{

    private ArrayList<E> list = new ArrayList<>();

    public int getSize()
    {
        return list.size();
    }

    public E peek()
    {
        return list.get(getSize() - 1);
    }

    public void push(E o)
    {
        list.add(o);
    }

    public E pop()
    {
        E var = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return var;
    }

    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    @Override
    public String toString()
    {
        return "Stack: " + list.toString();
    }
}

class GenericMethodDemo
{

    public static void main(String[] args)
    {
        GenericStack<String> stack1 = new GenericStack<>();
        stack1.push("London");
        stack1.push("Dhaka");
        stack1.push("Tokyo");
        stack1.push("Beijing");
        System.out.println(stack1);

        GenericStack<Integer> stack2 = new GenericStack<>();
        stack2.push(1);
        stack2.push(2);
        System.out.println(stack2);
    }
}
