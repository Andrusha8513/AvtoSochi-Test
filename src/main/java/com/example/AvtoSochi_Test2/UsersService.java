package com.example.AvtoSochi_Test2;

import org.springframework.stereotype.Service;

@Service
public class UsersService {
    private final UsersRepository usersRepository;
private final EmailService emailService;
    public UsersService(UsersRepository usersRepository,
                        EmailService emailService){
        this.usersRepository = usersRepository;
        this.emailService = emailService;
    }



}
