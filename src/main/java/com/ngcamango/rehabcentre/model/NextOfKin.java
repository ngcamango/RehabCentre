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
public class NextOfKin implements Person{
    private String name;
    private String surname;
    private int age;
    private String relationship;
    
    private NextOfKin(){
        
    }
    
    private NextOfKin(Builder builder){
        name = builder.name;
        surname = builder.surname;
        age =  builder.age;
        relationship = builder.relationship;
    } 
    
    public static class Builder{
        private String name;
        private String surname;
        private int age;
        private String relationship;
        
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
        
        public Builder relationship(String value){
            relationship=value;
            return this;
        }
        
        public NextOfKin build()
        {
            return new NextOfKin(this);
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

    public String getRelationship() {
        return relationship;
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
        hash = 37 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 37 * hash + (this.surname != null ? this.surname.hashCode() : 0);
        hash = 37 * hash + this.age;
        hash = 37 * hash + (this.relationship != null ? this.relationship.hashCode() : 0);
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
        final NextOfKin other = (NextOfKin) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.surname == null) ? (other.surname != null) : !this.surname.equals(other.surname)) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        if ((this.relationship == null) ? (other.relationship != null) : !this.relationship.equals(other.relationship)) {
            return false;
        }
        return true;
    }
    
    
}
