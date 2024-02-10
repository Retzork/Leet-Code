class solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> numbersList = new ArrayList<>();
        String allDigits = "123456789";

        for (int length = String.valueOf(low).length(); length <= String.valueOf(high).length(); length++) {
            for (int start = 0; start <= 9 - length; start++) {
                String subString = allDigits.substring(start, start + length);
                int num = Integer.parseInt(subString);
                if (num >= low && num <= high) {
                    numbersList.add(num);
                }
            }
        }

        return numbersList;
    }
}
