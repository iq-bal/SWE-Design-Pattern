interface Printer {
    void print(String message);
}

class PrinterImpl implements Printer {
    @Override
    public void print(String message) {
        System.out.println("Printing: " + message);
    }
}

class PrinterDelegator implements Printer {
    private Printer delegate;

    public PrinterDelegator(Printer delegate) {
        this.delegate = delegate;
    }

    @Override
    public void print(String message) {
        delegate.print(message);
    }
}

public class Delegate {
    public static void main(String[] args) {
        Printer printer = new PrinterImpl();
        PrinterDelegator printerDelegator = new PrinterDelegator(printer);

        printerDelegator.print("Hello, World!");
        // Output: Printing: Hello, World!
    }
}
