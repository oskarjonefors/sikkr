package edu.chalmers.sikkr.backend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Oskar Jönefors
 */
public class SikkrContact implements Contact {

    final private String name;
    final private String id;
    final private List<String> phoneNumbers;
    final private List<String> mobilePhoneNumbers;


    public SikkrContact(final String name, final String id) {
        this.name = name;
        this.id = id;
        phoneNumbers = new ArrayList<String>();
        mobilePhoneNumbers = new ArrayList<String>();
    }

    @Override
    public String getID() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void addPhoneNumber(String number) {
        phoneNumbers.add(number);
    }

    public void addMobilePhoneNumber(String number) {
        addPhoneNumber(number);
        mobilePhoneNumbers.add(number);
    }

    @Override
    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    @Override
    public List<String> getMobilePhoneNumbers() {
        return mobilePhoneNumbers;
    }

    @Override
    public int compareTo(Contact another) {
        int compare = name.compareTo(another.getName());
        return compare == 0 ? id.compareTo(another.getID()) : compare;
    }
}