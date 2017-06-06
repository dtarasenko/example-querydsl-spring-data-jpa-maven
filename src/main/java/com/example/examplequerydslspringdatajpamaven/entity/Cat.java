package com.example.examplequerydslspringdatajpamaven.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by dtarasenko on 6/1/2017.
 */

@Entity
@Getter @Setter
@ToString
public class Cat {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
