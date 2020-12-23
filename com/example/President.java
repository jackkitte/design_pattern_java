package com.example;

public class President extends ApprovalPerson {
    private int documentTypeLimit;

    public President(String name, int documentTypeLimit) {
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
