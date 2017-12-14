package com.MattSmith;

public class Window {
    private int windows;

    public Window(int windows) {
        this.windows = windows;
    }

    public void adjarWindow() {
        System.out.println("Window -> You have opened the window");
    }

    public int getWindows() {
        return windows;
    }
}
