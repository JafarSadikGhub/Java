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
public class Address
{

    public String houseNumber, roadNumber, location;

    public Address(String houseNumber, String roadNumber, String location)
    {
        this.houseNumber = houseNumber;
        this.roadNumber = roadNumber;
        this.location = location;
    }

    public String getHouseNumber()
    {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber)
    {
        this.houseNumber = houseNumber;
    }

    public String getRoadNumber()
    {
        return roadNumber;
    }

    public void setRoadNumber(String roadNumber)
    {
        this.roadNumber = roadNumber;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    @Override
    public String toString()
    {
        return "Address{" + "houseNumber=" + houseNumber + ", roadNumber=" + roadNumber + ", location=" + location + '}';
    }

}
