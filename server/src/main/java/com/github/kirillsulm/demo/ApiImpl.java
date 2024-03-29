package com.github.kirillsulm.demo;

import com.github.kirillsulim.demo.api.Api;
import com.github.kirillsulim.demo.model.AddRequest;
import com.github.kirillsulim.demo.model.AddResponse;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiImpl implements Api {

    @Override
    public AddResponse add(AddRequest body) {
        return new AddResponse(body.a() + body.b());
    }
}
