package com.example.hestory.ui.login;

public class Story {
    private boolean seen;

    public Story(boolean seen) {
        this.seen = seen;
    }

    public boolean isSeen() {
        return seen;
    }

    public void setSeen(boolean seen) {
        this.seen = seen;
    }
}
