package EX_05;



public class BuildMath {
    private  int numFirst, numSecond;
    public BuildMath(int numFirst, int numSecond){
        this.numFirst = numFirst;
        this.numSecond = numSecond;

    }

    public void CreateOutput(){
       String add = numFirst + " + " + numSecond + " = " + (numFirst+numSecond);
       String sub = numFirst + " - " + numSecond + " = " + (numFirst-numSecond);
       String multiply = numFirst + " * " + numSecond + " = " + (numSecond*numFirst);
       String divide = numFirst + " / " + numSecond + " = " + (numFirst/numSecond);

        System.out.printf("%s%n%s%n%s%n%s%n",add,sub,multiply,divide);
    }
}
