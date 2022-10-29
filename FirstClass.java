
public class FirstClass {

    public FirstClass(){
        name = "Default user";
        age = 18;
        salary = 1;
    }

    public FirstClass(String _userName){
        name = _userName;
        age = 18;
        salary = 2;
    }

    public FirstClass(int _age){
        name = "Default user";
        age = _age;
        salary = 2;
    }

    public FirstClass(double _salary){
        name = "Default user";
        age = 18;
        salary = _salary;

        //this.salary = salary;
    }

    public  String toString(){
        String stringInfo = "This is an example of our FirstObject class: " + name + " ";
        stringInfo += age;
        stringInfo += " ";
        stringInfo += salary;
        //stringInfo += " ";
        //stringInfo += this;
        return stringInfo;
    }

    public boolean isAdult(){
        return (age >= 18);
    }

    public boolean isRichEnought() {return (salary > 1000); }

    public boolean isNameGoodEnought() { return false;}

    public boolean isHighEducated() {return false;}

    public boolean isMilitaried() {return false;}


    public double someCalculation(){
        return age * salary;
    }

    public double someCalculation(int coefficient){
        return age * salary * coefficient;
    }

    public double someCalculation(String inputStringData){
        return age * salary * 10;
    }

    public static double simpleCalculation(double a, double b){
        return a + b;
    }

    public String getName(){
        System.out.println("getName call");

        return name;
    }

    public void setName(String _name){

        if(_name.isEmpty() || _name.isBlank()){
            System.out.println("setName call with invalid parameter");

            return;
        }

        System.out.print("setName call with parameter: ");
        System.out.print(_name);
        System.out.print(", previous name: ");
        System.out.println(name);

        name = _name;
    }

    public int getAge(){
        return age;
    }

    public double getSalary(){
        return salary;
    }

    private String name;
    private int age;
    private double salary;
}
