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
public class Person extends HomoSapiens
{

    private String firstname, lastName, nationalId, contactNo, gender;
    private int age;
    private Address address;

    public Person(String firstname, String lastName, String nationalId,
            String contactNo, String gender, int age, Address address,
            double height, double weight, String bloodGroup) throws NullDataException
    {
        super(height, weight, bloodGroup);
        this.firstname = firstname;
        this.lastName = lastName;
        this.nationalId = nationalId;
        this.contactNo = contactNo;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public String getFirstname()
    {
        return firstname;
    }

    public void setFirstname(String firstname) throws InvalidNameException
    {
        this.firstname = firstname;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName) throws InvalidNameException
    {
        this.lastName = lastName;
    }

    public String getNationalId()
    {
        return nationalId;
    }

    public void setNationalId(String nationalId)
    {
        this.nationalId = nationalId;
    }

    public String getContactNo()
    {
        return contactNo;
    }

    public void setContactNo(String contactNo) throws InvalidContactNumberException
    {
        this.contactNo = contactNo;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender) throws InvalidGenderException
    {
        this.gender = gender;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException
    {
        this.age = age;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

    @Override
    public String toString()
    {

        String s = "============================================================================================\n "
                + "Full Name: " + firstname + " " + lastName + "\nNational ID: " + nationalId + "\nAddress: " + getAddress().getHouseNumber() + ", " + getAddress().getRoadNumber() + ", " + getAddress().getLocation()
                + "\nGender: " + gender + "\nHeight: " + super.getHeight() + "\nWeight: " + super.getWeight()
                + "\nAge:  " + age + " years" + "\nContact No: " + contactNo + "\nBlood Group: " + super.getBloodGroup()
                + "\n============================================================================================";
        return s;
    }

}
