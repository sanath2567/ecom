package com.product.ecom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class DataService {

    @Autowired
    private dataRepo dataRepository;

    public List<productItem> getAllDataItems() {
        return dataRepository.findAll();
    }

    public productItem addElement(productItem dataItem) {
        return dataRepository.save(dataItem);
    }

    public Optional<productItem> getElementId(int id) {
        return dataRepository.findById(id);
    }
}
