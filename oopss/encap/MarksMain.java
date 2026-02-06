
public class MarksMain {
    public static void main(String[] args) {
        Marks m1=new Marks();
        Marks m2=new Marks();
        m1.setname("umesh");
        m1.setmarks(0);
        m2.setname("Rohan");
        m2.setmarks(50);

        System.out.println("the marks of "+m1.getname()+" is "+ m1.getmarks());
        System.out.println("the marks of "+m2.getname()+" is "+ m2.getmarks());


    }
    
}
