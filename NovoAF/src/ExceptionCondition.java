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
public class ExceptionCondition extends Person
{

    public boolean isInvalidHeightOrWeight()
    {
        boolean ret = false;
        if (super.getHeight() > 0 && super.getWeight() > 0)
        {
            ret = false;
        } else
        {
            ret = true;
        }
        return ret;
    }

    public boolean isInvalidBloodGroup()
    {
        String gr = super.getBloodGroup();
        boolean ret = false;
        if (gr.equals("A+") || gr.equals("A-") || gr.equals("B+") || gr.equals("B-") || gr.equals("O+") || gr.equals("O-") || gr.equals("AB+") || gr.equals("AB-"))
        {
            ret = false;
        } else
        {
            ret = true;
        }
        return ret;
    }

    public boolean isInvalidNameException()
    {
        String fname = super.getFirstname();
        String lname = super.getLastName();
        boolean ret = false;
        if (fname.length() >= 4 && lname.length() >= 4)
        {
            ret = false;
        } else
        {
            ret = true;
        }
        return ret;

    }

    public boolean isInvalidAge()
    {
        int a = super.getAge();
        boolean ret = false;
        if (a > 0)
        {
            ret = false;
        } else
        {
            ret = true;
        }
        return ret;
    }

    public boolean isInvalidContact()
    {
        String cnt = super.getContactNo();
        boolean ret = false;
        if (cnt.charAt(0) == '+' && cnt.charAt(1) == '8' && cnt.charAt(2) == '8' && cnt.charAt(3) == '0' && cnt.length() == 14)
        {
            ret = false;
        } else
        {
            ret = true;
        }

        return ret;
    }

    public boolean isInvalidGender()
    {
        String gdr = super.getGender();
        boolean ret = false;
        if (gdr.equals("MALE") || gdr.equals("FEMALE"))
        {
            ret = false;
        } else
        {
            ret = true;
        }
        return ret;

    }

    public boolean isNullData()
    {
        boolean ret = false;
        if (super.getFirstname() != null && super.getLastName() != null && super.getNationalId() != null
                && super.getContactNo() != null && super.getGender() != null && super.getAddress() != null && super.getBloodGroup() != null)

        {
            ret = false;
        } else
        {
            ret = true;
        }
        return ret;
    }

    public ExceptionCondition(String firstname, String lastName, String nationalId, String contactNo, String gender, int age, Address address, double height, double weight, String bloodGroup) throws NullDataException
    {
        super(firstname, lastName, nationalId, contactNo, gender, age, address, height, weight, bloodGroup);
    }

}
