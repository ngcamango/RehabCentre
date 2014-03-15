/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.rehabcentre.model;

/**
 *
 * @author ngcamango
 */
public class Nurse implements Person{
    private String name;
    private String surname;
    private int age;
    private double hoursWorked;
    private double salary;
    
    private Nurse()
    {
        
    }
    
    private Nurse(Builder builder)
    {
        name=builder.name;
        surname= builder.surname;
        age=builder.age;
        hoursWorked=builder.hoursWorked;
        salary=builder.salary;
    }
    public static class Builder
    {
        private String name;
        private String surname;
        private int age;
        private double hoursWorked;
        private double salary;
        
        public Builder(double hoursWorked) {
            this.hoursWorked = hoursWorked;
        }
        
        public Builder name(String value) {
            name=value;
            return this;
         }

        public Builder surname(String value){
            surname=value;
            return this;
        }

        public Builder age(int value){
            age=value;
            return this;
        }
        
        public Builder salary(double value){
            salary=value;
            return this;
        }
        
        public Builder nurse(Nurse value){
            name = value.getName();
            surname = value.getSurname();
            age = value.getAge();
            hoursWorked = value.getHoursWorked();
            salary = value.getSalary();
            return this;
        }
        
        public Nurse build()
        {
            return new Nurse(this);
        }
    }
    
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getHoursWorked() {
        return hoursWorked;
    }
    
    public double getSalary() {
        salary = hoursWorked * 250.69;
        return salary;
    }
    
    public boolean isMinor() {
        if(age<18)
            return true;
        else
            return false;
    }
    
    public double salary(){
        return hoursWorked * 250.69; 
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 79 * hash + (this.surname != null ? this.surname.hashCode() : 0);
        hash = 79 * hash + this.age;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.hoursWorked) ^ (Double.doubleToLongBits(this.hoursWorked) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nurse other = (Nurse) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.surname == null) ? (other.surname != null) : !this.surname.equals(other.surname)) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        if (Double.doubleToLongBits(this.hoursWorked) != Double.doubleToLongBits(other.hoursWorked)) {
            return false;
        }
        return true;
    }
}
