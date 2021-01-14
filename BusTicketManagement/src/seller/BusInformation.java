/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package seller;

/**
 *
 * @author JrBcrypted
*  Md. Jafar Sadik
*  ID: 1620660042
 */
public class BusInformation
{
    private String from, to, route, busID, busName, time, fare;
    public String getFrom()
    {
        return this.from;
    }
    public String getTo()
    {
        return this.to;
    }
    public String getRoute()
    {
        return this.route;
    }
    public String getBusID()
    {
        return this.busID;
    }
    public String getBusName()
    {
        return this.busName;
    }
    public String getTime()
    {
        return this.time;
    }
    public String getFare()
    {
        return this.fare;
    }
    
    public void setFrom(String from)
    {
        this.from = from;
    }
    public void setTo(String to )
    {
        this.to = to;
    }
    public void setRoute(String route )
    {
        this.route = route;
    }
    public void setBusID(String busID)
    {
        this.busID = busID;
    }
    public void setBusName(String busName )
    {
        this.busName = busName;
    }
    public void setTime(String time )
    {
        this.time = time;
    }
    public void setFare(String fare )
    {
        this.fare = fare;
    }
  
}
