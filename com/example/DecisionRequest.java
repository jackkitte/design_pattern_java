package com.example;

public class DecisionRequest {
    private String documentName;

    private int documentType;

    public DecisionRequest(String documentName, int documentType) {
        super();
        this.documentName = documentName;
        this.documentType = documentType;
    }

    public int getDocumentType() {
        return documentType;
    }

    @Override
    public String toString() {
        return "[documentName=" + documentName + ", documentType=" + documentType + "]";
    }
}
