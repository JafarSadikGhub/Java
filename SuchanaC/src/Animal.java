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
public class Animal
{
//    int a;
//    String str1;
    //Access Modifier
    //private>default>protected>public

    private String species; //homo-doggo
    private String food; //  meat
    private String type; // mammal

    //Constructor
    //getter -methods- return
    public String getSpecies()
    {
        return species;
    }

    public String getFood()
    {
        return food;
    }

    public String getType()
    {
        return type;
    }

    //Setter-method-void
    public void setSpecies(String sp)
    {
        species = sp;
    }

    public void setFood(String fd)
    {
        food = fd;
    }

    public void setType(String tp)
    {
        type = tp;
    }

//    main()
//    {
//        a=5
//        b=7
//        int total = add(5, 7);
//        printf(total)
//    }
//    int add(int x, int y)
//    {
//        int result = x + y;
//        return result;
//    }
}
