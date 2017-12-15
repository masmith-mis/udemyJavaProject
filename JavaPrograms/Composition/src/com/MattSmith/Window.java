package com.MattSmith;

public class Window {
    private int windows;

    public Window(int windows) {
        this.windows = windows;
    }

    public void adjarWindow(String name) {
        System.out.println("Window -> " + name + "  has opened the window");
    }

    public int getWindows() {
        return windows;
    }
}
