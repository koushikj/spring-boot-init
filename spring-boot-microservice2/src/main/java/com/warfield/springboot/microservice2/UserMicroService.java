package com.warfield.springboot.microservice2;

import com.warfield.springboot.microservice2.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserMicroService {

    private List<User> users = List.of(
            new User(100, "ko", "ko.com",1),
            new User(101, "koushik", "koushik.com",2)
    );

    @RequestMapping("list")
    public List<User> getData(){

        return users;
    }

    @RequestMapping("{userId}")
    public User getData(@PathVariable("userId") String userId){
        System.out.println("getting info for :"+userId);
/*        return users.stream().map(user -> {
            userId.equals(user.getName()))
        });*/

        return users.stream().filter(user ->
            userId.equals(user.getName())).findFirst().orElse(new User(100, userId, userId+"@newUser.com",1));
    }
}
