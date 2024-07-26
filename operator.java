class OperatorBlocks{
static
{System.out.println("Static Block 1");}
{System.out.println("Instance block 1");}

OperatorBlocks(){System.out.println("not initialize any value for object using Constructor");
}
public static void main(String str[])
{
System.out.println("Statement in Main");
{System.out.println("Instance block 2");
}

OperatorBlocks obj=new OperatorBlocks();
//Operators

int intVar=100;
int result=1+2;
result=1-2;
result=1/2;
result=1*2;
result=7%2;

result+=intVar;   //result=result+intVar
result++;
result--;
int var1=1,var2=2;
boolean flag=(var1==var2)?true:false;
flag=(var1!=var2)?true:false;
flag=(var1>var2)?true:false;
flag=(var1<var2)?true:false;
flag=(var1>=var2)?true:false;
flag=(var1<=var2)?true:false;

flag=(var1==1)&&(var2==2)?true:false;
flag=(var1==1)||(var2==2)?true:false;

//Interger intObj=new Interger(5);
Integer intObj=Integer.valueOf(5);

System.out.println("intObj is a instance of Integer:"+(intObj instanceof Integer));



}
static{System.out.println("Static block 2");}
{System.out.println("Instance block 3");}
}