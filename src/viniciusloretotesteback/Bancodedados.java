
package viniciusloretotesteback;

import java.util.ArrayList;


public class Bancodedados {
    private static ArrayList<CostumerAccount> costumeraccount;
    
    public static ArrayList<CostumerAccount> getCostumerAccount(){
        if(costumeraccount==null){
            costumeraccount = new ArrayList<>();
        }
        return costumeraccount;
    }
}
