package exception;

import java.util.ArrayList;

public class OutOfBoundsException extends Exception{

        private ArrayList<String> messages;

    public OutOfBoundsException() {
            messages = new ArrayList<>();
        }
        public ArrayList<String> getMessages() {
            return messages;
        }
        public void addMessage(String message) {
            this.messages.add(message);
        }

        public boolean containsMessage() {
            return !this.messages.isEmpty();
        }
}
