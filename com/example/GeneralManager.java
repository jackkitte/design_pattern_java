package com.example;

public class GeneralManager extends ApprovalPerson {
    private int documentTypeLimit;

    public GeneralManager(String name, int documentTypeLimit) {
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
