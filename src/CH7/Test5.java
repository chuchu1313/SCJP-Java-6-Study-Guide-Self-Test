package CH7;

import java.util.HashMap;
import java.util.Map;

class AccountManager{
    private Map<String,Integer> accountTotals = new HashMap<String,Integer>(); //Use generic type
    private int retirementFund;

    public int getBalance(String accountName){
        Integer total = (Integer)accountTotals.get(accountName); // can be replaced to 'Integer total = accountTotals.get(accountName);'
        if (total == null){ //Should be an object to compare with null
            total = Integer.valueOf(0);// can be replaced to 'total = 0'
        }
        return total.intValue(); // can be replaced to 'return total'
    }
    public void setBalance(String accountName, int amount) {
        accountTotals.put(accountName, Integer.valueOf(amount)); // can be replaced to 'accountTotals.put(accountName, amount);'
    }
}