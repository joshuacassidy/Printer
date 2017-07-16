public class Main {
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");
        Random random = new Random();
        Printer firstPrinter = new Printer((int)(Math.random()*50),false);
        print(firstPrinter,firstPrinter,(int)(Math.random()*20),(int)(Math.random()*500));

        Printer secondPrinter = new Printer((int)(Math.random()*55),true);
        print(secondPrinter,secondPrinter,(int)(Math.random()*22),(int)(Math.random()*10000));
    }

    public static void print(Printer jobNumber, Printer getPagesPrinted,int pages,int printerId){
        System.out.printf("Pages printed was %s new total print count for printer (id:%d) is %s\n\n",jobNumber.printPage(pages),printerId,getPagesPrinted.getPagesPrinted());
    }

}
