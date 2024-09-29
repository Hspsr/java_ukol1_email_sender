package utb.fai;

public class App {

    public static void main(String[] args) {
        // TODO: Implement input parameter processing
        
        try {
            String smtpserver = args[0];
            int port = Integer.parseInt(args[1]);
            String senderemail = args[2];
            String recipient = args[3];
            String subject = args[4];
            String text = args[5];

            EmailSender sender = new EmailSender(smtpserver, port);
            sender.send(senderemail, recipient, subject, text);
            sender.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
