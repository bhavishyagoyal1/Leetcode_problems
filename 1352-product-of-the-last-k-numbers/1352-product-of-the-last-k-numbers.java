class ProductOfNumbers {

    private List<Integer> prefix;
    private int lastZeroIdx;

    public ProductOfNumbers() {
        prefix = new ArrayList<>();
        prefix.add(1);
        lastZeroIdx = -1;
    }
    
    public void add(int num) {
        if(num == 0){
            prefix.add(1);
            lastZeroIdx = prefix.size() - 1;
        }
        else{
            int lastProduct = prefix.get(prefix.size() - 1);
            prefix.add(lastProduct * num);
        }

    }
    
    public int getProduct(int k) {
        
        int n = prefix.size() - 1;
        if(lastZeroIdx >= n - k + 1) return 0;

        return prefix.get(n) / prefix.get(n - k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */