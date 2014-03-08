/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.rehabcentre.model;

import java.util.Objects;

/**
 *
 * @author ngcamango
 */
public final class Patient implements Person{

    private String name;
    private String surname;
    private int age;
    
    private Patient()
    {
        
    }
    
    private Patient(Builder builder)
    {
        name=builder.name;
        surname= builder.surname;
        age=builder.age;
    }
    
    public static class Builder
    {
        private String name;
        private String surname;
        private int age;
        
        public Builder(String name) {
            this.name = name;
        }

        public Builder surname(String value){
            surname=value;
            return this;
        }

        public Builder age(int value){
            age=value;
            return this;
        }
        
        public Patient build()
        {
            return new Patient(this);
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
    
    public boolean isMinor() {
        if(age<18)
            return true;
        else
            return false;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.name);
        hash = 11 * hash + Objects.hashCode(this.surname);
        hash = 11 * hash + this.age;
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
        final Patient other = (Patient) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.surname, other.surname)) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        return true;
    }
    
}
