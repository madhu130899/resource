package com.example.contact.ex.contactres;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Bank_Details")
public class Bank {
    @Id
    @Column(name="acctno")
    Long account;
    @Column(name="name")
    String name;
    @Column(name="age")
    int age;
    @Column(name="phno")
    Long phoneno;
    public Long getAccount() {
        return account;
    }
    public void setAccount(Long account) {
        this.account = account;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Long getPhoneno() {
        return phoneno;
    }
    public void setPhoneno(Long phoneno) {
        this.phoneno = phoneno;
    }
    @Override
    public String toString() {
        return "Bank [account=" + account + ", name=" + name + ", age=" + age + ", phoneno=" + phoneno + "]";
    }



}
