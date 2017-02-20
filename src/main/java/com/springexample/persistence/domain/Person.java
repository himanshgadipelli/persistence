package com.springexample.persistence.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by bobby on 2/3/2017.
 */
public class Person {
    private Long id;
    private String firstName;
    private String lastName;
    private Set<Address> addressSet = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Address> getAddressSet() {
        return addressSet;
    }

    public void setAddressSet(Set<Address> addressSet) {
        this.addressSet = addressSet;
    }

    public void addAddress(Address address){
        address.setPerson(this);
        addressSet.add(address);
    }
}
