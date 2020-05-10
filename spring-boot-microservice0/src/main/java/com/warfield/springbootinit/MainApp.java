package com.warfield.springbootinit;

import com.warfield.springbootinit.model.SocialNetwork;
import com.warfield.springbootinit.model.User;
import com.warfield.springbootinit.model.UserAccounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/user")
public class MainApp {

    @Autowired
    @Lazy
    private RestTemplate restTemplate;

    @RequestMapping("/{userId}")
    public List<UserAccounts> getInfo(@PathVariable("userId") String userId){

        User user = restTemplate.getForObject("http://localhost:8083/user/"+userId, User.class);
        System.out.println(user.getSocialAccountId());
        SocialNetwork socialNetwork = restTemplate.getForObject("http://localhost:8082/account/"+user.getSocialAccountId(), SocialNetwork.class);
        return Collections.singletonList(new UserAccounts(user,socialNetwork));
    }
}
