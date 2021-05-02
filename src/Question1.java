public class Question1 {

    static boolean evaluation(String string){
        char[] stack = new char[100];
        int top = -1;
        for (int i=0; i<string.length(); i++){
            top += 1;
            stack[top] = string.charAt(i);
            if (stack[top] == ')'){
                for (int j=top-1; j>=-1; j--){
                    if (j == -1){
                        return false;
                    }
                    if (stack[j] == '('){
                        top = j-1;
                        break;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(evaluation("(A+B^D)/(E-F)+G"));
    }
}
