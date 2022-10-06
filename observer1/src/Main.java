public class Main {
    public static void main(String[] args) {
        System.out.println("Введите сообщение:");
        final EventSource eventSource = new EventSource();
        final ResponseHandler1 responseHandler1 = new ResponseHandler1();

        eventSource.addObserver(responseHandler1);


        Thread thread = new Thread(eventSource);
        thread.start();
    }
}