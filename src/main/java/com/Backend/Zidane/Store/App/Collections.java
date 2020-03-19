package com.Backend.Zidane.Store.App;

public class Collections {
    
    private final long id;
    private final String collection;

    public Collections(long id, String collection) {
        this.id = id;
        this.collection = collection;
    }

    public long getId() {
        return id;
    }

    public String getCollection() {
        return collection;
    }
        
}
