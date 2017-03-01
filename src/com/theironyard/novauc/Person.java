package com.theironyard.novauc;

import java.util.Iterator;

/**
 * Created by JacobP on 2/17/17.
 */
public class Person {
    //variables
    int Id;
    String first_name;
    String last_name;
    String email;
    String country;
    String ip_address;
//    String users;




    public Person(int Id, String first_name, String last_name, String email, String country, String ip_address) {
        this.Id = Id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.country = country;
        this.ip_address = ip_address;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    @Override
    public String toString() {
        return String.format("%s %s from %s", first_name, last_name, country);
    }

}
