package com.theironyard.tiyspringbootdemo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class DemoRestController {

    private Random random = new Random();

    @GetMapping("/random")
    public int getRandomNumber(@RequestParam(defaultValue = "10") int max){
        return random.nextInt(max);
    }

    @GetMapping("/luckyNumbers")
    public List<Integer> getLuckyNumbers(@RequestParam(defaultValue = "5") Integer num){
        List<Integer> luckyNumbers = new ArrayList<>();

        for(int x = 0 ; x < num ; x++){
            luckyNumbers.add(random.nextInt(1000));
        }

        return luckyNumbers;
    }
}
