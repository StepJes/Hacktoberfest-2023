// Modular Exponentiation for Large Numbers

// Problem Statement
// Implement `pow(x, n) % M`. In other words, given `x`, `n`, and `M`, find `(x^n) % M`.

class Solution
{
public:
    long long int PowMod(long long int x, long long int n, long long int M)
    {
        long long int res = 1;

        while (n > 0) {
            if (n & 1) {
                res = ((res) % M * (x) % M) % M;
            }
            x = ((x) % M * (x) % M) % M;
            n = n >> 1;
        }
        return res;
    }
};