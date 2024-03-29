package com.github.kirillsulm.demo;

import com.github.kirillsulim.demo.api.PingApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingApiImpl implements PingApi {

    @Override
    public String getPing() {
        return "pong";
    }
}
