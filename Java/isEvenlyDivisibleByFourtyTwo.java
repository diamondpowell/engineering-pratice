public boolean isEvenlyDivisibleByFourtyTwo(int num) {
    // if the remainder of num divided by 42 is 0, return true
    // otherwise return false
    if (num % 42 == 0) {
        return true;
    }
    else {
        return false;
    }
}