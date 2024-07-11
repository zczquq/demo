package org.example.service.Impl;

import org.example.service.IHelloService;
import org.springframework.stereotype.Service;

/**
 * @author 16339
 */
@Service
public class HelloServiceImpl implements IHelloService {
    @Override
    public Object m1() {
        return "m1111";
    }
}
