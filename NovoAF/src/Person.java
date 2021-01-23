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
            String cnt, String gender, int age, Address address,
            double height, double weight, String bloodGroup) throws InvalidHeightOrWeightException,
            InvalidBloodGroupException, NullDataException, InvalidNameException,
            InvalidAgeException, InvalidContactNumberException, InvalidGenderException
    {
        super(height, weight, bloodGroup);
        if (firstname.length() < 4)
        {
            throw new InvalidNameException("First name cannot be less than 4 characters!");
        }
        if (lastName.length() < 4)
        {
            throw new InvalidNameException("Last name cannot be less than 4 characters!");
        }
        if (age <= 0)
        {
            throw new InvalidAgeException("Age cannot be less than or equal to zero");
        }
        if (cnt.charAt(0) != '+' || cnt.charAt(1) != '8' || cnt.charAt(2) != '8' || cnt.charAt(3) != '0' || cnt.length() != 14)
        {
            throw new InvalidContactNumberException("Contact Number should have 14 char long,"
                    + "\nand starting 4 char should be +880");
        }
        if (!gender.equals("MALE") && !gender.equals("FEMALE"))
        {
            throw new InvalidGenderException("Gender either should have MALE or FEMALE");
        }
        if (firstname == null || lastName == null || nationalId == null || cnt == null || gender == null || String.valueOf(age) == null
                || address == null)
        {
            throw new NullDataException("One of the data maybe null!");
        }
        this.firstname = firstname;
        this.lastName = lastName;
        this.nationalId = nationalId;
        this.contactNo = cnt;
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

        String s = "============================================================================================\n"
                + "Full Name: " + firstname + " " + lastName + "\nNational ID: " + nationalId + "\nAddress: " + getAddress().getHouseNumber() + ", " + getAddress().getRoadNumber() + ", " + getAddress().getLocation()
                + "\nGender: " + gender + "\nHeight: " + super.getHeight() + "\nWeight: " + super.getWeight()
                + "\nAge:  " + age + " years" + "\nContact No: " + contactNo + "\nBlood Group: " + super.getBloodGroup()
                + "\n============================================================================================";
        return s;
    }

}
