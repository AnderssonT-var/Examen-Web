package EnvioCorreo;

import java.awt.Color;
import java.net.Authenticator;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.text.html.HTML;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.distribuida.entities.Usuario;


public class mail {

         
    	
        public  boolean envioMail(Usuario usuario) {
        	boolean enviado = false;
            try{
                String de = "eventosismac@gmail.com"; 
                String clave ="rumergwcgjivcwrc";
                String para=usuario.getCorreo();  
                String host = "smtp.gmail.com";

                Properties prop = System.getProperties();

                prop.put("mail.smtp.starttls.enable","true");
                prop.put("mail.smtp.host", host);
                prop.put("mail.smtp.user",de);
                prop.put("mail.smtp.password", clave);
                prop.put("mail.smtp.port",587);
                prop.put("mail.smtp.auth","true");

                Session sesion = Session.getDefaultInstance(prop,null);

                MimeMessage message = new MimeMessage(sesion);

                message.setFrom(new InternetAddress(de));

                message.setRecipient(Message.RecipientType.TO, new 
                InternetAddress(para));

                message.setSubject("BIENVENIDO");
                message.setText("https://form.123formbuilder.com/6398567/anos-80s");

                Transport transport = sesion.getTransport("smtp");

                transport.connect(host,de,clave);

                transport.sendMessage(message, message.getAllRecipients());

                transport.close();

                enviado = true;

            }catch(Exception e){
                e.printStackTrace();
            }

        return enviado;
        }
}
