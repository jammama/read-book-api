package com.siznorias.readbook.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Board {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    int seq;
    int memberSeq;
    String contents;


}
