public class Printer {
    private int tonerLevel,pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }
        else {
            this.tonerLevel = 0;
        }
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }
    public int addToner(int tonerAmount){
        if(tonerAmount > 0 && tonerAmount <= 100){
            if(this.tonerLevel + tonerAmount > 100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }
        else {
            return -1;
        }
    }

    public int printPage(int pages){
        int pagesToPrint = pages;
        if(this.duplex){
            pagesToPrint /= 2;
            System.out.println("Printing in duplex mode.");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

}
