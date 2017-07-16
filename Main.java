public class Main {
    public static void main(String[] args){
        Printer printer = new Printer(50,false);
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPage(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for the printer " + printer.getPagesPrinted());
    }
}
