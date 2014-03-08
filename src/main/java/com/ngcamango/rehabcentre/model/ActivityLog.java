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
public class ActivityLog {
    private String name;
    private String surname;
    private int age;
    private String diagnosis;
    private String activity;
    
    private ActivityLog(){
        
    }
    
    private ActivityLog(Builder builder){
        name=builder.name;
        surname=builder.surname;
        age=builder.age;
        diagnosis=builder.diagnosis;
        activity=builder.activity;
    }
    
    public static class Builder
    {
        private int age;
        private String name;
        private String surname;
        private String diagnosis;
        private String activity;
        
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
        
        public Builder activity(String value){
            activity=value;
            return this;
        }
        
        public ActivityLog build()
        {
            return new ActivityLog(this);
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

    public String getActivity() {
        return activity;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 89 * hash + (this.surname != null ? this.surname.hashCode() : 0);
        hash = 89 * hash + this.age;
        hash = 89 * hash + (this.diagnosis != null ? this.diagnosis.hashCode() : 0);
        hash = 89 * hash + (this.activity != null ? this.activity.hashCode() : 0);
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
        final ActivityLog other = (ActivityLog) obj;
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
        if ((this.activity == null) ? (other.activity != null) : !this.activity.equals(other.activity)) {
            return false;
        }
        return true;
    }
    
    
}
