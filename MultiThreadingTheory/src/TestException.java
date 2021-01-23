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
//package com.cse.exceptions;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestException
{

    public static void main(String[] args)
    {
        try
        {
            testExceptions();
        } catch (IOException | FileNotFoundException e)
        {
            e.printStackTrace();
        }




    private static void testExceptions()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

public static void testExceptions() throws IOException,
            FileNotFoundException
    {
    }
}
