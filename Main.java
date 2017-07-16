public class Main {
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");
        Printer firstPrinter = new Printer(50,false);
        print(firstPrinter,firstPrinter,4,1);

        Printer secondPrinter = new Printer(0,true);
        print(secondPrinter,secondPrinter,8,2);
    }

    public static void print(Printer jobNumber, Printer getPagesPrinted,int pages,int printerId){
        System.out.printf("Pages printed was %s new total print count for printer (id:%d) is %s\n\n",jobNumber.printPage(pages),printerId,getPagesPrinted.getPagesPrinted());
    }

}
