import java.awt.desktop.UserSessionEvent;

public class Day7 {}
    /* program 1
    static class Request {
        String name;
        String date;
        String reason;

        Request(String name, String date, String reason) {
            this.name = name;
            this.date = date;
            this.reason = reason;
        }

        void approve() {
            System.out.println("Approving Request ");
        }
        void reject() {
            System.out.println("Rejecting Request");
        }
    }
        static class LeaveRequest extends Request {

            LeaveRequest(String name, String date, String reason) {
                super(name, date, reason);
            }
            void approveLeaveRequest() {
                System.out.println("Approving leave request");
            }
            void rejectLeaveRequest() {
                System.out.println("Reject leave request");
            }
        }


    static class OnDutyRequest extends Request {

        OnDutyRequest(String name, String date, String reason) {
            super(name, date, reason);
        }
        void approveOnDutyRequest() {
            System.out.println("Approving on duty request");
        }
        void rejectOnDutyRequest() {
            System.out.println("Reject on duty request");
        }
    }

    static void main() {
        LeaveRequest leaveRequest = new LeaveRequest("nive","10-06-06","Fever");
        leaveRequest.approveLeaveRequest();
        OnDutyRequest onDutyRequest = new OnDutyRequest("nive","10-06-06","function");
        onDutyRequest.rejectOnDutyRequest();
    }
}*/
/*Program2
    static class Payment {
        String amount;

        Payment(String amount) {
            this.amount = amount;
        }

        void transfer() {
            System.out.println("Payment is  transfer");
        }
    }

    static class UpiPayment extends Payment {
        UpiPayment(String amount) {
            super(amount);
        }

        void TransferUpiPayment() {
            System.out.println("UpiPayment is Transfer");
        }
    }

    static class CardPayment extends Payment {
        CardPayment(String amount) {
            super(amount);
        }

        void TransfercardPayment() {
            System.out.println("card payment is Transfer");
        }
    }

    static class NBPayment extends Payment {
        NBPayment(String amount) {
            super(amount);
        }

        void TransferNBpayment() {
            System.out.println("NBPayment Transfer");
        }
    }


    static void main() {
        UpiPayment upiPayment = new UpiPayment("5000");
        upiPayment.TransferUpiPayment();
        CardPayment cardPayment = new CardPayment("10000");
        cardPayment.TransfercardPayment();
        NBPayment nbPayment = new NBPayment("8000");
        nbPayment.TransferNBpayment();

    }
}


 */







