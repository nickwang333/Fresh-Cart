package com.nickwww.manager.service.impl;

import cn.hutool.captcha.CircleCaptcha;
import com.nickwww.manager.service.ValidateCodeService;
import com.nickwww.model.vo.system.ValidateCodeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Service
public class ValidateCodeServiceImpl implements ValidateCodeService {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;
    @Override
    public ValidateCodeVo generateValidateCode() {
        CircleCaptcha circleCaptcha = new CircleCaptcha(150, 48, 4, 2);
        String code = circleCaptcha.getCode();
        String imageBase64 = circleCaptcha.getImageBase64();

        String key = UUID.randomUUID().toString().replace("-", "");
        redisTemplate.opsForValue().set("user:validate"+key, code, 5, TimeUnit.MINUTES);

        ValidateCodeVo validateCodeVo = new ValidateCodeVo();
        validateCodeVo.setCodeKey(key);
        validateCodeVo.setCodeValue("data:image/png;base64," + imageBase64);

        return null;
    }
}
