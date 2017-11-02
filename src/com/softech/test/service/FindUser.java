/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.test.service;

import com.softech.test.entity.User;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindUser {

    public static void main(String args[]){

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test_PU");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        User user = entityManager.find(User.class,102);

        System.out.println("ID" +user.getId());
        System.out.println("Username" +user.getUsername());
        System.out.println("Password" + user.getPassword());
    }
}
