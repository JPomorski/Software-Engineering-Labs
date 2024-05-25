import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BankNote> bankNotes = List.of(
                new Bills.OneDollarBill(),
                new Bills.OneDollarBill(),
                new Bills.TenDollarBill(),
                new Bills.TwentyDollarBill()
        );

        BankNoteCounter counter = new BankNoteCounter(bankNotes);
        double sum = 0.0;

        while(counter.hasNext()) {
            sum += counter.next().getValue();
        }

        counter.next();

        System.out.println("Sum: $" + sum);
    }
}