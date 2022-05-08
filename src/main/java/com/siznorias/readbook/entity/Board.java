package com.siznorias.readbook.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Board {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String title;
}
