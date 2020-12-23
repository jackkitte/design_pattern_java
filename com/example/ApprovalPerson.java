package com.example;

public abstract class ApprovalPerson {
    private String name;

    private ApprovalPerson next;

    public ApprovalPerson(String name) {
        super();
        this.name = name;
    }

    public ApprovalPerson setNext(ApprovalPerson next) {
        this.next = next;

        return next;
    }

    public final void decision(DecisionRequest request) {
        if (judge(request)) {
            done(request);
        } else if (next != null) {
            next.decision(request);
        } else {
            fail(request);
        }
    }

    protected abstract boolean judge(DecisionRequest request);

    protected void done(DecisionRequest request) {
        System.out.println(request + " is decisioned by " + name);
    }

    protected void fail(DecisionRequest request) {
        System.out.println(request + " is not decisioned");
    }
}
