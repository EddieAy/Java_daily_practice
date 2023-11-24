package BuyTicket;

public class TicketSystem {
    public static void main(String[] args) {

        Integer ticket = 6;
        Object obj = new Object();
        TicketThread ticketRunnable = new TicketThread(ticket,obj);
        Thread t1 = new Thread(ticketRunnable,"t1");
        Thread t2 = new Thread(ticketRunnable,"t2");
        Thread t3 = new Thread(ticketRunnable,"t3");
        Thread t4 = new Thread(ticketRunnable,"t4");
        Thread t5 = new Thread(ticketRunnable,"t5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}

class TicketThread implements Runnable{

    public Integer ticket;
    public Object lock;

    public TicketThread(Integer ticket, Object lock) {
        this.ticket = ticket;
        this.lock = lock;
    }

    @Override
/*    public void run() {
        synchronized (this){
            if (ticket > 0){
                System.out.println(Thread.currentThread().getName() + " have purchased ticket successfully. "+
                        --ticket + " left");
            }else {
                System.out.println("Tickets have been sold out");
            }
        }
    }*/

/*    public void run() {
        while (true){
            synchronized (this){
                if (ticket > 0){
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + " have purchased ticket successfully. "+
                            --ticket + " left");
                }else {
                    System.out.println("Tickets have been sold out" + " In fact ticket num : " +ticket);
                    break;
                }
            }
        }
    }*/


    public void run() {
        synchronized (this){
            if (ticket > 0){
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + " have purchased ticket successfully. "+
                        --ticket + " left");
            }else {
                System.out.println("Tickets have been sold out" + " In fact ticket num : " +ticket);
            }
        }
    }


}
