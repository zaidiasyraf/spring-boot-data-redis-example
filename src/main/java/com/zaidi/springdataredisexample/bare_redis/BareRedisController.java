package com.zaidi.springdataredisexample.bare_redis;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bare")
public class BareRedisController {

    private final RedisTemplate<String, String> redisTemplate;

    public BareRedisController(final RedisTemplate<String, String> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }
}
