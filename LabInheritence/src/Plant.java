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
public class Plant 
{
   private String name;
   private String color;
   Plant(String name, String color)
   {
       this.name = name;
       this.color = color;
   }
   public String getName()
   {
       
       return this.name;
   }
   public String getColor()
   {
        return this.color;
   }
   public void setName(String name)
   {
       this.name = name;
   }
   public void setColor(String color)
   {
       this.color = color;
   }
}
class Flower extends Plant
{
    private boolean hasSmell;
    private boolean hasThorn;
    Flower(String name, String color, boolean hasSmell, boolean hasThorn)
    {
        super(name, color);
        this.hasSmell = hasSmell;
        this.hasThorn = hasThorn;
    }
    public boolean getHasSmell()
    {
        return this.hasSmell;
    }
    public boolean getHasThorn()
    {
        return this.hasThorn;
    }
    public void setHasSmell(boolean hasSmell)
    {
        this.hasSmell = hasSmell;
    }
    public void setHasThorn(boolean hasThorn)
    {
        this.hasThorn = hasThorn;
    }
}
class Herb extends Plant
{
    private boolean isMedicinal;
    private String season;
    Herb(String name, String color, boolean isMedicinal, String season)
    {
        super(name, color);
        this.isMedicinal = isMedicinal;
        this.season = season;
    }
    public void setIsMedicinal(boolean isMedicinal)
    {
        this.isMedicinal = isMedicinal;
    }
    public void setSeason(String season)
    {
        this.season = season;
    }
    public boolean getIsMedicinal()
    {
        return this.isMedicinal;
    }
    public String getSeason()
    {
        return this.season;
    }
}
class DriverMain
{
    static int count=0;
    static int arraySize;
    public static void main(String[] args)
    {
        arraySize = 5;
         
        Plant[] plants = new Plant[arraySize];
        Plant p1 = new Plant("Potato", "red");
        Plant p2 = new Plant("Mango", "green");
        Plant p3;
        p3 = new Herb("XYZ", "Green", true, "SUmmer");
        add(plants, p1);
        add(plants, p2);
        add(plants, p3);
        display(plants);
        
    }
    static void add(Plant[] plants, Plant p)
    {
        if (count<arraySize)
        {
            plants[count] = p;
        }
        count++;
    }
    
    static void remove(Plant[] plants, String n){
    for (int i = 0; i < plants.length; i++) {
       if (plants[i] != null && plants[i].getName().equals(n)){
           plants[i] = null;
         break; 
       }

       if (i == plants.length - 1) {
           System.out.println("The plant doesn't exist");
        }
    }  
    }
    static Plant search(Plant[] plants, String n)
    {
       int i;
       for( i = 0; i <plants.length; i++) {
       if (plants[i].getName().equals(n))
       break;
    }
      return plants[i];
   }
    
    static void display(Plant[] plants)
    {
        for(int i=0; i<count; i++)
        {
            System.out.println("Plant Name: " + plants[i].getName() + "\nPlant Color: " + plants[i].getColor() + "\n");
        }
    }
}