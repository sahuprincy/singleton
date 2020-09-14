package Test;



public class LimitClass {

    public static void main(String[] args) {

    	LimitObjectCreationTest obj1 = LimitObjectCreationTest.getLimInstance();
    	LimitObjectCreationTest obj2 = LimitObjectCreationTest.getLimInstance();
    	LimitObjectCreationTest obj3 = LimitObjectCreationTest.getLimInstance();
    	LimitObjectCreationTest obj4 = LimitObjectCreationTest.getLimInstance();
        LimitObjectCreationTest obj5 = LimitObjectCreationTest.getLimInstance();
        LimitObjectCreationTest obj6 = LimitObjectCreationTest.getLimInstance();

        System.out.println(obj1);
        System.out.println(obj2);

        System.out.println(obj3);
        System.out.println(obj4);
        System.out.println(obj5);
        System.out.println(obj6);
      }
}