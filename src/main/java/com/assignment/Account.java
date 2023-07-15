package com.assignment;

abstract public class Account implements Transaction{
    private long accNum;
    private String accName;
    private String address;
    private long phoneNum;
    private String dob;

    public Account(){};

    public Account(long accNum, String accName, String address, long phoneNum, String dob) {
        this.accNum = accNum;
        this.accName = accName;
        this.address = address;
        this.phoneNum = phoneNum;
        this.dob = dob;
    }

    public long getAccNum() {
        return accNum;
    }

    public void setAccNum(long accNum) {
        this.accNum = accNum;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
