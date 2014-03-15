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
public class Discharge {
    private String name;
    private String surname;
    private int age;
    private String diagnosis;
    private int weeks;
    
    private Discharge(){
        
    }
    
    private Discharge(Builder builder){
        name=builder.name;
        surname=builder.surname;
        age=builder.age;
        diagnosis=builder.diagnosis;
        weeks=builder.weeks;
    }
    
    public static class Builder
    {
        private String name;
        private String surname;
        private int age;
        private String diagnosis;
        private int weeks;
        
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
        
        public Builder weeks(int value){
            weeks=value;
            return this;
        }
        
        public Builder discharge(Discharge value){
            name=value.getName();
            surname= value.getSurname();
            age=value.getAge();
            diagnosis=value.getDiagnosis();
            weeks=value.getWeeks();
            return this;
        }
        
        public Discharge build()
        {
            return new Discharge(this);
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

    public int getWeeks() {
        return weeks;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 59 * hash + (this.surname != null ? this.surname.hashCode() : 0);
        hash = 59 * hash + this.age;
        hash = 59 * hash + (this.diagnosis != null ? this.diagnosis.hashCode() : 0);
        hash = 59 * hash + this.weeks;
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
        final Discharge other = (Discharge) obj;
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
        if (this.weeks != other.weeks) {
            return false;
        }
        return true;
    }
    
    
}
