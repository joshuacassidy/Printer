public class Printer {
    private int tonerLevel,pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel > -1 && tonerLevel <= 100 ? tonerLevel : 0;
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }
    public int addToner(int tonerAmount){
        if(tonerAmount > 0 && tonerAmount <= 100){
            this.tonerLevel += tonerAmount;
            System.out.printf(this.tonerLevel + tonerAmount > 100 ? "" :"%d millilitres of toner(ink) has been added.\nThe new toner(ink) level is %d.\n",tonerAmount,this.tonerLevel);
            return this.tonerLevel;
        }
        return -1;
    }
    

    public int printPage(int pages){
        int pagesToPrint = pages;
        if( tonerLevel - pages > 0 ){
                pagesToPrint = this.duplex ? pagesToPrint/2 : pagesToPrint;
                System.out.println(this.duplex ? "Printer is now printing in duplex mode." : "Printer is now printing in simplex mode.");
            
            this.pagesPrinted += pagesToPrint;
             return pagesToPrint;
        } else{
            System.out.printf("You need to insert more toner(ink) to print %s sheets of paper.\n",pages);
            return 0;
        }
       
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
    public int getTonerLevel() {
        return tonerLevel;
    }

}
