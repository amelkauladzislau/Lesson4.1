import firstpackage.ThirdClass;
import firstpackage.*;

public class Main {

    private static Shape[] generateShapes(){
        Shape[] shapes = new Shape[25];

        // Initialization
        for(int i = 0; i < shapes.length / 5; ++i){
            shapes[i] = new Cicle(5 + i);
        } // 1-5

        for(int i = shapes.length / 5; i < (2 * shapes.length / 5); ++i){
            shapes[i] = new Square(10 + i);
        } // 5-10

        for(int i = (2 * shapes.length / 5); i < (3 * shapes.length / 5); ++i){
            shapes[i] = new Rectangle(5 + i, 15 + i);
        } // 10 - 15

        // TODO: Add 2 new Shapes
        //1st shape
        for(int i = (3 * shapes.length / 5); i < (5 * shapes.length / 5); ++i){
            shapes[i] = new Triangle(5 + i, 15 + i);
        } // 15-20
        //2nd shape
        for(int i = (4 * shapes.length / 5); i < (5 * shapes.length / 5); ++i){
            shapes[i] = new Trapezoid(5 + i, 15 + i,99+i);
        } // 20-25


        return shapes;
    }

    public static void main(String[] args){
        // Calculation
        double cumulativeArea = 0;
        for(Shape shape: generateShapes()){
            cumulativeArea += shape.getArea();
        }
        System.out.println(cumulativeArea);

        ThirdClass thirdClass = new ThirdClass();
        FirstClass firstClassObj = new FirstClass();

        double calculationResult = firstClassObj.someCalculation();
        System.out.println(calculationResult);

        calculationResult = firstClassObj.someCalculation(5);
        System.out.println(calculationResult);

        String myFistObjString = firstClassObj.toString();
        System.out.println(myFistObjString);

        FirstClass firstClassObj02 = new FirstClass("New user name");
        System.out.print(firstClassObj02);
        System.out.println();

        calculationResult = firstClassObj02.simpleCalculation(1.1, 2.2);
        System.out.print(calculationResult);
        System.out.println();

        calculationResult = FirstClass.simpleCalculation(1.1, 2.2);
        System.out.print(calculationResult);

        FirstClass[] firstClassArray = new FirstClass[5];

        for(int i=0; i<firstClassArray.length; ++i){
            firstClassArray[i] = new FirstClass();
            firstClassArray[i].setName("New name");
        }

        for(FirstClass item: firstClassArray){
            if(!item.isAdult()){
                System.out.println("Alarm!");
                break;
            }
            item.setName("Add new mame");
            //System.out.print(item);
            //System.out.println();
        }

        for(FirstClass item: firstClassArray){
            System.out.print(item);
            System.out.println();
        }


        // This is a state when we are talking about initialization
        for(FirstClass item: firstClassArray){
            item = new FirstClass();
            item.setName("New name");
            System.out.println(item.someCalculation());
        }

        for(FirstClass item: firstClassArray){
            if(!item.isAdult()){
                System.out.println("Alarm!");
                break;
            }
            System.out.print(item);
            System.out.println();
        }

        String someData = "Some data string";
        someData.toLowerCase();
        someData.toUpperCase();
        System.out.println(someData);

        for (int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }

        for (String item: args){
            System.out.println(item);
        }

        String[][] string2DArray = {{"String item 1 1", "String item 1 2", "String item 1 3"},{"String item 2 1", "String item 2 2"},{"String item 3 1"}};

        for(int i = 0; i < string2DArray.length; ++i){
            for(int j = 0; j < string2DArray[i].length; ++j){
                System.out.println(string2DArray[i][j]);
                string2DArray[i][j] += " additional data";
            }
        }

        for(String[] arrayString: string2DArray){
            for(String item: arrayString){
                System.out.println(item);
                item += " new additional data";
            }
        }

        for(String[] arrayString: string2DArray){
            for(String item: arrayString){
                System.out.println(item);
            }
        }

    }
}
