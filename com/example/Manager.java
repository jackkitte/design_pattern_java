package com.example;

public class Manager extends ApprovalPerson {
    private int documentTypeLimit;

    public Manager(String name, int documentTypeLimit) {
        super(name);
        this.documentTypeLimit = documentTypeLimit;
    }

    @Override
    protected boolean judge(DecisionRequest request) {
        if (request.getDocumentType() <= documentTypeLimit) {
            return true;
        }

        return false;
    }
}
