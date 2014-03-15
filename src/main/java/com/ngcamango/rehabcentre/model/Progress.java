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
public class Progress {
    private String name;
    private String surname;
    private int age;
    private String diagnosis;
    private int weeksLeft;
    private String progress;
    
    private Progress(){
        
    }
    
    private Progress(Builder builder){
        name=builder.name;
        surname=builder.surname;
        age=builder.age;
        diagnosis=builder.diagnosis;
        weeksLeft=builder.weeksLeft;
        progress=builder.progress;
    }
    
    public static class Builder
    {
        private String name;
        private String surname;
        private int age;
        private String diagnosis;
        private int weeksLeft;
        private String progress;
        
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
        
        public Builder weeksLeft(int value){
            weeksLeft=value;
            return this;
        }
        
        public Builder progress(String value){
            progress=value;
            return this;
        }
        
        public Builder progress(Progress value){
            name=value.getName();
            surname= value.getSurname();
            age=value.getAge();
            diagnosis=value.getDiagnosis();
            weeksLeft=value.getWeeksLeft();
            progress=value.getProgress();
            return this;
        }
        
        public Progress build()
        {
            return new Progress(this);
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

    public int getWeeksLeft() {
        return weeksLeft;
    }

    public String getProgress() {
        return progress;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 47 * hash + (this.surname != null ? this.surname.hashCode() : 0);
        hash = 47 * hash + this.age;
        hash = 47 * hash + (this.diagnosis != null ? this.diagnosis.hashCode() : 0);
        hash = 47 * hash + this.weeksLeft;
        hash = 47 * hash + (this.progress != null ? this.progress.hashCode() : 0);
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
        final Progress other = (Progress) obj;
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
        if (this.weeksLeft != other.weeksLeft) {
            return false;
        }
        if ((this.progress == null) ? (other.progress != null) : !this.progress.equals(other.progress)) {
            return false;
        }
        return true;
    }
    
    
}
