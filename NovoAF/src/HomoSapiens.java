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
public abstract class HomoSapiens
{

    private double height;
    private double weight;
    private String bloodGroup;

    public HomoSapiens(double height, double weight, String bloodGroup)
            throws InvalidHeightOrWeightException, InvalidBloodGroupException
    {
        if (height <= 0)
        {
            throw new InvalidHeightOrWeightException("Height Should be greater than zero");
        }
        if (weight <= 0)
        {
            throw new InvalidHeightOrWeightException("Height Should be greater than zero");
        }
        if (!"A+".equals(bloodGroup) && !bloodGroup.equals("A-") && !bloodGroup.equals("B+") && !bloodGroup.equals("B-") && !bloodGroup.equals("O+") && !bloodGroup.equals("O-") && !bloodGroup.equals("AB+") && !bloodGroup.equals("AB-"))
        {
            throw new InvalidBloodGroupException("Blood group is not valid!");
        }
        this.height = height;
        this.weight = weight;
        this.bloodGroup = bloodGroup;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height) throws InvalidHeightOrWeightException
    {
        this.height = height;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight) throws InvalidHeightOrWeightException
    {
        this.weight = weight;
    }

    public String getBloodGroup()
    {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup)
    {
        this.bloodGroup = bloodGroup;
    }

    @Override
    public String toString()
    {
        return "HomoSapiens{" + "height=" + height + ", weight=" + weight + ", bloodGroup=" + bloodGroup + '}';
    }

}
