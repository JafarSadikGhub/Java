class Test1 {
private String str = "Test1";
public void showme(){
System.out.println(str);
}
}
class Test2 extends Test1{
private String str = "Test2";
public void showme(){
System.out.println(str);
}
}
class Test3 extends Test2 {
private String str = "Test3";
public void showme(){
System.out.println(str);
}
}
class TestDemo{
public static void main(String args[]){
Test1 t1 = new Test1();
Test2 t2 = new Test2();
Test3 t3 = new Test3();
t1 = t2;
t1.showme();
t1 = t3;
t1.showme();
t2 = t3;
t2.showme();
}
}