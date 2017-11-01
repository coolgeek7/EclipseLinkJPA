/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.test.entity;

/**
 *
 * @author rajhe
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity     //used to make this POJO class as Entity
@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String username;
    private String password;

    public User(int id, String username, String password){
        super();
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public User(){
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }
   

}
