package com.company.Task12;

public class Task12 {
    double dividing(double arg1, double arg2) throws NegParam, DivNull{
        if (arg1 < 0) throw new NegParam();
        if (arg2 < 0) throw new NegParam();
        if (arg2 == 0) throw new DivNull();
        return arg1 / arg2;
    }
    public void start(){
        double arr[][]={{4,3}, {-2,1}, {0,1}, {6, -1}, {4,0}};
        for(double d[] :arr) {
            try {
                System.out.println(dividing(d[0],d[1]));
            }catch (NegParam e){
                System.out.println("One of arguments have negative value.");
                continue;
            }catch (DivNull e){
                System.out.println("Second argument equals 0.");
                continue;
            }

        }
    }
}
