class Solution {
    public int minOperations(String[] logs) {
        int depth = 0;

        for(String command : logs){
            System.out.println(command);
            if(command.equals("../")){
                depth = Math.max(depth - 1, 0);
            }else if(command.charAt(command.length() - 2) != '.'){
                depth++;
            }
        }

        return depth;
    }
}
