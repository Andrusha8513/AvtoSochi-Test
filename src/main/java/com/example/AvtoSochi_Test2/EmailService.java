package com.example.AvtoSochi_Test2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
   @Autowired
   private JavaMailSender mailSender;
   public void sendConfirmationEmail(String to , String code){
       SimpleMailMessage message = new SimpleMailMessage();
       message.setTo(to);
       message.setSubject("Подтвержение ");
       message.setText("Text");
       mailSender.send(message);
   }

    public void sendPasswordResetCodeEmail(String to , String code){
       SimpleMailMessage message = new SimpleMailMessage();
       message.setTo(to);
       message.setSubject("Сброс пароля");
       message.setText("Ваш код сброса пароля" + code + "\n\n" +
       "Этот код истечет через 15 минут") ;
       mailSender.send(message);
    }
}