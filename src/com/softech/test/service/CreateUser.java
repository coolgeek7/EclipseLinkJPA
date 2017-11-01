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

public class CreateUser {

    public static void main(String args[]){

        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("test_PU");

//        creates a persistence unit by providing the same unique name which we provide for persistence-unit in persistent.xml file.
//        The entitymanagerfactory object will create the entitymanger instance by using createEntityManager () method.

        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();
//        The entitymanager object creates entitytransaction instance for transaction management.
//        By using entitymanager object, we can persist entities into database.

        User user = new User();
        user.setId(110);
        user.setUsername("test");
        user.setPassword("test");

        entitymanager.persist(user);
        entitymanager.getTransaction().commit();

        entitymanager.close();
        emfactory.close();

    }
}
