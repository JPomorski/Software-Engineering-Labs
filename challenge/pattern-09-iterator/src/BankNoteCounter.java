import java.util.List;

public class BankNoteCounter implements Iterator {
    private final List<BankNote> bankNotes;
    private int index = 0;

    public BankNoteCounter(List<BankNote> bankNotes) {
        this.bankNotes = bankNotes;
    }

    @Override
    public boolean hasNext() {
        return index < bankNotes.size();
    }

    @Override
    public BankNote next() {
        if(hasNext()) {
            BankNote note = bankNotes.get(index);
            index++;

            return note;
        }

        System.out.println("No further elements in list");
        return null;
    }
}
