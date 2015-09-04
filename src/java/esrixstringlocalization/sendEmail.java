/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package esrixstringlocalization;

/**
 *
 * @author trisoft-admin
 */
//public class sendEmail {


/*
public static void sendemail(String projectname) 
{
    Properties props = new Properties();
    props.put("mail.smtp.host", "smtp.esri.com");
    props.put("mail.smtp.socketFactory.port", "465");
    props.put("mail.smtp.socketFactory.class",
	"javax.net.ssl.SSLSocketFactory");
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.port", "465");
 
    Session session = Session.getDefaultInstance(props,
    new javax.mail.Authenticator() {

        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication("tsun@esri.com","");
	}
    });
 
    try {
 
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("tsun@esri.com"));
            message.setRecipients(Message.RecipientType.TO,
			InternetAddress.parse("tsun@esri.com"));
            message.setSubject("Alert, Trisoft Publication " + now());
            message.setText("Dear User," +
            "\n\nPublication file " + '"' + projectname + '"' + " is still in English." + "\n\nPlease take a look at the file and fix the issue!" + "\n\nThank you," + "\n\nTrisoft Monitor");
            Transport.send(message);
 
			//System.out.println("Done");
 
	 } catch (MessagingException e) {
		throw new RuntimeException(e);
	}
}
}
*/