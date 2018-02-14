package com.example.ofran.funfacts;


import java.util.Random;

class FactBook {

    private String facts[] = {
            "This is the first time South Korea has hosted the Winter Olympics. The 1988 Summer Olympics were held in Seoul, South Korea.",
            "The estimated cost of the PyeongChang Winter Olympics is $10 billion, five times less than the 2014 Sochi Olympics, which were estimated to be the costliest ever.",
            "To avoid any potential confusion with North Korea's capital, Pyongyang, the PyeongChang resort - which is just 50 miles south of the demilitarized zone that separates the two countries.",
            "The city lost by three votes to Vancouver for hosting duties in the 2010 Olympics, and by just four votes to Sochi for the 2014 event.",
            "Development of high-speed rail lines was key to the country's Olympic bid, as Pyeongchang is rather isolated. The new train lines will allow individuals to travel from Seoul to Pyeongchang in less than an hour.",
            "In total, 13 venues, split between Pyeongchang and neighboring Gangneung, will be used during the 17 days of the Games. Six new venues have been built, and additional venues have been renovated for the Games.",
            "A record 102 medals will be awarded in 15 disciplines.",
            "For the first time, viewers in all US time zones will have access to live coverage of the games, instead of a delayed replay."
    };

    String getFact(){
        Random randomGenerator = new Random();
        int randVal = randomGenerator.nextInt(facts.length);
        return facts[randVal];
    }
}
