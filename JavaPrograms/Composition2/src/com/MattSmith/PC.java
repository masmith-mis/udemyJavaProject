package com.MattSmith;

public class PC {
    private Motherboard motherboard;
    private Monitor monitor;
    private Case theCase;

    public PC(Motherboard motherboard, Monitor monitor, Case theCase) {
        this.motherboard = motherboard;
        this.monitor = monitor;
        this.theCase = theCase;
    }

    private void drawLogo() {
        //fancy graphics here
        monitor.drawPixelAt(1200, 50, "yellow");
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

}
