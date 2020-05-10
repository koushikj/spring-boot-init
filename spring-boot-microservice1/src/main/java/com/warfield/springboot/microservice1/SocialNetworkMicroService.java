package com.warfield.springboot.microservice1;

import com.warfield.springboot.microservice1.model.SocialNetwork;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("account")
public class SocialNetworkMicroService {

    private static List<SocialNetwork> socialNetworks = List.of(
            new SocialNetwork(1,"Twitter","desc","type"),
            new SocialNetwork(2,"Facebook","desc","type")
    );

    @RequestMapping("list")
    public List<SocialNetwork> getAll(){
        return socialNetworks;
    }

    @RequestMapping("{socialId}")
    public SocialNetwork getAll(@PathVariable("socialId") int socialId){
        System.out.println("getting social account for id :"+socialId);
/*        for (SocialNetwork socialNetwork : socialNetworks) {
            if (socialNetwork.getId() == socialId) {
                return socialNetwork;
            }
        }*/
        return socialNetworks.stream().filter(socialNetwork ->
        socialNetwork.getId()==socialId).findFirst().orElse(null);
        //return new SocialNetwork();
    }
}
