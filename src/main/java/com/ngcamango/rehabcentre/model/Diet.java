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
public class Diet {
    private String name;
    private String surname;
    private int age;
    private String diagnosis;
    private String foodType;
    
    private Diet(){
        
    }
    
    private Diet(Builder builder){
        name=builder.name;
        surname=builder.surname;
        age=builder.age;
        diagnosis=builder.diagnosis;
        foodType=builder.foodType;
    }
    
    public static class Builder
    {
        private int age;
        private String name;
        private String surname;
        private String diagnosis;
        private String foodType;
        
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
        
        public Builder foodType(String value){
            foodType=value;
            return this;
        }
        
        public Diet build()
        {
            return new Diet(this);
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

    public String getFoodType() {
        return foodType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 37 * hash + (this.surname != null ? this.surname.hashCode() : 0);
        hash = 37 * hash + this.age;
        hash = 37 * hash + (this.diagnosis != null ? this.diagnosis.hashCode() : 0);
        hash = 37 * hash + (this.foodType != null ? this.foodType.hashCode() : 0);
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
        final Diet other = (Diet) obj;
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
        if ((this.foodType == null) ? (other.foodType != null) : !this.foodType.equals(other.foodType)) {
            return false;
        }
        return true;
    }
    
    
}
