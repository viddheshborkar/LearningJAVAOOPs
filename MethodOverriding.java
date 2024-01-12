class Bank {

    double getRateofInterest() {
        return 2.5;
    }
}
class ICICI extends Bank {
    double getRateofInterest() {
        return 12.5;
    }
}
class SBI extends Bank {
        double getRateofInterest() {
            return 13.5;
        }
    }

    public class MethodOverriding {
        public static void main(String[] args) {

          ICICI iciciobj = new ICICI();
            System.out.println(iciciobj.getRateofInterest());

          SBI sbiobj = new SBI();
            System.out.println(sbiobj.getRateofInterest());
        }
    }
