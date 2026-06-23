public class day14_factory {

        interface Notification {
            void send(String to, String message);


        }
        class EmailNotification implements Notification {
            @Override
            public void send(String to, String message) {
                System.out.println("Sending mail..!: " + message + ", to " + to);
            }
        }
        class WhatsappNotification implements Notification {

            @Override
            public void send(String to, String message) {
                System.out.println("Sending Whatsapp..!: " + message + ", to " + to);
            }
        }
        static Notification getNotification(day14_factory factory, String type) {
            return switch (type) {
                case "Email" -> factory.new EmailNotification();
                case "Whatsapp" -> factory.new WhatsappNotification();
                default -> throw new IllegalArgumentException("Invalid notification type: " + type);
            };
        }
        static void main() {
            day14_factory factory = new day14_factory();
            String type = "Whatsapp";
            getNotification(factory, type).send("09887654321", "Hi.! I'm Nivetha ");
        }
    }
