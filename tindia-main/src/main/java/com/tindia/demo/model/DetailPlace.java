package com.tindia.demo.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "detailplace")
public class DetailPlace {
    @Id
    private int id;
    private String place_image;
    private String place_name;
    private String place_desc;
    private int belongs_to;
}
