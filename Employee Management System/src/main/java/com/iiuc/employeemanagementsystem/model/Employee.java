
package com.iiuc.employeemanagementsystem.model;

public class Employee {
    private Long id;
    private String name;
    private String email;
    private String designation;

    public Employee() {}

    public Employee(Long id, String name, String email, String designation) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.designation = designation;
    }

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setDesignation(String designation) 
    {
        this.designation = designation;
    }
    
    public String getDesignation() 
    {
        return designation;
    }

}
