

import java.util.*;

public class FancySequence {

    List<Long> l;
    long add, mult;
    long MOD = 1_000_000_007;

    public FancySequence() {
        l = new ArrayList<>();
        add = 0;
        mult = 1;
    }

    public void append(int val) {
        // store val adjusted for current mult/add
        // so that when we apply mult*x+add later, we get val back
        // val = mult * x + add => x = (val - add) * modInverse(mult)
        long x = (val - add % MOD + MOD) % MOD * modInverse(mult) % MOD;
        l.add(x);
    }

    public void addAll(int inc) {
        add = (add + inc) % MOD;
    }

    public void multAll(int m) {
        mult = mult * m % MOD;
        add = add * m % MOD;
    }

    public int getIndex(int idx) {
        if(idx >= l.size()) return -1;
        return (int)((mult * l.get(idx) % MOD + add) % MOD);
    }

    private long modInverse(long a) {
        return modPow(a, MOD - 2, MOD);
    }

    private long modPow(long base, long exp, long mod) {
        long result = 1;
        base %= mod;
        while(exp > 0) {
            if((exp & 1) == 1) result = result * base % mod;
            base = base * base % mod;
            exp >>= 1;
        }
        return result;
    }
}