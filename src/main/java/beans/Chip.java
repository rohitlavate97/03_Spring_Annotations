package beans;

import org.springframework.stereotype.Component;

@Component
public class Chip {
    public Chip(){
        System.out.println("This is the Chip : Constructor");
    }
    public String getChipType(){
        return "32 bit";
    }
}
