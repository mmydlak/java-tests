package classes;

public class ListException{


    static class ListIsEmptyException extends Exception {
        public ListIsEmptyException() {
            super();
        }
        public ListIsEmptyException(String message) {
            super(message);
        }
    }


    static class ListIsNotInitializedException extends Exception {
        public ListIsNotInitializedException() {
            super();
        }
        public ListIsNotInitializedException(String message) {
            super(message);
        }
    }

    static class ListIsToLargeException extends Exception {
        public ListIsToLargeException() {
            super();
        }
        public ListIsToLargeException(String message) {
            super(message);
        }
    }



}
