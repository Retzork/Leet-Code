class solution {
    public boolean halvesAreAlike(String s) {
        int mid = s.length() / 2;

        String a = s.substring(0, mid);
        String b = s.substring(mid);

        int good = 0;

        for(int i = 0; i < mid; i++){
            if(isVowel(a.charAt(i))){
                good++;
            }
            if(isVowel(b.charAt(i))){
                good--;
            }
        }

        return good == 0;
    }

    public boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
