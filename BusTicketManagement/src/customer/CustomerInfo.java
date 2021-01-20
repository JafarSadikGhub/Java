/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

/**
 *
 * @author JrBcrypted Md. Jafar Sadik ID: 1620660042
 */
//No Need
public class CustomerInfo
{

    private String customerName;
    private String contactNo;

    CustomerInfo(String customerName, String contactNo)
    {
        this.customerName = customerName;
        this.contactNo = contactNo;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public void setContactNo(String contactNo)
    {
        this.contactNo = contactNo;
    }

    public String getCustomerName()
    {
        return this.customerName;
    }

    public String getContactNo()
    {
        return this.contactNo;
    }
}
