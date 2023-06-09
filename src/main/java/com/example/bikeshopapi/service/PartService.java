package com.example.bikeshopapi.service;

import com.example.bikeshopapi.controller.resources.PartResource;

import java.util.List;

public interface PartService {

    List<PartResource> getAll();
    PartResource getById(Long id);
    PartResource save(PartResource part);
    PartResource update(PartResource part, Long id);
    void delete(Long id);

}
