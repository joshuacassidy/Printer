import java.util.Random;
public class Main {
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");
        Random random = new Random();
        for(int i =0; i < random.nextInt(15)+1;i++){
            Printer printer = new Printer(random.nextInt(50)+1,random.nextBoolean());
            print(printer,random.nextInt(1000)+1,random.nextInt(20)+1,random.nextInt(500)+1,random.nextBoolean(),random.nextInt(10)+1);
        }
    }

    public static void print(Printer printer,int jobNumber,int pages,int printerId,boolean addToner,int tonerLevelAdded){
        printer.addToner(addToner ? tonerLevelAdded : 0);
        System.out.printf("Job number %d: Pages printed was %s new total print count for printer (id:%d) is %s.\nThe toner(ink) level is now %d.\n\n",jobNumber,printer.printPage(pages),printerId,printer.getPagesPrinted(),printer.getTonerLevel());
    }

}
