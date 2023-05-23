package com.spring.core.chap04;

import org.springframework.stereotype.Component;

// JapaneseChef를 참고해서 컨테이너에 등록시켜 주시고, 그림에도 반영해주세요
@Component("cc")
public class ChineseChef implements Chef {
    @Override
    public void cook() {
        System.out.println("중식 경력 30년 푸바오입니다.");

    }
}
