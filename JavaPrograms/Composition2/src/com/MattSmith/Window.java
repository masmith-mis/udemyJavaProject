package com.MattSmith;

public class Window {
    private String window;

    public Window(String window) {
        this.window = window;
    }

    public void openWindow() {
        System.out.println("Window.openWindow() called");
    }

    public void closeWindow() {
        System.out.println("Window.closeWindow() called");
    }

    public String getWindow() {
        return window;
    }

}
