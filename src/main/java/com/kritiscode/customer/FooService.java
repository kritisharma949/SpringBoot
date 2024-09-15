package com.kritiscode;

import org.springframework.stereotype.Service;

import java.sql.SQLOutput;

@Service
public class FooService {

    private final Main.Foo foo;
    public FooService(Main.Foo foo){
        this.foo = foo;
        System.out.println();
    }
    String getFooName(){
        return foo.name();
    }

}
