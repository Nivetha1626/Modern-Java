public class day10exercise {


        static void main() {
            String name = "Nivetha";
            try {
                System.out.println(name.charAt(3));
                System.out.println(45/0);
            } catch(ArithmeticException e) {
                System.out.println("Arithmetic Exception");
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Index Out OfBounds Exception");
            } catch (Exception e) {
                System.out.println("Exception");
            } finally {
                System.out.println("This will always execute");

                name="Nivetha";
            }
            System.out.println("Still running");
            System.out.println("Name :"+name);


        }

    }

