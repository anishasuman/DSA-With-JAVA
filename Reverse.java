class Reverse{
    public int reverse(int x) {
        long rev = 0; // use long to handle overflow during calculation
        
        while (x != 0) {
            int digit = x % 10;       // get last digit
            rev = rev * 10 + digit;   // add digit to reversed number
            x = x / 10;               // remove last digit
            
            // check overflow (if outside int range)
            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                return 0;
            }
        }
        
        return (int) rev; // convert back to int
    }
}