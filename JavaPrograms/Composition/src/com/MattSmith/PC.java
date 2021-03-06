package com.MattSmith;

public class PC {
    //PC - HAS A - Case
    private Case theCase;
    //PC - HAS A - Monitor
    private Monitor monitor;
    //PC - HAS A - Motherboard
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

    private void drawLogo() {
        //Fancy graphics
        monitor.drawPixelAt(1200,50,"yellow");
    }
}
