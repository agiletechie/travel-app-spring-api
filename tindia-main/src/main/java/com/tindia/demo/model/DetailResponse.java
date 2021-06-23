package com.tindia.demo.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class DetailResponse {
    private List<DetailPlace> place;
    private List<Hotel> hotel;
    private List<Transport> transport;
    private List<Food> food;
}
