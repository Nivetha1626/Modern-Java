public class interfaceexample {
    /*interface Employee{
 //        String name;
 //        int id;
 //        int salary;
 //        Empolyee(String name ,int Id,int salary) {
 //            this.name = name;
 //            this id = id;
 //            int salary = salary;
 //        }
         void solveProblem();
         void  work();
     }
 static class BankEmployee implements Employee {
         String name;
         int Id;
         int Salary;
     @Override
     public void solveProblem(){

     }
     @Override
     public void work(){

     }
     }
 static class CkeckingEmployee implements Employee{
     String name;
     int Id;
     int Salary;
     @Override
     public void solveProblem(){

     }
     @Override
     public void work(){

     }
 }
 static void main() {
     BankEmployee bankEmployee = new BankEmployee("nivetha",1010,"9000);
     bankEmployee.name();
     CheckingEmployee checkingEmpolyee = new CheckingEmployee("nivetha",1010,9000);
     checkingEmpolyee.name();
 }
 }*/
    interface Employee {
        String Name();

        String id();

        String Salary();
    }

    static class BankEmployee implements Employee {

        @Override
        public String Name() {
            return "Nive";
        }

        @Override
        public String id() {
            return "101";
        }

        @Override
        public String Salary() {
            return "50000";
        }

        public String solveprogram() {
            System.out.println("solution");
            return "solution";
        }
    }

    static class CheckingEmployee implements Employee {

        @Override
        public String Name() {
            return "Narthi";
        }

        @Override
        public String id() {
            return "102";
        }

        @Override
        public String Salary() {
            return "45000";
        }

        public String work() {
            System.out.println("process");
            return "process";
        }
    }

    public static void main(String[] args) {

        BankEmployee bank = new BankEmployee();

        System.out.println("Name : " + bank.Name());
        System.out.println("ID : " + bank.id());
        System.out.println("Salary : " + bank.Salary());
        bank.solveprogram();

        System.out.println();

        CheckingEmployee checking = new CheckingEmployee();

        System.out.println("Name : " + checking.Name());
        System.out.println("ID : " + checking.id());
        System.out.println("Salary : " + checking.Salary());
        checking.work();
    }
}
