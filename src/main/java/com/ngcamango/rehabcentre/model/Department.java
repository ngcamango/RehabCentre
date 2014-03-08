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
public class Department {
    private int id;
    private String name; 
    private String description;
    private int wards;
    
    private Department(){
        
    }
    
    private Department(Builder builder){
        id = builder.id;
        name = builder.name;
        description = builder.description;
        wards = builder.wards;
    }
    
    public static class Builder{
        private int id;
        private String name; 
        private String description;
        private int wards;
        
        public Builder(int id) {
            this.id = id;
        }

        public Builder name(String value){
            name=value;
            return this;
        }
        
        public Builder description(String value){
            description=value;
            return this;
        }
        
        public Builder wards(int value){
            wards=value;
            return this;
        }
        
        public Department build()
        {
            return new Department(this);
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getWards() {
        return wards;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.id;
        hash = 23 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 23 * hash + (this.description != null ? this.description.hashCode() : 0);
        hash = 23 * hash + this.wards;
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
        final Department other = (Department) obj;
        if (this.id != other.id) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.description == null) ? (other.description != null) : !this.description.equals(other.description)) {
            return false;
        }
        if (this.wards != other.wards) {
            return false;
        }
        return true;
    }
    
    
}
