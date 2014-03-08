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
public class Appointment {
    private String name;
    private String surname;
    private int age;
    private String relationship;
    private int hours;
    
    private Appointment(){
        
    }
    
    private Appointment(Builder builder){
        name = builder.name;
        surname = builder.surname;
        age =  builder.age;
        relationship = builder.relationship;
        hours = builder.hours;
    }
    
    public static class Builder{
        private String name;
        private String surname;
        private int age;
        private String relationship;
        private int hours;
        
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
        
        public Builder hours(int value){
            hours=value;
            return this;
        }
        
        public Appointment build()
        {
            return new Appointment(this);
        }

        public Object diagnosis(String games) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public int getHours() {
        return hours;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 97 * hash + (this.surname != null ? this.surname.hashCode() : 0);
        hash = 97 * hash + this.age;
        hash = 97 * hash + (this.relationship != null ? this.relationship.hashCode() : 0);
        hash = 97 * hash + this.hours;
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
        final Appointment other = (Appointment) obj;
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
        if (this.hours != other.hours) {
            return false;
        }
        return true;
    }
    
               
}
