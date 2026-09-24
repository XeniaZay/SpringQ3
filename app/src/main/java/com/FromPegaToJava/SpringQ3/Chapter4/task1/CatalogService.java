package com.FromPegaToJava.SpringQ3.Chapter4.task1;

import org.springframework.stereotype.Service;

@Service
public class CatalogService {
    private final CatalogHttpClient client;

    public CatalogService(CatalogHttpClient client) {
        this.client = client;
    }

    public String loadProduct(String id) {
        return client.get("/products/" + id);
    }
}

