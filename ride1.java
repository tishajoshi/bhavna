
class Demo { 
    public void show(int x) 
    { 
        System.out.println("In int" + x); 
    } 
    public void show(String s) 
    { 
        System.out.println("In String" + s); 
    } 
    public void show(byte b) 
    { 
        System.out.println("In byte" + b); 
    } 
    public void show(char x)
    {   System.out.println("In char" + x);}
    public void show(boolean x)
    {   System.out.println("In bool" + x);}
} 
class UseDemo { 
    public static void main(String[] args) 
    { 
        byte a = 25; 
        Demo obj = new Demo(); 
        obj.show(a); // it will go to 
        // byte argument 
        obj.show("hello"); // String 
        obj.show(250); // Int 
        obj.show('A'); // Since char is 
        // not available, so the datatype 
        // higher than char in terms of 
        // range is int. 
        obj.show("A"); // String 
        obj.show("7.5"); 
        obj.show('1');
        obj.show(true);
} 
} 
