public class Bills {
    public static class OneDollarBill implements BankNote {
        @Override
        public double getValue() {
            return 1.0;
        }
    }

    public static class TenDollarBill implements BankNote {
        @Override
        public double getValue() {
            return 10.0;
        }
    }

    public static class TwentyDollarBill implements BankNote {
        @Override
        public double getValue() {
            return 20.0;
        }
    }
}
