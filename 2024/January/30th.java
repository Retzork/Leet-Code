class solution {
    public int evalRPN(String[] tokens) {
        List<Integer> list = new ArrayList<>();

        for (String token : tokens) {
            try {
                int elem = Integer.parseInt(token);
                list.add(elem);
            } catch (NumberFormatException e) {
                int operand2 = list.remove(list.size() - 1);
                int operand1 = list.remove(list.size() - 1);
                list.add(operate(operand1, operand2, token));
            }
        }

        return list.get(0);
    }

    public int operate(int op1, int op2, String op){
        switch (op) {
            case "-":
                return op1 - op2;
            case "*":
                return op1 * op2;
            case "/":
                return op1 / op2;
            default :
                return op1 + op2;
        }
    }
}
