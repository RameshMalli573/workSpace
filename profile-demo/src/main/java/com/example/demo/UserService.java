package com.example.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


//in order to consider this as bean u have to use tis annnotation
@Component
@Profile("qa")
public class UserService {

}
