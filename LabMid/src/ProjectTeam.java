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
public class ProjectTeam 
{
    private String teamName;
    private String Company;
    private TeamLead teamLead;
    private int numberOfMembers;
    private int unsuccessfulProject;
    private int successfulProject;
    ProjectTeam(String teamName, String Company, TeamLead teamLead, int numberOfMembers)
    {
        this.teamName = teamName;
        this.Company = Company;
        this.teamLead = teamLead;
        this.numberOfMembers = numberOfMembers;
        this.successfulProject = 0;
        this.unsuccessfulProject = 0;
    }
    public void addProjectTeamLead(TeamLead leader)
    {
        this.teamLead = leader;
    }
    public void removeProjectTeamLead()
    {
        this.teamLead = null;
    }
    public void increaseSuccessfulProject()
    {
        
        successfulProject++;
    }
    public void increaseUnsuccessfulProject()
    {
        unsuccessfulProject++;
    }
    //toString
    @Override
    public String toString()
    {
        return "[Project Team] Team Name: " + teamName + " Company: " + Company +"\nTeamLead: " + teamLead +" \n# of Members: " + numberOfMembers + " SuccessFull Proj : " + successfulProject + " Unsuccessful: " + unsuccessfulProject; 
    }
}
