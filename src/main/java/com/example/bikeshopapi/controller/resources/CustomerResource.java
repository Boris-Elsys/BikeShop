package com.example.bikeshopapi.controller.resources;

import lombok.Data;

import java.util.List;

@Data
public class CustomerResource {
    private Long id;
    private String name;
    private List<CustomerBikeResource> customerBikes;
}
