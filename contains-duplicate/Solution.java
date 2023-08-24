class NumbersDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for(int number : nums){
            boolean isNotDuplicate = numbers.add(number);
            if(!isNotDuplicate)
                return true;
        }

        return false;
    }
}
