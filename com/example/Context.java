package com.example;

public class Context {
    private String[] tokenArray;

    private int index = -1;

    private String currentToken;

    public Context(String json) {
        super();

        tokenArray = json.split(",");
    }

    public String getCurrentToken() {
        return this.currentToken;
    }

    public boolean hasMoreTokens() {
        boolean result = false;

        if ((index + 1) < tokenArray.length) {
            result = true;
        }

        return result;
    }

    public String nextToken() {
        currentToken = tokenArray[++index];

        return currentToken;
    }
}
