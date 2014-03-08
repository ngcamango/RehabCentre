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
public class Registration {
    private String name;
    private String surname;
    private int age;
    private String diagnosis;
    
    private Registration(){
        
    }
    
    private Registration(Builder builder){
        name=builder.name;
        surname=builder.surname;
        age=builder.age;
        diagnosis=builder.diagnosis;
    }
    
    public static class Builder
    {
        private String name;
        private String surname;
        private int age;
        private String diagnosis;
        
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
        
        public Builder diagnosis(String value){
            diagnosis=value;
            return this;
        }
        
        public Registration build()
        {
            return new Registration(this);
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

    public String getDiagnosis() {
        return diagnosis;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 97 * hash + (this.surname != null ? this.surname.hashCode() : 0);
        hash = 97 * hash + this.age;
        hash = 97 * hash + (this.diagnosis != null ? this.diagnosis.hashCode() : 0);
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
        final Registration other = (Registration) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.surname == null) ? (other.surname != null) : !this.surname.equals(other.surname)) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        if ((this.diagnosis == null) ? (other.diagnosis != null) : !this.diagnosis.equals(other.diagnosis)) {
            return false;
        }
        return true;
    }
    
    
}
