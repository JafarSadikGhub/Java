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
public class Driver 
{
    public static void main(String[] args)
            
    {
        TeamLead TL = new TeamLead("Jafar", "NSU", 24);
        //ProjectTeam PT0; 
        TeamLead TL2= new TeamLead("Jafar v2", "NSU", 25);
        
        ProjectTeam PT = new ProjectTeam("WhiteSpace", "MicroGoogle", TL, 12);
        //System.out.println(TL);
        PT.increaseSuccessfulProject();
        PT.increaseSuccessfulProject();
        System.out.println(PT);
        
        PT.increaseUnsuccessfulProject();
        System.out.println(PT);
        
        PT.removeProjectTeamLead();
        System.out.println(PT);
        PT.addProjectTeamLead(TL2);
        
        //System.out.println(TL);
        //System.out.println(PT);
    }
}
