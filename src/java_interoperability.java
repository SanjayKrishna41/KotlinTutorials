import kotlin.jvm.JvmOverloads;

public class java_interoperability {

    public static void main(String args[]){
        //calling function addNumber present in kotlin file using class name
        int res = Kotlin_interoperabilityKt.addNumber(5,19);
        System.out.println("printing result of addNumber function in java code - "+res);

        int res1 = Kotlin_interoperabilityKt.findVolume(5);
        System.out.println("Area of cube - "+res1);
    }

    public static int max(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
}
