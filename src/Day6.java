
public class Day6 {
   /*static class Car {
        String color;
        String brand;
        int speed;
        int fuel;

        Car(String color, String brand, int speed, int fuel) {
            this.color = color;
            this.brand = brand;
            this.speed = speed;
            this.fuel = fuel;
        }

        void Car(String fuel) {
            fuel += speed;
            this.speed = speed;
        }

        void expense(int expense) {
            fuel -= expense;
        }
           void accelarate(int speed) {
                      this.speed += speed;
                      //this.Speed=Speed;
           }void showfuel() {
      
                  void declarate(int speed) {
                     System.out.println("Your fuel is : " + fuel);
        }             this.speed -= speed;
                  }
        void printDetails() {
                  void refill(int fuel) {  System.out.println("color:" + color);
                      this.fuel += fuel;  System.out.println("brand:" + brand);
                  }  System.out.println("speed:" + speed);
            System.out.println("fuel:" + fuel);
        }
    }

    public static void main(String[] args) {
        Car car = new Car("black","BMW",30,100);

        car.printDetails();
        car.accelarate(500);
        car.declarate();
        car.refill(1000);
        car.printDetails();
    }
}           */


static class Student {
   String name;
   int regno;
   String department;
   int mathsMark;
   int phyMark;
   int cseMark;

   Student(String name, int regno, String department, int mathsMark, int phyMark, int cseMark) {
      this.name = name;
      this.department = department;
      this.mathsMark = mathsMark;
      this.phyMark = phyMark;
      this.cseMark = cseMark;
   }

   void printDetails() {
      System.out.println("name:" + name);
      System.out.println("regno:" + regno);
      System.out.println("department:" + department);
      System.out.println("mathsMark:" + mathsMark);
      System.out.println("phyMark:" + phyMark);
      System.out.println("cseMark:" + cseMark);
   }
}
   public static void main(String[]args){
      Student student =new Student("Nivetha",22,"cs",70,80,80);
       student.printDetails();
   }
}



