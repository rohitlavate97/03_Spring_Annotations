package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot {
    @Autowired
    private Chip chip;
    public Robot(){
        System.out.println("Robot : Constructor");
    }
    public void doWork(){
        String chipType=chip.getChipType();
        if(chipType.equals("32 bit")){
            System.out.println("Robot is slow");
        }
    }
}
