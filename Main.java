import java.util.Random;
public class Main {
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");
        Random random = new Random();
        Printer firstPrinter = new Printer(random.nextInt(50)+1,random.nextBoolean());
        print(firstPrinter,firstPrinter,random.nextInt(20)+1,random.nextInt(500)+1);

        Printer secondPrinter = new Printer(random.nextInt(55)+1,random.nextBoolean());
        print(secondPrinter,secondPrinter,random.nextInt(22)+1,random.nextInt(10000)+502);
    }

    public static void print(Printer jobNumber, Printer getPagesPrinted,int pages,int printerId){
        System.out.printf("Pages printed was %s new total print count for printer (id:%d) is %s\n\n",jobNumber.printPage(pages),printerId,getPagesPrinted.getPagesPrinted());
    }

}
