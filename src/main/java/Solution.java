class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveDollars = 0;
        int tenDollars = 0;

        for (int bill : bills) {
            switch(bill) {
                case 5 -> fiveDollars++;
                case 10 -> {
                    if (fiveDollars < 1) return false;
                    tenDollars++;
                    fiveDollars--;
                }
                case 20 -> {
                    if (tenDollars > 0 && fiveDollars > 0) {
                        tenDollars--;
                        fiveDollars--;
                    } else if (fiveDollars > 2) {
                        fiveDollars -= 3;
                    } else return false;
                }
            }
        }
        return true;
    }
}