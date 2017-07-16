public class Main {
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");
        Printer firstPrinter = new Printer(50,false);
        System.out.printf("Initial page count = %s\n", firstPrinter.getPagesPrinted());
        int firstJob = firstPrinter.printPage(4);
        System.out.printf("Pages printed was %s new total print count for the printer %s\n",firstJob,firstPrinter.getPagesPrinted());

        Printer secondPrinter = new Printer(50,true);
        System.out.printf("Initial page count = %s\n", secondPrinter.getPagesPrinted());
        int secondJob = secondPrinter.printPage(8);
        System.out.printf("Pages printed was %s new total print count for the printer %s\n",secondJob,secondPrinter.getPagesPrinted());
        
    }
}
