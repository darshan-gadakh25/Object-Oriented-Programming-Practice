interface Callable {
    void makeCall(String number);
}

interface Messaging {
    void sendMessage(String number, String message);
}

interface Internet {
    void browse(String website);
}

class SmartPhone implements Callable, Messaging, Internet {
    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number);
    }

    @Override
    public void sendMessage(String number, String message) {
        System.out.println("Sending message to " + number + ": " + message);
    }

    @Override
    public void browse(String website) {
        System.out.println("Browsing website: " + website);
    }
}

public class SmartDevice {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();

        phone.makeCall("9876543210");
        phone.sendMessage("9876543210", "Hello!");
        phone.browse("www.google.com");
    }
}