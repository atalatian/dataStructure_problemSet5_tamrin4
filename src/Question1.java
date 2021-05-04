public class Question1 {

    static boolean evaluation(String string){
        char[] stack1 = new char[100];
        char[] stack2 = new char[100];
        int top1 = -1;
        int top2 = -1;
        for (int i=0; i<string.length(); i++){
            top1 += 1;
            top2 += 1;
            stack1[top1] = string.charAt(i);
            stack2[top2] = string.charAt(string.length()-1-i); //reverse of string
            if (stack1[top1] == ')'){
                for (int j=top1-1; j>=-1; j--){
                    if (j == -1){
                        return false;
                    }
                    if (stack1[j] == '('){
                        top1 = j-1;
                        break;
                    }
                }
            }
            if (stack2[top2] == '('){
                for (int j=top2-1; j>=-1; j--){
                    if (j == -1){
                        return false;
                    }
                    if (stack2[j] == ')'){
                        top2 = j-1;
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
