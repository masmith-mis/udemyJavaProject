package com.MattSmith;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {

        if(tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount >= 0 && tonerAmount <= 100){
            if(this.tonerLevel + tonerAmount > 100) {
                return -1;
                //too much toner added
            }
            //toner addition successful. This adds the current tonerLevel to the added amount.
            this.tonerLevel += tonerAmount;
            //return the new tonerLevel.
            return this.tonerLevel;

        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;

        if(duplex){
            //divide pagesToPrint by 2 - this is because it prints on both sides.
            pagesToPrint /= 2;
            System.out.println("Printing in duplex mode");
        }
        //add current pages printed to the pagesToPrint
        this.pagesPrinted += pagesToPrint;
        //return the new total of pagesPrinted.
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

}
