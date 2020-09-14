package Test;

public class LimitObjectCreationTest {

    private static LimitObjectCreationTest limInstance;
    public static int objCount = 0;

    private LimitObjectCreationTest(){
        objCount++;
    }

    public static synchronized LimitObjectCreationTest getLimInstance(){
        if(objCount < 3 ){
            limInstance = new LimitObjectCreationTest();
        }
        return limInstance;
    }
}
