package samples;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Gleb on 07.06.2016.
 */
public class SampleTest {


    @Test (groups = {"positive"})
    public void CheckIsWork1(){
        Pen pen = new Pen (10, 1.0, "BLUE");
        Boolean work = pen.isWork();
        assert(work == true);
        System.out.println("Pen capacity " + work);
    }

    @Test (groups = {"positive"})
    public void CheckGetColor(){
        Pen pen = new Pen (10, 1.0, "BLUE");
        String color = pen.getColor();
        assert(color.equals("BLUE"));
        System.out.println("Pen's color " + color);
    }

    @Test (groups = {"positive"})
    public void CheckWrite(){
        Pen pen = new Pen (10, 1.0, "BLUE");
        String goal = "TestNG";
        String word = pen.write(goal);
        assert(word.equals(goal));
        System.out.println("You wrote " + word);
    }

    @Test (groups = {"positive"})
    public void CheckDoSomething(){
        Pen pen = new Pen (10, 1.0, "BLUE");
        pen.doSomethingElse();
        assert(1 == 1);
        System.out.println("You do something");
    }

    @Test (groups = {"negative"})
    public void CheckIsWork2(){
        Pen pen = new Pen (0, 1.0, "BLACK");
        Boolean work = pen.isWork();
        assert(work == true);
        System.out.println("Pen capacity " + work);
    }

    @Test (groups = {"negative"})
    public void CheckGetColor2(){
        Pen pen = new Pen (10, 1.0, "BLACK");
        String color = pen.getColor();
        assert(color.equals("BLACK"));
        System.out.println("Pen's color " + color);
    }

    @Test (groups = {"negative"})
    public void CheckWrite2(){
        Pen pen = new Pen (10, 1.0, "BLACK");
        String goal = "TestNG + Maven";
        String word = pen.write(goal);
        assert(word.equals(goal));
        System.out.println("You wrote " + word);
    }

    @Test (groups = {"negative"})
    public void CheckDoSomething2(){
        Pen pen = new Pen (10, 1.0, "BLUE");
        pen.doSomethingElse();
        assert(2 == 1);
        System.out.println("You don't do something");
    }


    @Test (groups = {"boundary"})
    public void CheckIsWork3(){
        Pen pen = new Pen (1, 1.0, "BLACK");
        Boolean work = pen.isWork();
        assert(work == true);
        System.out.println("Pen capacity " + work);
    }

    @Test (groups = {"boundary"})
    public void CheckGetColor3(){
        Pen pen = new Pen (10, 1.0, "BLACK");
        String color = pen.getColor();
        assert(color.equals("BLACK"));
        System.out.println("Pen's color " + color);
    }

    @Test (groups = {"boundary"})
    public void CheckWrite3(){
        Pen pen = new Pen (10, 1.0, "BLACK");
        String goal = "TestNG7890";
        String word = pen.write(goal);
        assert(word.equals(goal));
        System.out.println("You wrote " + word);
    }

    @Test (groups = {"boundary"})
    public void CheckWrite4(){
        Pen pen = new Pen (10, 1.0, "BLACK");
        String goal = "";
        String word = pen.write(goal);
        assert(word.equals(goal));
        System.out.println("You wrote " + word);
    }

}
