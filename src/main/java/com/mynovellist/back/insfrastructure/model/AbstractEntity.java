package com.mynovellist.back.insfrastructure.model;

//============================================{ Imports }============================================//
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import lombok.Data;
//============================================{ END Imports }============================================//

@MappedSuperclass
@Data
public class AbstractEntity {

    //--+ Primary Key +--//
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
}
