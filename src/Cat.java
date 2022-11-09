public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
   public Cat() {
       System.out.println("A new cat is born");

    }

    public void sayMeow() {
        System.out.println("Meow!");
    }
    //public int giveMeFive(){
     //   int result = 2+3;
     //   return result;
    //}
    public int calcSum(int firstParam, int secondParam) {
        int result = firstParam + secondParam;
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("You are going to set cat age. It must be positive");
        System.out.println("Age provided " + age);
        if(age>=0){
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }

    }
}

