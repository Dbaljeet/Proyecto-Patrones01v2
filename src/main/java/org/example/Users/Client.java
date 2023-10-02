package org.example.Users;

public class Client {
    private String RUT;
    private String name;
    private String address;
    private int phone;
    private String mail;

    public Client(String RUT, String name, String address, int phone, String mail){
        this.RUT = RUT;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.mail = mail;
    }
}
