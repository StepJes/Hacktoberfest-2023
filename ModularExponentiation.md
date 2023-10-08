# Modular Exponentiation for Large Numbers

## Problem Statement

Implement `pow(x, n) % M`. In other words, given `x`, `n`, and `M`, find `(x^n) % M`.

## C++ Solution

```cpp
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
```

This C++ code defines a `Solution` class with a method `PowMod` that calculates the modular exponentiation `(x^n) % M` efficiently using the binary exponentiation technique.
