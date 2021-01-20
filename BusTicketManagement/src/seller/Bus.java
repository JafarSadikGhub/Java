/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seller;

/**
 *
 * @author Md. Jafar Sadik ID: 1620660042 Rafsina Osman Riya 1611446042
 */
public class Bus
{

    private String busID;
    private String busName;
    private String startingLocation;
    private String destination;
    private int fare;
    private String busRoute;
    private String startingTime;

    Bus(String busID, String busName, String startingLocation, String destination, int fare, String startingTime, String busRoute)
    {
        this.busID = busID;
        this.busName = busName;
        this.startingLocation = startingLocation;
        this.destination = destination;
        this.fare = fare;
        this.startingTime = startingTime;
        this.busRoute = busRoute;
    }

    public String getBusRoute()
    {
        return busRoute;
    }

    public void setBusRoute(String busRoute)
    {
        this.busRoute = busRoute;
    }

    public void setBusID(String busID)
    {
        this.busID = busID;
    }

    public void setBusName(String busName)
    {
        this.busName = busName;
    }

    public void setStartingLocation(String startingLocation)
    {
        this.startingLocation = startingLocation;
    }

    public void setDestination(String destination)
    {
        this.destination = destination;
    }

    public void setFare(int fare)
    {
        this.fare = fare;
    }

    public void setStartingTime(String startingTime)
    {
        this.startingTime = startingTime;
    }

    public String getBusID()
    {
        return this.busID;
    }

    public String getBusName()
    {
        return this.busName;
    }

    public String getStartingLocation()
    {
        return this.startingLocation;
    }

    public String getDestination()
    {
        return this.destination;
    }

    public int getFare()
    {
        return this.fare;
    }

    public String getStartingTime()
    {
        return this.startingTime;
    }
}
