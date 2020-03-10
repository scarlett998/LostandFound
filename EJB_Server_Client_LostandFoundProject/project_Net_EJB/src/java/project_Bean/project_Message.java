/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_Bean;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import javax.jms.JMSDestinationDefinition;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 *
 * @author suxia
 */
@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jms/lostThing")
    ,
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class project_Message implements MessageListener {
    
    @EJB
     private JM newSessionBean;
     String description,pattern,length,color,brand,Name,email,width,address,date,useremail;
     double price;
    
    public project_Message() {
    }
    
    @Override
    public void onMessage(Message message) {
        TextMessage msg = null;
        String smessage="";
        email="suxiao20152015@163.com";
        try {
            if (message instanceof TextMessage) {
                msg = (TextMessage) message;
                smessage = msg.getText();
                System.out.println("\n******* RegMessage-MDB******** Message from SimpleQueue: Length = " + smessage.length() + "\tcontent = ******** " + smessage + " ******");
                
                String[] parts = smessage.split("\\*");
                Name=parts[0].trim();
                brand=parts[1].trim();
                color = parts[2].trim();
                length = parts[3].trim();
                width = parts[4].trim();
                pattern = parts[5].trim();
                address = parts[6].trim();
                date= parts[7].trim();
                description= parts[8].trim();
                useremail=parts[9].trim();
 
                System.out.println("the price is"+price);
                
               String emailContent="Hello,My lost stuff is:   "+Name+",\r\n it's brand is:   "+brand+".\r\n the color is:   "+color+".\r\n the length is: "+length+".\r\n the width is: "+width+".\r\n And it has pattern is: "+pattern+".\r\n as well as the found place is: "+address+".\r\n the found date is: "+date+"\r\n In addition, i want to supplement: "+description+"\r\n and my email is "+useremail + "\r\n please context me";
                newSessionBean.sendEmail(email, emailContent);
                
            } else {
               System.err.println("RegMessage-MDB!!!!!! Message of wrong type: " +  message.getClass().getName());
            }
        } catch (JMSException e) {
            e.printStackTrace();
        } catch (Throwable te) {
            te.printStackTrace();
        }
    }
    
}
