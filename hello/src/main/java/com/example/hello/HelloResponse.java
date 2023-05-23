package com.example.hello;

public class HelloResponse {

    private String message;

    public HelloResponse() {
    }

    public HelloResponse(String name) {
        this.message = "Hello " + name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
