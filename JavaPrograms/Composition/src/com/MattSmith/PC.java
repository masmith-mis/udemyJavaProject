package com.MattSmith;

public class PC {
    //PC - HAS A - Case
    private Case theCase;
    //PC - HAS A - Monitor
    private Monitor monitor;

    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    public void drawLogo() {
        //Fancy graphics here
        monitor.drawPixelAt(1200,50,"yellow");
    }
}
